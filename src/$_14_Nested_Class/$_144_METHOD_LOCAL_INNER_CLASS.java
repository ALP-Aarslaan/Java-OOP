public class $_144_METHOD_LOCAL_INNER_CLASS {
    public static void main(String[] args) {
        Outer1 out = new Outer1();
        out.show();
    }
}
class Outer1{
    int num=20;
    void show(){
        class Inner1{
            void display(){
                System.out.println("printing outer class's integer value "+num+"inside inner class");
            }
        }
        Inner1 in =new Inner1();
        in.display();
    }
}