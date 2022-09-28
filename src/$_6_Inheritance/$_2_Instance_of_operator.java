package $_6_Inheritance;

public class $_2_Instance_of_operator {
    public static void main(String[] args) {
        animal a1=new animal();
        person2 p1=new person2();
        teacher1 t1=new teacher1();
        System.out.println("animal instance of animal class : "+(a1 instanceof animal));
        System.out.println("person2 instance of animal class : "+(p1 instanceof animal));
        System.out.println("person2 instance of person2 class : "+(p1 instanceof person2));
        System.out.println("teacher1 instance of animal class : "+(t1 instanceof animal));
        System.out.println("teacher1 instance of person2 class : "+(t1 instanceof person2));
        System.out.println("teacher1 instance of teacher1 class : "+(t1 instanceof teacher1));
        System.out.println("person2 instance of teacher1 class : "+(p1 instanceof teacher1));
        System.out.println("animal instance of teacher1 class : "+(a1 instanceof teacher1));
        System.out.println("animal instance of person2 class : "+(a1 instanceof person2));
    }
}
class animal{

}
class person2 extends animal{

}
class teacher1 extends person2{

}
