import java.util.Scanner;

public class MultipleofNumber {
    public static void main(String[] args) {
        System.out.println("===Multiple Checker===");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second Number: ");
        int secondNumber = input.nextInt();
        if(firstNumber%secondNumber==0){
            System.out.println(firstNumber + " is a multiple of " + secondNumber);
        }
        else {
            System.out.println(firstNumber + " is not a multiple of " + secondNumber);
        }

        input.close();
    }
}
