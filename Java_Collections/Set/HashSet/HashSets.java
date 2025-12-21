package Java_Collections.Set.HashSet;
import java.util.HashSet;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] array= {1,2,3,4,4,5,5,6,10,7,8,9,3,4,2};
        for(int e:array){
            System.out.println(set.add(e));
        }
        System.out.println(set.toString());
    }
}
