import java.security.SecureRandom;
import java.util.ArrayList;

public class Test1301 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        // initialize arraylist1 and arraylist2 with random numbers
        for (int i = 0; i < 10; i++) {
            int rndNum1 = random.nextInt(10);
            int rndNum2 = random.nextInt(10);
            arrayList1.add(rndNum1);
            arrayList2.add(rndNum2 * 10);
        }
        // print arraylist1 and arraylist2
        for (Integer integer : arrayList1) {
            System.out.println(integer);
        }
        System.out.println("-----");
        for (Integer integer : arrayList2) {
            System.out.println(integer);
        }
        System.out.println("-----");
        // add arraylist2 to arraylist1
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList1.add(i*2+1, arrayList2.get(i));
        }
        // print arraylist1
        for (Integer integer : arrayList1) {
            System.out.println(integer);
        }
    }
}
