package $_6_Inheritance;

public class Test {
    public static void main(String[] args) {
        teacher t1=new teacher();
        t1.name="Mohammad";
        t1.age=22;
        t1.designation="student";
        t1.display2();
    }
}
class person{
    String name;
    int age;
    void display1(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }
}
class teacher extends person{
    String designation;
    void display2(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("designation : "+designation);
    }
}
