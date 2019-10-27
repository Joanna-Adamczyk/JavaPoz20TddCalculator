package pl.jnowacki;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExercisesTest {

    @Test
    public void fiveShouldBeGreaterThanThree() {
        assertThat(5, is(greaterThan(3)));
    }

    @Test
    public void emptyStringShouldBeEmpty() {
        assertThat("", isEmptyOrNullString());
    }

    @Test
    public void checkingString() {
        String value = "afdsfdsfdsfaqwtjjfvvjfyu";
        assertThat(value, not(containsString("konfabulacja")));
    }

    @Test
    public void matrixCheckingValues() {
        Integer[] array = {5,7,2};
        assertThat(array, arrayContaining(5,7,2));
    }

    @Test
    public void matrixCheckingValuesRandomOrder() {
        Integer[] array = {5,7,2};
        assertThat(array, arrayContainingInAnyOrder(5,7,2));
    }

    @Test
    public void matrix3() {
        String[] list = {"raz", "dwa", "trzy"};
        assertThat(list, arrayWithSize(3));
        assertThat(list, hasItemInArray("dwa"));
        }

    @Test
    public void shouldBeginWithA() {
        String testedValue = "aString";

        assertThat(testedValue, beginsWith(is('a')));
    }

    private static Matcher<String> beginsWith(Matcher<? super Character> matcher) {
        return new FeatureMatcher<String, Character>(matcher, "a String that begins with", "first letter") {
            @Override
            protected Character featureValueOf(String actual) {
                return actual.charAt(0);
            }
        };
    }
}