public class Test0101 {
    public static void main(String[] args) {
        Human bob = new Human();
        bob.height = 100;
        bob.printHeight();
        bob.printWeight();
    }
}

class Human {
    int sex;
    int height = 180;
    private int weight = 70;

    public void printHeight() {
        System.out.println(height);
    }

    public void printWeight() {
        System.out.println(weight);
    }
}