package pl.jnowacki;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


//feature matcher
public class NumberWrapper {
    public int getNumber() {
        return 15;
    }

    @Test
    public void shouldReturnRightNumber() {
        NumberWrapper wrapper = new NumberWrapper();
        assertThat(wrapper, returnsRightNumber(is(15)));
    }
    public static Matcher<NumberWrapper> returnsRightNumber(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<NumberWrapper, Integer>(matcher, "a wrapper that returns", "returned value") {
            @Override
            protected Integer featureValueOf(NumberWrapper actual) {
                return actual.getNumber();
            }
        };
    }
}

