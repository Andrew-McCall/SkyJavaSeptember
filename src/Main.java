import java.util.Scanner;

public class Main {

    private static final String GREETING = "Hello World";

    public static void main(String[] args) {

        System.out.println(GREETING);
//        GREETING = "byee"; Final cannot be set!

        // Pass-By-Value (All Primitives)
        int a = 1;   // Create a variable with a value of 1
        int b = a;   // the VALUE one is cloned for b

        a++;         // add 1 to a = 1+1 = 2
                     // b and a are separate
        b++;         // add 1 to b = 1+1 = 2

        System.out.println(a); // 2
        System.out.println(b); // 2

        // Pass-By-Reference (Non-primitive)
        Number one = new Number(); // 0
        Number two = one;          // It doesn't create a new number
                                   // It is a reference to "one"
        one.AddToNumber(7);      // add 7 to "one" = 0+7= 7;
        two.AddToNumber(5);      // add 5 to "two" = 7+5= 12;
                                   // "two" is "one"
        System.out.println(one.myNumber); // 12
        System.out.println(two.myNumber); // 12


        // What now?
        Number three = new Number(); // 0
        Number four = new Number(); // 0

        three.AddToNumber(5);
        four.AddToNumber(7);

        System.out.println(three);
        System.out.println(four);
        System.out.println(three.myNumber); // 5
        System.out.println(four.myNumber);  // 7

        // What now?
        System.out.println(Counter.myNumber); // 0
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.AddToNumber(6);
        counter2.AddToNumber(9);

        System.out.println(counter1.myNumber); // 15
        System.out.println(counter2.myNumber); // 15

        System.out.println(Counter.myNumber);  // 15

        // What now?
        Car car1 = new Car(); // vim: 0  |  counter: 7
        Car car2 = new Car(); // vim: 7  |  counter: 14
        Car car3 = new Car(); // vim: 14  |  counter: 21

        new Car();            // vim: 21  |  counter: 28

        Car.counter -= 1;
        Car car4 = new Car(); // vim: -1  |  counter: 6

        System.out.println(car1.getVim());
        System.out.println(car2.getVim());
        System.out.println(car3.getVim());
        System.out.println(car4.getVim());

        System.out.println(Car.counter);
        System.out.println(Car.getcounter());


    }



}