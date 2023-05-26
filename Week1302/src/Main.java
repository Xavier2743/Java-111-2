public class Main {
    public static void main(String[] args) {
        Time time = new Time(23, 10);
        System.out.println(time);

        try {
            time.setHour(25);
            System.out.println(time);
        }
        catch (Exception e) {
            System.out.printf("Exception: %s%n", e.getMessage());
        }

        try {
            time.setSecond(25);
            System.out.println(time);
        }
        catch (Exception e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
    }
}