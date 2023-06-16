public class TimeSon extends Time {
    public String getHourMinuteSecond() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
