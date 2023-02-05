import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        //create a scanner variable to read from keyboard
        //time in seconds
        Scanner input = new Scanner(System.in);
        //ask user to enter time in seconds
        System.out.print("Enter time in seconds: ");
        //create variable to store time entered
        int timeEntered = input.nextInt();
        //get total minutes in time entered
        int totalMinutes = timeEntered/60;
        // get remaining seconds from time entered after getting total minutes
        int remainingSeconds = timeEntered%60;
        // total hours from total minutes
        int totalHours = totalMinutes/60;
        // get remaining minutes from total minutes after extracting
        // total hours from total minutes
        int remainingMinutes = totalMinutes%60;
        System.out.println(timeEntered+" sec(s) is: "+totalHours+" hr(s) "+remainingMinutes+" min(s) "+remainingSeconds+" sec(s) ");



        input.close();
    }
}
