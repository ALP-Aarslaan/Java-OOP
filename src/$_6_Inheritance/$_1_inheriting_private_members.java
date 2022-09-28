package $_6_Inheritance;

public class $_1_inheriting_private_members {
    public static void main(String[] args) {
        student s1=new student("mohammad",22,"student");
        s1.display();
    }
}
class person1{
    private int age;
    private String name;
    person1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    void display1(){
        System.out.println("name : "+getName());
        System.out.println("age : "+getAge());
    }
}
class student extends person1{
    private String qualification;

    student(String name, int age,String qualification) {
        super(name, age);
        this.qualification=qualification;
    }

    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    void display(){
        super.display1();
        System.out.println("qualification : "+getQualification());
    }
}
