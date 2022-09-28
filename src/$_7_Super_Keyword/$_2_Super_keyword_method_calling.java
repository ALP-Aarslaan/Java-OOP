package $_7_Super_Keyword;

public class $_2_Super_keyword_method_calling {
    public static void main(String[] args) {
        BB ob1=new BB();
        ob1.display();
    }
}
class AA{
    void display(){
        System.out.println("inside AA class");
    }
    void message(){
        System.out.println("HIII");
    }
}
class BB extends AA{
    @Override
    void display() {
        message();
        super.display();
        System.out.println("inside BB class");
    }
}
