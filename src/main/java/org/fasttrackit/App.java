package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Calculator calculator = new Calculator();
        System.out.println( calculator.sum(2,4));

        System.out.println( calculator.subtract(5,3));

        System.out.println( calculator.multiply( 7,8) );
        System.out.println(calculator.divide(0, 9 ));

    }


}
