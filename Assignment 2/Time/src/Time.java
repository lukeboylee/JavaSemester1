public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public void printTime() {
        System.out.printf("[%02d:%02d:%02d]", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Time morning = new Time();
        morning.hours = 4;
        morning.minutes = 5;
        morning.seconds = 2;
        morning.printTime();
    }
}

