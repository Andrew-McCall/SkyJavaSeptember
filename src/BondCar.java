public class BondCar extends Car implements IFlyable{
    public BondCar() {
        super("Black", "007", "James", "Bond", 0);
    }

    @Override
    public double Fly(double miles) {
        this.setPosition(this.getPosition().getX()+miles, this.getPosition().getY()+miles);
        return miles;
    }

}

