package $_8_This_keyword;

public class $_2_this_Keyword_in_method {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.message();
        s1.display();
    }
}
class Student{
    void message(){
        System.out.println("i am  message method");
    }
    void display(){
        this.message();
        System.out.println(" i am display method");
    }
}
