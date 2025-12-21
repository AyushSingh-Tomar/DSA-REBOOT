package Java_Collections.List.LinkedList;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.addFirst(2);
        list.addLast(3);
        System.out.println(list);
        list.getFirst();
        list.getLast();
        list.remove(Integer.valueOf(3));
        list.remove(1);
        list.contains(2);
        list.size();
        list.clear();
    }
    
}
