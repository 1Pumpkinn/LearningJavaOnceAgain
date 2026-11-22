package courseExercises;

import java.util.Scanner;

public class FirstCalcExercise {

    public FirstCalcExercise() {

        /* EXERCISE 1a: Easy Calculator
         *
         * Create a Calculator that runs once.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * REMEMBER: that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something"); and not ==
         *
         * After the result has been output the program ends!
         * Estimated Time: 30-45 minutes
         *
         */

        Scanner scanner = new Scanner(System.in);


        System.out.println("what math operator do you want to use e.g: +, -, * and /");
        String operation = scanner.next();
        System.out.println("First Number");
        int a = scanner.nextInt();
        System.out.println("Second Number");
        int b = scanner.nextInt();

        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("ERROR: Something unexpected happened!");
                break;
        }
    }
}