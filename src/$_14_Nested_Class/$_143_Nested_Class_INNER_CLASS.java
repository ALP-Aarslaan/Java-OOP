public class $_143_Nested_Class_INNER_CLASS {
    public static void main(String[] args) {
        Outer out =new Outer();
        out.display();
    }
}
class Outer{
    private class Inner{
        void show(){
            System.out.println("i am inner class");
        }
    }
    void display(){
        Inner in =new Inner();
        in.show();
    }
}