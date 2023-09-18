public class Convertible extends Car {

    private boolean IsRoofDown = false;

    public Convertible(String colour, String reg, String model, String make, double miles) {
        super(colour, reg, model, make, miles);
    }

    public boolean GetIsRoofDown(){
        return this.IsRoofDown;
    }

    public void ToggleSunRoof(){
        this.IsRoofDown = !this.IsRoofDown;
    }

}
