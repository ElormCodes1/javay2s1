public class GMT {
    public static void main(String[] args) {
        //Get System time
        long getSystemTime = System.currentTimeMillis();
        long totalSeconds = getSystemTime/1000;

        //Compute time in hours, minutes, and seconds
        int hours = (int) (totalSeconds/3600)%24;
        int minutes = (int) (totalSeconds%3600)/60;
        int seconds = (int) totalSeconds%60;



        System.out.println("The current time in GMT is: "+hours+":"+minutes+":"+seconds);

    }
}
