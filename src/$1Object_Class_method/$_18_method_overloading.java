public class $_18_method_overloading {
    public static void main(String[] args) {
        overloading ob1=new overloading();
        ob1.add(12,13);
        ob1.add();
        ob1.add(23.4,34.56);
        ob1.add(1,2,3);
    }
}
/**
 * method overloading means declaring some methods
 * with same name but their parameters must be different types.
 * these methods must be inside the same class
 * this characteristics is also known as polymorphism
 */
class overloading{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("empty");
    }
}
