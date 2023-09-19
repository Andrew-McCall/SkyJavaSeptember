public class Driver extends Person {

    private IDrivable drivable;

    public Driver(){
        super("Andrew", 2);
    }
    public Driver(String name, int age){
        super(name, age);
    }

    @Override
    public String getName(){
        return "Driver " + super.getName();
    }


    public double DriveDrivable(double miles){
        System.out.println(this.drivable);
        if (this.drivable == null) {
            return -1;
        }

        if (this.drivable instanceof Convertible){
            Convertible local = (Convertible) this.drivable;
            if (!local.GetIsRoofDown()){
                local.ToggleSunRoof();
            }
        }

        return this.drivable.Drive(miles);
    }


    public void SetDrivable(IDrivable drivable){
        this.drivable = drivable;
    }

    public IDrivable GetCar(){
        return this.drivable;
    }

}
