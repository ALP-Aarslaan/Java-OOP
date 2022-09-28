package $3Uses_Of_Static_keyword;

public class $_13_static_Block {
    public static void main(String[] args) {
        StaticBlock ob1=new StaticBlock();
        ob1.display();
    }
}

/**
 * needs to remind that static block always executes first then main method
 */
class StaticBlock{
    static int age;
    static String name;
    static{
        age=22;
        name="Mohammad Jonayed Sarkar";
    }
    void display(){
        System.out.println("age : "+age);
        System.out.println("name : "+name);
        System.out.println();
    }
    static{
        System.out.println("static block");
    }
}