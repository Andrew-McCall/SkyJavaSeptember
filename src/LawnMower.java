public class LawnMower implements IDrivable{

    @Override
    public double Drive(double miles) {
        Mow();
        return miles;
    }

    public void Mow(){
        System.out.println("Brrrr");
    }

}
