package $3Uses_Of_Static_keyword;

public class $_10_static_variable_part3 {
    public static void main(String[] args) {
        student1 ob1=new student1();
        ob1.display();
        student1 ob2=new student1();
        ob2.display();
        student1 ob3=new student1();
        ob3.display();
    }
}
class student1{
   static int count=0;// static variable
    student1(){
        count++;
    }
    void display(){
        System.out.println("total student : "+count);
    }
}