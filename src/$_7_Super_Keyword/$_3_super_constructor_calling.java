package $_7_Super_Keyword;

public class $_3_super_constructor_calling {
    public static void main(String[] args) {
        BBB ob=new BBB("Mohammad",22,34);
    }
}
class AAA{
    //int age;
    //String name;
    AAA(String name,int age){
       // this.age=age;
        //this.name=name;
        System.out.println("A's constructor");
    }
}
class BBB extends AAA{
    //int num;
    BBB(String name,int age,int num){
        super(name,age);
      //  this.num=num;
        System.out.println("B's constructor");
    }

}
