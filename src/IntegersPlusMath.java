import java.util.Random;

public class IntegersPlusMath {

    public IntegersPlusMath() {

        int a = 100;
        int b = 200;

        /* ADDITION */
        int sum = a + b;
        System.out.println("Sum: " + sum);

        sum = 50;
        System.out.println("Sum: " + sum);


        /* SUBTRACTION */
        int sub = a - b;
        System.out.println("Subtraction: " + sub);


        /* MULTIPLICATION */
        int multi = a * b;
        System.out.println("Multiplication: " + multi);


        /* DIVISION */
        int division = a / b;
        System.out.println("Division: " + division);

        double x = 100;
        double y = 200;
        double doubleDivision = x /y;
        System.out.println("Double Division: " + doubleDivision);

        // No Divide by Zeerrroo

        /* Remainer (MODULO) */
        int remainder = 100 % 2; // takes 100 divides it by 2 and then looks if anything remains
        System.out.println("Remaning from 100 / 2: " + remainder);

        int remainder1 = 100 % 3;
        System.out.println("Remaning from 100 / 3: " + remainder1);
        int remainder2 = 100 % 4;
        System.out.println("Remaning from 100 / 4: " + remainder2);

        remainder = 457 % 2;
        System.out.println("Remaning from 457 / 2: " + remainder);

        /* MATH Methods */

        float mathNumber = 50.5f;
        System.out.println("Rounding " + Math.round(mathNumber));
        System.out.println("Rounding Down " + Math.floor(mathNumber));
        System.out.println("Rounding Up " + Math.ceil(mathNumber));
        System.out.println("Exponent " + Math.pow(2, 3)); // 2^3

        System.out.println(Math.min(1.4, 1.7 ) + " is smaller"); // gets the smallest value
        System.out.println(Math.max(1.4, 1.7 ) + " is bigger");  // gets the biggest value

        System.out.println(Math.sqrt(5.5)); // sqaure root or sumtihng...

        System.out.println("Random Number between 0 - 10: " + Math.round(Math.random() * 10));
        System.out.println("Random Number between 0 - 10: " + (Math.random() * 10));


    }
}
