import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // TODO (Primitive, Class) (Pass-by-value, Pass-by-reference)
        int myNumber = -25;

//        myNumber = myNumber + 10;

        System.out.println(myNumber);

        // TODO Switch
        if (myNumber > 10) {
            System.out.println("Greater than ten");
        } else if (myNumber >= 5) {
            System.out.println("Greater or equal to five");
        }else if (myNumber == 1 || (myNumber < 0 && myNumber > -50)){
            System.out.println("Combined");
        }else{
            System.out.println(myNumber);
        }


        myNumber = 2;

        switch (myNumber){

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println(myNumber);
                break;

        }

        myNumber = 5;

        while (myNumber > 0){
            System.out.println(myNumber);
            myNumber = myNumber - 1;
        }

        myNumber = -5;

        do{
            System.out.println(myNumber);
            myNumber = myNumber - 1;
        }while (myNumber > 0);

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        myNumber = 1;            // = 1
        myNumber++;              // = 2
        myNumber = myNumber + 3; // = 5
        myNumber += 2;           // = 7

        myNumber--;
        myNumber = myNumber - 2;
        myNumber -= 3;

        // myNumber = 1

        myNumber /= 1.01;           // 1/1.01= 0.99 = 0
        myNumber *= 4;           // 0*4= 0

        System.out.println(myNumber);

        // Primitive Data Type - Can't be broken down any further
        // double  64 bits
        // float   32 bits

        // long    64 bits
        // int     32 bits
        // short   16 bits

        // byte    8 bits
        // char    16bits Unicode

        // boolean 1 bit


        // Non primitive
        // Strings
        // Vectors
        // Points
        // Main
        // Scanners

        Scanner s = new Scanner(System.in);

        System.out.println(s.next());
        // TODO Exceptions
        myNumber = s.nextInt();

        if (myNumber % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }

}