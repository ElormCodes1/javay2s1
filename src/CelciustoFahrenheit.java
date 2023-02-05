import java.util.Scanner;

public class CelciustoFahrenheit {
    public static void main(String[] args) {
        System.out.println("===CELCIUS TO FAHRENHEIT===");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Degrees: ");
        double tempcel = input.nextDouble();
        double tempfahren = (9/5.0)*tempcel + 32;
        System.out.println(tempcel + " degrees celcius in fahrenheit is " + tempfahren);
        input.close();
    }
}
