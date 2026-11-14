import java.util.Scanner;

public class JavaInAndOut {

    public JavaInAndOut() {

        // INPUT AND OUTPUT

        // Output
        // You (usually) output Strings

        System.out.println("Hello World this is an Output!");

        // Values
        int life = 42;
        System.out.println(life);

        // Value and String
        int grade = 85;
        System.out.println("Your Grade is " + grade);

        // INPUT

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number any Number");
        int number = scanner.nextInt(); // has to be a number
        System.out.println("Your Number isss... " + number + "!");

    }
}
