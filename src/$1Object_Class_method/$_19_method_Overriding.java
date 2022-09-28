package $1Object_Class_method;

public class $_19_method_Overriding {
    public static void main(String[] args) {
        teacher t1=new teacher("student","jonayed",22);
        t1.display();
        person p1=new person(22,"Mohammad");
        p1.display();
    }
}
/**
 * without inheriting we cant use method overriding
 */
class person{
    int age;
    String name;
    person(int age,String name){
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }
}
class teacher extends person{
    String designation;
    teacher(String designation,String name,int age){
        super(age,name);
        this.designation=designation;
    }

    @Override
    void display() {
        super.display();
        System.out.println("designation : "+designation);
    }
}
