public class $_145_ANONYMOUS_INNER_CLASS {
    public static void main(String[] args) {
        anonymous_inner obj =new anonymous_inner() {
            @Override
            void display() {
                System.out.println("THis is a example of anonymous inner class");
            }
        };
        obj.display();
    }
}

abstract class anonymous_inner{
    abstract void display();
}