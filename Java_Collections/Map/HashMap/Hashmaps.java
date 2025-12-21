package Java_Collections.Map.HashMap;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Ayush");
       System.out.println( map.put(1,"Ayush"));
        map.put(2,"Ayushi");
        for(Integer e:map.keySet()){
            System.out.println(e+" "+map.get(e));
        }
    }
    
}
