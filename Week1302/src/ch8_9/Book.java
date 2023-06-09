package ch8_9;

public enum Book {
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    public final String title;
    public final String copyRightYear;

    Book(String title, String copyRightYear) {
        this.title = title;
        this.copyRightYear = copyRightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyRightYear() {
        return copyRightYear;
    }
}
