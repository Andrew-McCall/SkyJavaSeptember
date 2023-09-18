import java.util.Scanner;

public class Main { // Everything secretly inherts from Object
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

        // Part 2
        // Car Parent Class
        // 1 // Create two child classes that extend Car: Supercar, Convertible
        // 2 // Give the two classes unique behaviour
        /// Extension - BREAK POLYMORPHISM
        // 3 // Driver treat the child classes differently - use the sunroof. put super can in sport mode


        Car c1 = new Car("Black", "ABC", "Leaf", "Nissan", 45233);
        Car c2 = new Car("DFE");

        Driver driver = new Driver();

        System.out.println(driver.DriveCar(99));  // -1

        driver.SetCar(c1);
        System.out.println(driver.DriveCar(99));  // 45322

        driver.SetCar(c2);
        System.out.println(driver.DriveCar(99));  // 99

        System.out.println(c1.getMiles());             // 45322

        System.out.println(c1.getPosition());

        Main m = new Main();
        System.out.println(m.toString());
        System.out.println(((Object) m).toString());

        Object o = new Main();
        System.out.println(o.toString());

        System.out.println(driver.getName());
        driver.Birthday();
        System.out.println(driver.getAge());

    }

    @Override
    public String toString() {
        return "Maine";
    }

}