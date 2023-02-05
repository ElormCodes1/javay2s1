import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        // year of birth using the chinese
        // zodiac signs
        Scanner input =  new Scanner(System.in);
        // ask user to enter year of birth
        System.out.print("Enter your year of birth: ");
        int yOB = input.nextInt();
        switch(yOB%12){
            case 0:
                System.out.print("You were born in year of Monkey");
                break;
            case 1:
                System.out.print("You were born in year of rooster");
                break;
            case 2:
                System.out.print("You were born in year of dog");
                break;
            case 3:
                System.out.print("You were born in year of pig");
                break;
            case 4:
                System.out.print("You were born in year of rat");
                break;
            case 5:
                System.out.print("You were born in year of cat");
                break;
            case 6:
                System.out.print("You were born in year of ox");
                break;
            case 7:
                System.out.print("You were born in year of tiger");
                break;
            case 8:
                System.out.print("You were born in year of rabbit");
                break;
            case 9:
                System.out.print("You were born in year of dragon");
                break;
            case 10:
                System.out.print("You were born in year of snake");
                break;
            case 11:
                System.out.print("You were born in year of horse");
                break;
            default:
                System.out.print("You were born in year of sheep");

        }
        input.close();
    }
}
