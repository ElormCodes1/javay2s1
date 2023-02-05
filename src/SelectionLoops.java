import java.util.Scanner;

public class SelectionLoops {
    public static void main(String[] args) {
        //check if a number is odd
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        //if number is odd, int division using the
        // remainder will not be equal to zero

        //one way if statement
//        if (num%2!=0)
//        {
//            System.out.println(num + " is ODD");
//        }

        //if else statement
        if (num%2!=0)
        {
            System.out.println(num + " is ODD");
        }
        else {
            System.out.println(num + " is EVEN");
        }
        input.close();
    }
}
