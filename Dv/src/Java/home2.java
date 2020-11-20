package Java;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class home2 {
    public void home2() {
        Random rand = new Random();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList2.add(rand.nextInt(20));
        }
        System.out.println("ArrayList is : " + arrayList2);

        System.out.print("Reversed Numbers: ");
        for (int i = arrayList2.size() - 1; i >= 0; i--) {
            System.out.print(arrayList2.get(i) + ", ");
        }
        System.out.println(" ");
        Collections.sort(arrayList2);
        System.out.println("That is the Upcending order: " + arrayList2);

        Collections.reverse(arrayList2);
        System.out.println("That is the Decending order: " + arrayList2);
        System.out.println("That Old Arraylist: " + arrayList2);
        for(int i =0; i<3;i++){
            arrayList2.add(rand.nextInt(20));
        }
        System.out.println("That is New ArrayList: " + arrayList2);
    }
}
