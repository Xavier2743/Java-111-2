public class TimeSon extends Time {
    public String getHourMinuteSecond() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String getHourMinuteSecond(String character) {
        return String.format("%02d" + character + "%02d" + character + "%02d", getHour(), getMinute(), getSecond());
    }

    public int[] getHourMinuteSecond(int number) {
        int[] result = new int[3];
        result[0] = super.getHour();
        result[1] = super.getMinute();
        result[2] = super.getSecond();
        return result;
    }

    public void getHourMinuteSecond(TimeVariable time) {
        time.hour = super.getHour();
        time.minute = super.getMinute();
        time.second = super.getSecond();
    }

    @Override
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}

class TimeVariable {
    int hour;
    int minute;
    int second;
}