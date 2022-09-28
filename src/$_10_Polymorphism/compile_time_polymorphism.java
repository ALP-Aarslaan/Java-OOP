package $_10_Polymorphism;

public class compile_time_polymorphism {
    public static void main(String[] args) {
        A ob1=new A();
        ob1.add();
        A ob2=new A(1.2,2.3);
        ob2.add(1.2,2.3);
        A ob3=new A(1,2,3);
        ob3.add(1,2,3);
    }
}
class A{
    int a,b,c;
    double d,e;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    A(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    A(double a,double b){
        d=a;
        e=b;
    }
    A(){

    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("nothing to sum");
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}