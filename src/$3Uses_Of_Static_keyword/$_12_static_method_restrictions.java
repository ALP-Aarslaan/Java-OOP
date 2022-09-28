package $3Uses_Of_Static_keyword;

public class $_12_static_method_restrictions {
    public static void main(String[] args) {
        stat ob1=new stat ();
        ob1.display1();
        stat.display();
    }
}
class stat{
    int x=10;
    static int y=20;
    static void display(){
        //display1(); it wont call non static method
        //System.out.println(x);//here we will get error because x is non static integer
        System.out.println(y);//here we will not get any error because y is static variable
    }
    void display1(){
        System.out.println(y);
        System.out.println(x);
        display();//we can call static method inside non static method
        System.out.println("this is non static method which is calling static method");
    }
}
/**
 * static method  can't use non static method
 * this and super keyword can't be used in static method
 */
