package org.fasttrackit;

public class Calculator {

    public int sum(int number1, int number2) {

        System.out.println(" calculating the sum of " + number1 + " and " + number2);
        return number1 + number2;

    }

    public int subtract(int number1, int number2) {
        System.out.println(" subtracting " + number1 + " and " + number2);
        return number1 - number2;
    }

    public int multiply( int number1, int number2 ){
        System.out.println(" multiplying " + number1 + " with " + number2) ;
        return number1 * number2 ;


    }

    public int divide(int number1, int number2 ){
        System.out.println(" dividing " + number1 + " with " + number2);
        return number1 / number2;
    }
}
