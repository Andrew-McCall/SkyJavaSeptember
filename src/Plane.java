public class Plane extends Vehicle implements IFlyable, IComms{
    @Override
    public double Fly(double miles) {
        this.setPosition(this.getPosition().getX(), this.getPosition().getY() + miles);
        return miles;
    }

    @Override
    public void MessageATC(String message) {
        System.out.println("MESSAGE: " + message);
        // code to talk to atc
    }
}
