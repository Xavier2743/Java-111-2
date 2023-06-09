import ch8_9.Book;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(23, 10);
        Time time2 = new Time(9, 10, 29);
        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());

        time2.setTime(time1);
        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());

        try {
            time1.setHour(25);
        } catch (Exception e) {
            System.out.printf("Exception: %s%n", e.getMessage());
        }
        System.out.println(time1.toUniversalString());

        try {
            time1.setTime(23, 10, 29);
        } catch (Exception e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        System.out.println(time1.toUniversalString());

        for (Book book : Book.values())
            System.out.println(book + ": " + book.getTitle() + "-" + book.getCopyRightYear());
    }
}