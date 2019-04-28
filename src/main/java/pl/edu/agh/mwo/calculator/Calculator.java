package pl.edu.agh.mwo.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public static void main( String[] args )
    {

    }


    public double sum(double i, double i1) {
        return i + i1;
    }

    public double subtract(double i, double i1) {
        return i-i1;
    }

    public double multiply(double i, double i1) {
        return i*i1;
    }

    public double divide(double i, double i1) {
        return i/i1;
    }

    public double avg(int... tablica) {
        int sum = 0;
        double avg;
        for(int a: tablica){
            sum += a;
        }
        return avg = sum/tablica.length;

    }
}
