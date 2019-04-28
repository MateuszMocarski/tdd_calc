package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Calculator.
 */
public class CalculatorTest
{
    /**
     * Rigorous Test :-)
     */

    Calculator testCalc = new Calculator();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sumTest(){
        assertEquals(5, testCalc.sum(2,3), 0.1);
    }

    @Test
    public void subtractTest(){
        assertEquals(2, testCalc.subtract(5,3), 0.01);
    }

    @Test
    public void multiplyTest(){
        assertEquals(42, testCalc.multiply(6,7), 0.01);
    }

    @Test
    public void divideTest(){
        assertEquals(5, testCalc.divide(15,3), 0.01);
    }

    @Test
    public void avgTest(){
        int [] tablica = {2,4,6,8,5};
        assertEquals(5, testCalc.avg(tablica), 0.01);
    }

    @Test
    public void mainTest(){
        testCalc.main(new String[]{"asd", "asdqwe"});
    }
}
