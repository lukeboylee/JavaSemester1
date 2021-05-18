// Program to print the time in a specific format [HH:MM:SS]
// Author : Luke Boyle

public class Q6 {
    public int hours;
    public int minutes;
    public int seconds;

    public static void main(String[] args){
        Q6 morning = new Q6();
        morning.hours = 8;
        morning.minutes = 14;
        morning.seconds = 32;

        morning.printTime();
    }

    public void printTime(){
        System.out.printf("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
