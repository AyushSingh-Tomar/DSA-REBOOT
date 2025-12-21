package Java_Collections.Set.TreeSet;
import java.util.TreeSet;
public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(11);
        ts.add(10);
        ts.add(14);
        System.out.println(ts.floor(13));
        System.out.println(ts.ceiling(13));
    }
    
}
