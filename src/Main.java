import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Calculator e.g
//        Calculator(1, '+', 2);  // = 3
//        Calculator(4, '-', 2);  // = 2
//        Calculator(12, '*', 2); // = 24
//        Calculator(8, '/', 2);  // = 4

        // 1 - Create a calculator method which takes 2 numbers and a condition
        // 2 - Print the answer
        // Extensions
        // 3 - Add % and ^ (modlus and power) operations
        // 4 - Add a text input to allow inputs for the numbers
        // 5 - Add a text input to allow input for the operation
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        char o = s.next().charAt(0);

        System.out.println(Calculator(a, o, b));

//        System.out.println(Calculator(10, '+', 20));
//        System.out.println(Calculator(10, '-', 20));
//        System.out.println(Calculator(10, '*', 20));
//        System.out.println(Calculator(10, '/', 20));
//
////        System.out.println(Calculator(10, 'f', 0));
//        System.out.println(Calculator(10, '^', 2));
//        System.out.println(Calculator(10, '%', 20));

    }


    private static double Calculator(double numberOne, char operation, double numberTwo) throws Exception {
        switch (operation){
            case '+':
                return numberOne+numberTwo;
            case '-':
                return numberOne-numberTwo;
            case '*':
                return numberOne*numberTwo;
            case '/':
                if (numberTwo == 0){
                    throw new Exception("Can't divide by zero!");
                }
                return numberOne/numberTwo;
            case '^':
                return Math.pow(numberOne, numberTwo);
            case '%':
                if (numberTwo == 0){
                    throw new Exception("Can't modulo by zero!");
                }
                return numberOne%numberTwo;
        }

        throw new Exception("Invalid Operation");
    }

}