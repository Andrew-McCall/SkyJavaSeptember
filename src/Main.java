import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1/ Create a IDrivable Interface
        //2/ Make car implement IDrivable
        //3/ Make driver store only an IDrivable
        //4/ Update driver's Drive Method to use IDriviable.Drive Behaviour
        //5/ Keep the (BP) convertible exception handling by driver
        //// EXT
        //6/ Create a non car class which is IDriviable (Lawn-mower)
        //7/ Test it out and add what you'd like
        //8/ Vehicle SuperClass
        //9/ IFlyable

        IDrivable c1 = new Convertible("Green", "123", "rover", "Land", 1);
        IDrivable c2 = new BondCar();

        Convertible con1 = (Convertible) c1;

        Driver d = new Driver();
        d.SetDrivable(c1);

        d.DriveDrivable(658);

        System.out.println(((Car) c1).getMiles());
        System.out.println(((Car) c1).getPosition());
        System.out.println(con1.GetIsRoofDown());

        System.out.println("");

        d.SetDrivable(new LawnMower());
        d.DriveDrivable(0.5);




    }

}