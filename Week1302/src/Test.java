public class Test {
    public static void main(String[] args) {
        TimeSon t = new TimeSon();
        t.setTime(12, 34, 56);
        System.out.println(t);

        TimeVariable timeVariable = new TimeVariable();
        t.getHourMinuteSecond(timeVariable);
        System.out.println(timeVariable.hour + ":" + timeVariable.minute + ":" + timeVariable.second);
    }
}
