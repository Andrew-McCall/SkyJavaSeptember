import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 // Car Class
        //  - colour
        //  - reg
        //  - model
        //  - make
        //  - miles
        //  + increaseMiles
        //  + Other Getters and Setters

        // 2 // Driver Class
        //  - Car
        //  + Drive(miles)
        //  + Car Setter and Getter

        // 3 // Instantiate the Car and Driver. Test the methods

        // Extension
        // 4 // Position Class (double x, double y)
        // 5 // Give Car a position which is edited by drive
        // 6 // ToString, Equals, HashCode

        Car c1 = new Car("Black", "ABC", "Leaf", "Nissan", 45233);
        Car c2 = new Car("DFE");

        System.out.println(c1.getMiles());
        System.out.println(c2.getMiles());

    }
}