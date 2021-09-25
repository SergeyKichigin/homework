package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] arr = { "Cherry", "Pear", "Lime", "Kiwi", "Plum"};
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList(arr));

        ArrayList<String> f = arrayList(arr);
        swapList(f);
        System.out.println(f);

        Box<Apple> apples_1 = new Box<>(new Apple(), new Apple());
        Box<Orange> oranges = new Box<>(new Orange(), new Orange());
        System.out.println("Weight Applebox1: " + apples_1.getWeight());
        System.out.println("Weight Orangebox: " + oranges.getWeight());
        Box<Apple> apples_2 = new Box<>(new Apple());
        System.out.println("Weight Applebox2: " + apples_2.getWeight());
        apples_1.pourAll(apples_2);
        System.out.println("Weight Applebox1: " + apples_1.getWeight());
        System.out.println("Weight Applebox2: " + apples_2.getWeight());
        System.out.println("Weight Applebox2 and Orangebox is equals?: " + apples_2.compare(oranges));
    }

    private static <K> ArrayList<K> swapList(ArrayList<K> f) {
        Collections.swap(f, 2, 4);
        return f;
    }

    private static <K> ArrayList<K> arrayList(K[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
