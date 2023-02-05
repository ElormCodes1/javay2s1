import java.util.Scanner;

public class ReadingFromKeyboard {
    public static void main(String[] args) {
        //create a scanner variable
        Scanner input = new Scanner(System.in);
        //create a string variable to store username
        String username;
        //the variable username
        System.out.println("Enter your name: ");
        username = input.nextLine();
        System.out.println(username + ", Welcome to Java!");

        //read integers with Scanner
        System.out.print("Please enter an integer: ");
        int x = input.nextInt();
        System.out.print("Please enter a decimal: ");
        double y = input.nextDouble();
        System.out.println(x);
        System.out.println(y);
        //close scanner variable
        input.close();


    }
}
