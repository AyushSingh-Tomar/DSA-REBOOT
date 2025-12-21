package Java_Collections.Common_Collection_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class freq {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(Collections.frequency(list, 5));
        System.out.println(Collections.binarySearch(list, 5));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
