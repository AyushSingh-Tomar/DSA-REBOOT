package Java_Collections.CustomComparator.LamdaFuntction;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Person{
    private int age;
    private String name;
    Person(int age,String name){
        this.name = name;
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return this.name+" : age ="+this.age;
    }
}
public class lamdaExpression {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1=new Person(23,"Ayush");
        Person p2=new Person(22,"Singh");
        Person p3=new Person(21,"Tomar");
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Collections.sort(list,(a, b)->b.getAge()-a.getAge());
        System.out.println(list);
        
    }
    
}
