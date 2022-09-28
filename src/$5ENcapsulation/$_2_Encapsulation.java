package $5ENcapsulation;

public class $_2_Encapsulation {
    public static void main(String[] args) {
        Student1 s1=new Student1("Jonayed",22);
        s1.display();
    }
}
class Student1{
    private String name;
    private int age;
    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }
}
