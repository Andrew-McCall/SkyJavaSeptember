public class VDriver {

    private Vehicle v;

    public void setVehicle(Vehicle v){
        this.v = v;
    }

    public double Drive(double miles){
        return this.v.Move(miles);
    }

}
