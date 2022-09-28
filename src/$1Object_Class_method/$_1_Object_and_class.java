public class $_1_Object_and_class {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.name="Mohammad JOnayed";
        teacher1.gender="Male";
        teacher1.age=22;
        System.out.println(teacher1.name+"\n"+teacher1.gender+"\n"+teacher1.age);
        Teacher teacher2=new Teacher();
        teacher2.name="Alp Arslaan";
        teacher2.gender="Male";
        teacher2.age=22;
        System.out.println(teacher2.name+"\n"+teacher2.gender+"\n"+teacher2.age);
    }
}
class Teacher{
    String name,gender;
    int age;
}
