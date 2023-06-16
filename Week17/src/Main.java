public class Main {
    public static void main(String[] args) {
        int a = 0;
        add(a);
        System.out.println(a);

        MyClass myClass = new MyClass();
        add(myClass);
        System.out.println(myClass.a);

        String str = "123";
        add(str);
        System.out.println(str);
    }

    public static void add(int a) {
        a++;
    }

    public static void add(MyClass myClass) {
        myClass.a++;
    }

    public static void add(String str) {
        str += "456";
    }
}

class MyClass {
    int a;
}