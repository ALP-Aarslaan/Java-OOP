package $_11_Abstraction;

public class $_130_example_of_abstract {
    public static void main(String[] args) {
        MobileUser p1;
        p1=new Jonayed();
        p1.call();
        p1.display();
        p1=new Rahim();
        p1.display();
        p1.call();
    }
}
abstract class MobileUser{
    void call(){
        System.out.println("this is a non abstract method");
    }
    abstract void display();
}
class Rahim extends MobileUser{
    @Override
    void display() {
        System.out.println("HI, i am rahim");
    }
}
class Jonayed extends MobileUser{
    @Override
    void display() {
        System.out.println("HI I am jonayed");
    }
}
