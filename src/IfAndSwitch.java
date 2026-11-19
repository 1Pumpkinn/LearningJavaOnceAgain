import java.util.Scanner;

public class IfAndSwitch {

    public IfAndSwitch() {

        // CONTROL FLOW (IF & SWITCH) */
        // control flow of the program.


        Scanner scanner = new Scanner(System.in);
        System.out.println("How much health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if(isAlive) {
            System.out.println("Player is alive with: " + health + " HP");
        } else {
            System.out.println("Player has died");
        }


        System.out.println("How many points did you have in the Exam");
        int points = scanner.nextInt();

        if(points >= 100) {
            // Points bigger or equal to 100
            System.out.println("Passed with Honors");
        } else if (points >= 50) {
            // Points between 50 and 99
            System.out.println("Passed the Exam");
        } else {
            // Points below 50
            System.out.println("You failed the Exam");
        }

        /* SWITCH */
        // for explicit action for cases

        System.out.println("Give me a number between 0 and 5...");
        int studentId = scanner.nextInt();
        switch(studentId) {
            case 0: System.out.println("Student 0 has ID 0"); break;
            case 1: System.out.println("Student 1 has ID 1"); break;
            case 2: System.out.println("Student 2 has ID 2"); break;
            case 3: System.out.println("Student 3 has ID 3"); break;
            case 4: System.out.println("Student 4 has ID 4"); break;
            case 5: System.out.println("Student 5 has ID 5"); break;
            default: System.out.println("Student with " + studentId + " was not found"); break;
        }

        // random mining exercise

        System.out.println("Do you have a Pickaxe? true or false");
        boolean hasPickaxe = scanner.nextBoolean();
        System.out.println("What durability is your Pickaxe on?");
        int durability = scanner.nextInt();
        int neededDurability = 9;
        System.out.println("Are you in Creative, true or false");
        boolean isCreative = scanner.nextBoolean();

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability));

        if(isCreative) {
            System.out.println("You mined every block with ease");
        } else if(canMine3x3Area) {
            System.out.println("You mined a 3x3 area");
        } else {
            System.out.println("Your Pickaxe Has Broke");
        }


        // Switch exercise <do this later please and thank you> 19/11/26



    }
}
