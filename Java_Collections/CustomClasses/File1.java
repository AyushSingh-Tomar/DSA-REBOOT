package Java_Collections.CustomClasses ;
class Person {
    private Integer age;
    private String name;
    private InternalData internalData;

    Person(int age,String name,int Revenue){
        this.name = name;
        this.age = age;
        this.internalData= new InternalData(Revenue==0?1000:Revenue);
    }

    @Override
    public String toString(){
        return (this.name+" is "+this.age+" years old");
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAge(String name){
        this.name = name;
    }
    public int getAge(int age){
        return this.age;
    }

    public int getRevenue(){
        return this.internalData.getRevenue();
    }

    public void setRevenue(int Revenue){
        this.internalData.setRevenue(Revenue);
    }

    public String getName(String name){
        return this.name;
    }
}

class InternalData{
    private Integer revenue;
    InternalData(Integer revenue){
        this.revenue = revenue;
    }
    public Integer getRevenue(){
        return this.revenue;
    }
    public void setRevenue(Integer revenue){
        this.revenue=revenue;
    }
}

public class File1 {
    public static void main(String ...args){
        Person obj1= new Person(22,"Ayush",27000);
        System.out.println(obj1.toString());

    }
    
}
