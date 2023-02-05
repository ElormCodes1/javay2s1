import java.util.Scanner;

public class AreaofaTriangle {
    public static void main(String[] args) {
        //tells the user what the console program does
        System.out.println("===AREA OF A TRIANGLE CALCULATOR===");
        //asks user to input length of triangle
        System.out.print("Enter the length of the triangle: ");
        //variable of scanner type to store user input
        Scanner input = new Scanner(System.in);
        //variable that stores respective parameter length
        int length = input.nextInt();
        double length1 = (double)length;
        //asks the user to input the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        //variable that stores respective parameter height
        double height = input.nextDouble();
        //variable that stores the calculation value of Area
        double Area = (length/2)*height;
        //prints the area of the triangle
        System.out.println("The area of the triangle is "+Area);


        input.close();

    }
}
