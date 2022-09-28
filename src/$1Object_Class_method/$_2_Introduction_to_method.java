public class $_2_Introduction_to_method {
    public static void main(String[] args) {
        Teacher1 teacher1=new Teacher1();
        teacher1.name="MOhammad JOnayed Sarkar";
        teacher1.gender="Male";
        teacher1.age=22;
        teacher1.displayInformation();

    }
}
class Teacher1{
    String name,gender;
    int age;
    //creating a method to display information of a teacher
    void displayInformation(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
    }
}