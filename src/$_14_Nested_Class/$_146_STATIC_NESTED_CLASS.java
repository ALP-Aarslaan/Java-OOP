public class $_146_STATIC_NESTED_CLASS {
    public static void main(String[] args) {
        Outer2.nested obj =new Outer2.nested();
        obj.display();
    }
}

class Outer2{
    int num=30;
    static class nested{
        void display(){
            System.out.println("this is an example of static nested class");
        }
    }
}