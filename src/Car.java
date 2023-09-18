import java.util.Objects;

public class Car {

    private String colour;
    private String reg;
    private String model;
    private String make;
    private double miles;

    // public Car(){}
    public Car(String colour, String reg, String model, String make, double miles){
        this.miles = miles;
        this.make = make;
        this.model = model;
        this.reg = reg;
        this.colour = colour;
    }

    public Car(String reg){
        this("Grey", reg, "Micra", "Nissan", 0);
    }

    public void SetColour(String colour){
        this.colour = colour;
    }

    public String GetColour(){
        return this.colour;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMiles() {
        return miles;
    }

    public double IncreaseMiles(double extraMiles){
        this.miles += extraMiles;
        return this.miles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.miles, miles) == 0 && Objects.equals(colour, car.colour) && Objects.equals(reg, car.reg) && Objects.equals(model, car.model) && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, reg, model, make, miles);
    }
}
