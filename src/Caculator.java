import java.util.Scanner;

public class Caculator {

    public Caculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scanner.nextInt();
        System.out.println("Enter a Second Number");
        int b = scanner.nextInt();

        // get Assignment Operators through a scanner ask the user what they wanna use plus minus etc and assign it to the integers

        System.out.println("Enter a Assignment Operator: +, -, *, /");
        switch(scanner.next()) {
            case "+": System.out.println("Output: " + a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/": System.out.println(a / b); break;
        }
    }
}
