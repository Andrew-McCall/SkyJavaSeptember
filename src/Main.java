import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.Add(5, 20));
        System.out.println(c.Subtract(6, 20));
        System.out.println(c.Multiply(7, 20));
        System.out.println(c.Divide(8, 20));

        System.out.println(c.getLastAnswer());
        c.Add(1,2);
        System.out.println(c.getLastAnswer());

        Calculator c2 = new Calculator();
        c2.Add(1,5);

        System.out.println(c.getLastAnswer() == c2.getLastAnswer());

        Calculator c10 = new Calculator();
        Calculator c20 = c10;

        c20.Add(20, 20);

        System.out.println(c10.getLastAnswer());
        System.out.println(c20.getLastAnswer());

        System.out.println(c10 == c20);


        System.out.println(new Calculator() == new Calculator());
        System.out.println(new Calculator().equals(new Calculator()));

    }
}