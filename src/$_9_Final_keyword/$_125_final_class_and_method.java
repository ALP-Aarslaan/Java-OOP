package $_9_Final_keyword;

public class $_125_final_class_and_method {
    public static void main(String[] args) {
        Student s1= new Student();
        //s1.display();
        s1.display1();
    }
}

/**
 * final class can not be extended
 * so we don't use final class
 */
class Institute{
    final void display(){
        System.out.println("university info");
    }
}
class Student extends Institute{
    //final method can not be overridden but it can be inherited
    void display1() {
        display();
        System.out.println("student info");
    }
}