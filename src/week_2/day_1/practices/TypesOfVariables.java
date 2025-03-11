package week_2.day_1.practices;

public class TypesOfVariables {

    String firstName = "Alexander"; // Instance variable
    static String lastName = "Bob"; // Class level variable

    public static void main(String[] args) { // Start block of main method

        int score = 123; // Local variable

        System.out.println(score);
        System.out.println(score);

        TypesOfVariables obj = new TypesOfVariables();

        System.out.println(obj.firstName);

        System.out.println( lastName );

        obj.print();

    } // Ends the block of the main method /*

    // System.out.println(score); // score cannot be accessed out side of the main method

       void print() {
        System.out.println();
        System.out.println( lastName );
    }


}
