package courseExercises;

import java.util.Random;
import java.util.Scanner;

public class CourseCalculator {

    public CourseCalculator() {

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

        switch(operation) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/": System.out.println(a / b); break;
        }



        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */
        int min = 1;
        int max = 3;
        int points = 0;

        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        String clay = "Clay Block ";
        String stone = "Stone Block ";
        String cobweb = "Cobweb ";

        switch(randomBlock) {
            case 1: System.out.println(clay + "has Appeared"); break;
            case 2: System.out.println(stone + "has Appeared"); break;
            case 3: System.out.println(cobweb + "has Appeared"); break;
        }

        System.out.println("Pick a Tool to mine the block");
       String tool = scanner.next();

       if(randomBlock == 1 && tool.equals("shovel".toLowerCase())) {
           System.out.println("You mined the " + clay + "Successfully");
           points++;
       } else if(randomBlock == 2 && tool.equals("pickaxe".toLowerCase())) {
           System.out.println("You mined the " + stone + "Successfully");
           points++;
       } else if (randomBlock == 3 && tool.equals("sword".toLowerCase())) {
           System.out.println("You mined the " + cobweb + "Successfully");
           points++;
       } else {
           System.out.println("You did not use the correct tool for the job!");
       }

        int randomBlock1 = (int) (Math.random() * (max - min + 1)) + min;

        switch(randomBlock1) {
            case 1: System.out.println(clay + "has Appeared"); break;
            case 2: System.out.println(stone + "has Appeared"); break;
            case 3: System.out.println(cobweb + "has Appeared"); break;
        }

        System.out.println("Pick a Tool to mine the block");
       scanner.nextLine();
       tool.toLowerCase();

        if(randomBlock1 == 1 && tool.equals("shovel".toLowerCase())) {
            System.out.println("You mined the " + clay + "Successfully");
            points++;
        } else if(randomBlock1 == 2 && tool.equals("pickaxe".toLowerCase())) {
            System.out.println("You mined the " + stone + "Successfully");
            points++;
        } else if (randomBlock1 == 3 && tool.equals("sword".toLowerCase())) {
            System.out.println("You mined the " + cobweb + "Successfully");
            points++;
        } else {
            System.out.println("You did not use the correct tool for the job!");
        }


        int randomBlock2 = (int) (Math.random() * (max - min + 1)) + min;
        switch(randomBlock2) {
            case 1: System.out.println(clay + "has Appeared"); break;
            case 2: System.out.println(stone + "has Appeared"); break;
            case 3: System.out.println(cobweb + "has Appeared"); break;
        }

        System.out.println("Pick a Tool to mine the block");
        scanner.nextLine();
        tool.toLowerCase();

        if(randomBlock2 == 1 && tool.equals("shovel".toLowerCase())) {
            System.out.println("You mined the " + clay + "Successfully");
            points++;
        } else if(randomBlock2 == 2 && tool.equals("pickaxe".toLowerCase())) {
            System.out.println("You mined the " + stone + "Successfully");
            points++;
        } else if (randomBlock2 == 3 && tool.equals("sword".toLowerCase())) {
            System.out.println("You mined the " + cobweb + "Successfully");
            points++;
        } else {
            System.out.println("You did not use the correct tool for the job!");
        }

        int randomBlock3 = (int) (Math.random() * (max - min + 1)) + min;

        switch(randomBlock3) {
            case 1: System.out.println(clay + "has Appeared"); break;
            case 2: System.out.println(stone + "has Appeared"); break;
            case 3: System.out.println(cobweb + "has Appeared"); break;
        }

        System.out.println("Pick a Tool to mine the block");
        scanner.nextLine();
        tool.toLowerCase();

        if(randomBlock3 == 1 && tool.equals("shovel".toLowerCase())) {
            System.out.println("You mined the " + clay + "Successfully");
            points++;
        } else if(randomBlock3 == 2 && tool.equals("pickaxe".toLowerCase())) {
            System.out.println("You mined the " + stone + "Successfully");
            points++;
        } else if (randomBlock3 == 3 && tool.equals("sword".toLowerCase())) {
            System.out.println("You mined the " + cobweb + "Successfully");
            points++;
        } else {
            System.out.println("You did not use the correct tool for the job!");
        }
        System.out.println("You ended up getting: " + points + " Points!");
    }
}