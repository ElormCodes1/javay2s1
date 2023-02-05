import java.util.Scanner;

public class arithmetic_operators {
    public static void main(String[] args) {
        int x = 20;
        int y = 3;
        double decimal = 20.0;
        double decimal2 = 3.0;

        //addition
        System.out.println(x + y);
        System.out.println(decimal2 + decimal);
        System.out.println(x + decimal);

        //multiplication
        System.out.println(x * y);
        System.out.println(decimal2 * decimal);
        System.out.println(x * decimal);

        //subtraction
        System.out.println(x - y);
        System.out.println(decimal2 - decimal);
        System.out.println(x - decimal);

        //division
        System.out.println(x / y);
        System.out.println(decimal2 / decimal);
        System.out.println(x / decimal);

        //remainder or modulo
        System.out.println(x % y);
        System.out.println(decimal2 % decimal);
        System.out.println(x % decimal);

        Scanner input = new Scanner(System.in);




    }
}
