public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.setTime(25,10);
        }
        catch (Exception e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        System.out.println(time.toString());
        System.out.println(time.toUniversalString());
    }
}