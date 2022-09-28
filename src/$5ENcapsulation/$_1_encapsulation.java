package $5ENcapsulation;

public class $_1_encapsulation {
    public static void main(String[] args) {
        Student s1=new Student("Mohammad",22);
        s1.display();
    }
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("age : "+age);
        System.out.println("name : "+name);
    }
}
