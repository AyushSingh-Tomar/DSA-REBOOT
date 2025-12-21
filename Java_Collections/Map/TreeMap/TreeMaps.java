package Java_Collections.Map.TreeMap;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(12,"Ayush");
        tm.put(7,"Singh");
        tm.put(1,"Tomar");
        System.out.println(tm);
        System.out.println(tm.floorKey(6));
        System.out.println(tm.ceilingKey(6));
    }
}
