import java.util.Scanner;

public class StringsAndStringMethods {

    public StringsAndStringMethods() {
        /* STRING & STRING METHODS */

        String name = "Kaupenjoe";
        String occupation = "YouTube";
        occupation += "r";

        System.out.println("My name is " + name + " and I am a " + occupation);

        String sentence = "Hello, how are you doing? Hello";
        System.out.println(sentence);

        // Upper Case & Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"are\": " + sentence.contains("are"));
        System.out.println("Does it contain \"hello\": " + sentence.contains("hello"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Hola"));

        // charAt --> Programmers start count at 0
        System.out.println(sentence.charAt(8));

        // Sentence is not modified!
        System.out.println(sentence);

        System.out.println("---------------");

        // Think back String Comparisons!
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input == "Rose") {
            System.out.println("Yep, it's Rose with ==");
        } else {
            System.out.println("Nope, it's not Rose with ==");
        }

        if (input.equals("Rose")) {
            System.out.println("Yep, it's Rose with equals");
        } else {
            System.out.println("Nope, it's not Rose with equals");
        }

        System.out.println("---------------");

        /* Note on Scanners and Strings! */
        System.out.println("What is your Full Name?");
        input = scanner.next(); // Using Next will not work!

        if (input == "Rose Kin") {
            System.out.println("Yep, it's Rose Kin with ==");
        } else {
            System.out.println("Nope, it's not Rose Kin with ==");
        }

        if (input.equals("Rose Kin")) {
            System.out.println("Yep, it's Rose Kin with equals");
        } else {
            System.out.println("Nope, it's not Rose Kin with equals");
        }

        // This doesn't work, because scanner.next() "stops" reading when it sees a space character!
        // We need to use scanner.nextLine(), BUT in order to do this,
        // the remaining input must be "cleared" by calling scanner.nextLine() again!
        System.out.println("---------------");
        scanner.nextLine();

        System.out.println("What is your Full Name?");
        input = scanner.nextLine(); // Using Next will not work! so we use .nextLine

        if (input == "Rose Kin") {
            System.out.println("Yep, it's Rose Kin with ==");
        } else {
            System.out.println("Nope, it's not Rose Kin with ==");
        }

        if (input.equals("Rose Kin")) {
            System.out.println("Yep, it's Rose Kin with equals");
        } else {
            System.out.println("Nope, it's not Rose Kin with equals");


            // Reminder for future me Do a exercise or two 20/11/26 9:48 PM

        }
    }
}

