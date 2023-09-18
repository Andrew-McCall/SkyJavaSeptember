import java.util.Scanner;

public class Main { // Everything secretly inherts from Object
    public static void main(String[] args) {

        // Part 2
        // Car Parent Class
        // 1 // Create two child classes that extend Car: Supercar, Convertible
        // 2 // Give the two classes unique behaviour
        /// Extension - BREAK POLYMORPHISM
        // 3 // Driver treat the child classes differently - use the sunroof. put super can in sport mode


        Car c1 = new Car("Black", "ABC", "Leaf", "Nissan", 45233);
        Driver driver = new Driver();
        driver.SetCar(c1);

        System.out.println(driver.DriveCar(97));

        Convertible con1 = new Convertible("Hot Pink", "ABC", "Micra", "Nissan", 43);
        driver.SetCar(con1);

        System.out.println(con1.GetIsRoofDown());     // false
        System.out.println(driver.DriveCar(17)); // 60 - also changed the sunroof
        System.out.println(con1.GetIsRoofDown());     // true
        System.out.println(driver.DriveCar(17)); // 77
        System.out.println(con1.GetIsRoofDown());     // true

//        Main m = new Main();
//        System.out.println(m.toString());
//        System.out.println(((Object) m).toString());

        // Length cannot be change
        int[] myNumbers = new int[5];

        myNumbers[0] = -1;
        myNumbers[2] = 523;

                // Arrays start a 0!
        for (int i = 0; i < myNumbers.length; i++){
            System.out.println( myNumbers[i] );
        }

        Car[] Garage = new Car[65]; // All equal null;
        Car[] Garage2 = {c1, con1, new Car("Lol")}; // Prepopulated Array

    }

    @Override
    public String toString() {
        return "Maine";
    }

}