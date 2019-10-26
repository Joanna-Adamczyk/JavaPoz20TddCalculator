package pl.jnowacki;

import org.junit.*;

import static org.junit.Assert.*;
//IMPORT STATIC - bez nazwy klasy, czyli Assert.assertEquals, tylko od razu assertEquals

public class CalculatorImplTest {

    private static CalculatorImpl calculator;

    @BeforeClass
    public static void setUp() {
        System.out.println("BeforeClass");
        calculator = new CalculatorImpl(); //żeby nie powtarzać tej linijki kodu w jednym i drugim teście
    }

    @AfterClass
    public static void tearDown() { //żeby wyczyścić środowisko, więc trzeba dać tu clear()
        System.out.println("AfterClass");
        calculator.clear();
    }

    @After
    public void tearDownAfterMethod() {
        System.out.println("After");
    }

    @Before
    public void setUpBeforeMethod(){
        System.out.println("Before");
    }

    @Test
    public void shouldDisplayValuesOfMultipleNumbersPressed() {
        System.out.println("Metoda 1");

        //when
        calculator.pressNumber(5);
        calculator.pressNumber(3);
        calculator.pressNumber(7);

        //then
        assertEquals("537", calculator.display());
    }

    @Test
    public void shouldClearDisplay() {
        System.out.println("Metoda 2");
        //given
        //CalculatorImpl calculator = new CalculatorImpl();

        //when
        calculator.pressNumber(5);
        assertEquals("5", calculator.display());
        calculator.clear();

        assertTrue(calculator.display().isEmpty());
    }
}
