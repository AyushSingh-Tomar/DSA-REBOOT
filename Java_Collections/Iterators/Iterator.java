package Java_Collections.Iterators;
import java.util.Iterator;
import java.util.ArrayList;

class Iterators{

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Iterator<Integer> iterator= al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}