package Java_Collections.List.ArrayList;
import java.util.ArrayList;
class Person{
    int age;
    String name;
    Person(Integer age,String name){
        this.age=age;
        this.name = name;
    }
    @Override
    public String toString(){
        return name+" is "+age+" years old";
    }
}
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person person_1=new Person(22,"Ayush");
        Person person_2=new Person(23,"Ayush");
        Person person_3=new Person(24,"Ayush");
        list.add(person_1);
        list.add(person_2);
        list.add(person_3);
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        list.add(1,person_2);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        System.out.println(list.contains(person_2));
    }
    
}
