package $3Uses_Of_Static_keyword;

public class $_11_static_method {
    public static void main(String[] args) {
        StaticMethod ob1=new StaticMethod();
        ob1.display1();//calling non static method;
        StaticMethod.display2();//calling static method
    }
}

/**
 * in order to call a static method we don't need to create an object
 * the best example of a static method is main method
 * that's why don't need to create any object to call main method;
 */
class StaticMethod{
    void display1(){
        System.out.println("i am non static method");
    }
    static void display2(){
        System.out.println("i am static method");
    }
}
