package pl.jnowacki;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorParamTestByConstr {

    private int a;
    private int b;
    private String result;

    public CalculatorParamTestByConstr(int a, int b, String result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}: testDiv({0}/{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 2, "2"},
                {8, 4, "2"},
                {10, 0, "0"}
        });
    }

    //@Test
    //public void testAdd(){
        //CalculatorImpl calculator = new CalculatorImpl();
        //calculator.add(a, b);

        //assertEquals(result, calculator.display());
    //}

    //@Test
    //public void testSub() {
        //CalculatorImpl calculator = new CalculatorImpl();
        //calculator.sub(a,b);

        //assertEquals(result, calculator.display());
   //}

    @Test
    public void testMulti() {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.multi(a,b);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new CalculatorImpl();
        calculator.div(a,b);
    }

}

