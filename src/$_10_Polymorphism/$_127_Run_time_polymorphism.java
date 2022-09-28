package $_10_Polymorphism;

public class $_127_Run_time_polymorphism {
    public static void main(String[] args) {
        Person p=new Person();
        p.display();
        Student s=new Student();
        s.display();
        Teacher t=new Teacher();
        t.display();
        //or
        System.out.println("\n\n");
        Person p1=new Person();
        p1.display();
        p1=new Teacher();
        p1.display();
        p1=new Student();
        p1.display();
    }
}
class Person{
    void display(){
        System.out.println("i am a person");
    }
}
class Student extends Person{
    @Override
    void display() {
        System.out.println("i am a student");
    }
}
class Teacher extends Person{
    @Override
    void display() {
        System.out.println("i am a teacher");
    }
}

