import java.util.Scanner;

public class TernaryOperators {

    public TernaryOperators() {

        /* TERNARY OPERATOR */
        // a compact way to do if-else


        int health = 0;
        String status = "";
        System.out.println("What is your status? " + status);

        if(health > 0) {
            status = "Alive";
        } else {
            status = "DEAD";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        // TERNARY OPERATOR
        // BOOLEAN ? TRUE_RETURN : FALSE_RETURN;
        status = (health > 0) ? "Alive" : "DEAD";
        System.out.println("What is your Status? " + status);



        // Exercise
        System.out.println("How much mana do you have?");
        Scanner scanner = new Scanner(System.in);
        int mana = scanner.nextInt();
        String manaStatus = "";


        manaStatus = (mana > 49) ? "Has enough Mana to cast Ability1" : "Does not have enough Mana to cast Ability1";
        System.out.println(manaStatus);


        System.out.println("How much money does the Player have?");
        int points = scanner.nextInt();
        String hasEnough = "";
        hasEnough = (points >= 5) ? "Player has enough to buy this item" : "Player is too poor, get money...";
        System.out.println(hasEnough);


    }
}
