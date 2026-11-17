public class AssignmentOperators {

    public AssignmentOperators() {

        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);

        int x = 1000;
        System.out.println("X is: " + x);
        x = mana;
        System.out.println("X is now: " + x);
        mana = x;

        // ADDITION +=
        System.out.println("--- Addition ---");
        mana += 20; // mana = mana + 20; just adding 20 to mana itself
        System.out.println("Mana: " + mana);
        mana++; // mana = mana + 1 just adds 1 to mana itself this is called INCREMENTING
        System.out.println("Mana: " + mana);


        // SUBTRACTION -=
        System.out.println("--- Subtract ---");
        mana--; // mana = mana -1 just subtracts 1 to mana itself this is called DECREMENTING
        System.out.println("Mana: " + mana);
        mana -= 60; // mana = mana - 60;
        System.out.println("Mana: " + mana);


        // MULTIPLY *=
        System.out.println("--- Multiply ---");
        mana *= 2;
        System.out.println("Mana: " + mana);


        // DIVIDE /=
        System.out.println("--- Divide ---");
        mana /= 4;
        System.out.println("Mana: " + mana);


        // MODULO (REMAINDER OPERATOR) %=
        System.out.println("--- Modulo ---");
        mana %= 2;
        System.out.println("Mana: " + mana);

        System.out.println("--------------");


    }
}
