import java.util.Scanner;

public class Booleans {

    public Booleans() {

        /* BOOLEANS & LOGIC */

        // Booleans are either true or false

        boolean luxintrusIsAmazing = true;
        boolean contentSmpFinaleReleased = false;
        System.out.println("Is luxintrus amazing? " + luxintrusIsAmazing);

        boolean isCreative = false;
        System.out.println("Player is in Creative Mode: " + isCreative);


        /* COMPARISON */

        // <   smaller than
        // <=  smaller than or equals
        // >   bigger than
        // >=  bigger than or equals
        // ==  equals
        // !=  not equals

        int points = 80;
        int pointsForPasting = 55;
        boolean hasPassedTest = points >= pointsForPasting;
        System.out.println("Has passed test: " + hasPassedTest);


        int health = 10;
        boolean isAlive = health > 0; // health = 1 -> TRUE, health = 0 -> FALSE
        System.out.println("Is player Rose still alive: " + isAlive);

        // VARIABLE/VALUE comparison VARIABLE/VALUE = BOOLEAN
        // (compare with math: int + int = int)

        // BEWARE of Strings: use .equals(), not ==
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next().toLowerCase();
        // boolean isRose = name == "Rose"; // WRONG for Strings
        boolean isRose = name.equals("rose"); // RIGHT: .equals

        System.out.println("Is your name Rose? " + isRose);


        /* LOGIC */

        // "Addition" and "subtraction" for booleans
        // (not exactly, but you can think of it like this)
        //
        // BOOLEAN logic BOOLEAN = BOOLEAN
        //
        // (1 = true, 0 = false)


        // OR  ( || )
        // True if AT LEAST ONE side is true.
        // Only false when BOTH are false.
        //
        //   a | b | a || b
        //  ---+---+--------
        //   0 | 0 |   0
        //   1 | 0 |   1
        //   0 | 1 |   1
        //   1 | 1 |   1


        // AND  ( && )
        // True only if BOTH sides are true.
        // False if EITHER one is false.
        //
        //   a | b | a && b
        //  ---+---+--------
        //   0 | 0 |   0
        //   1 | 0 |   0
        //   0 | 1 |   0
        //   1 | 1 |   1


        // NOT  ( ! )
        // Flips the value: true becomes false, false becomes true.
        //
        //   a | !a
        //  ---+----
        //   0 |  1
        //   1 |  0


        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2;

        // Mining Example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability) || isCreative);



        // Drinking Age Example

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Europe");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;
        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;


        boolean canPersonDrinkAlcoholShorter = (!isEuropean && age >= usDrinkingAge || age >= euDrinkingAge);
        System.out.println("You can drink alcohol " + canPersonDrinkAlcoholShorter);


        boolean canPersonDrinkAlcohol = (isEuropean && euDrinkingAge >= 18 || !isEuropean && age >= usDrinkingAge);
        System.out.println("You can drink alcohol " + canPersonDrinkAlcohol);


        // Kaupenjoes shorten version
        boolean canPersonDrinkAlcoholKaupenjoeVersion = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.println("You can drink alcohol " + canPersonDrinkAlcoholKaupenjoeVersion);

























        /* MY LITTLE LEARNING EXERCISE */
        // (something I wanted to do to test myself)

        System.out.println("How many points did you get on the test?");
        points = scanner.nextInt();
        if (points >= pointsForPasting) {
            System.out.println("You have passed the test with: " + points + " points!");
        } else {
            System.out.println("Nice try but you did not get enough answers right to complete the test: " + points + " points");
        }

    }
}