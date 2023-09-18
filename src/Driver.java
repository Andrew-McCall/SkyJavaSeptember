public class Driver {

    private Car car;    // car can be null
//    private int number; // primitives always have a value

    public Driver(){}

    public double DriveCar(double miles){
        if (this.car == null) {
            return -1;
        }

        return this.car.IncreaseMiles(miles);
    }

    public void SetCar(Car car){
        this.car = car;
    }

    public Car GetCar(){
        return this.car;
    }

}
