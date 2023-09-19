import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a IDrivable Interface
        // Make car implement IDrivable
        // Make driver store only an IDrivable
        // Update driver's Drive Method to use IDriviable.Drive Behaviour
        // Keep the (BP) convertible exception handling by driver
        /// EXT
        // Create a non car class which is IDriviable (Lawn-mower)
        // Test it out and add what you'd like


        Car c1 = new BondCar();
//        c1 = new Car("123");

        Car c2 = new Car("ABC");
        Plane p1 = new Jumbo();
        IFlyable f1 = (IFlyable) c1;
        BondCar b1 = (BondCar) c1;

        IFlyable f2 = p1;
        IFlyable f3 = new BondCar();

        System.out.println(c1.GetColour());
        System.out.println(c2.GetColour());
        System.out.println(p1.Fly(200));
        System.out.println(f1.Fly(100));

        System.out.println("");

        System.out.println(b1.Fly(1));
        System.out.println(c1.IncreaseMiles(10));

        System.out.println(c1.getPosition());
        System.out.println(p1.getPosition());


        Boeing bo1 = new Boeing();
        IFlyable f5 = bo1;
        IComms co1 = bo1;
        IComerericalPlane cp1 = bo1;

//        System.out.println(f1.);


        Vehicle v1 = new Vehicle();
        VDriver vd1 = new VDriver();
        vd1.setVehicle(v1);

        vd1.Drive(10);

        System.out.println(v1.getPosition());


    }

}