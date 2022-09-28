package $_7_Super_Keyword;

public class $_1_super_keyword_part1 {
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
    }
}
class A{
    int x=10;

}
class B extends A{
    int x=5;
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
