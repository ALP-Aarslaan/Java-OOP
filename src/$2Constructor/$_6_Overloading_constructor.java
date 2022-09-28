public class $_6_Overloading_constructor {
    public static void main(String[] args) {
        Teacher5 teacher1=new Teacher5();
        teacher1.DisplayInformation();
        Teacher5 teacher2=new Teacher5("Mohammad","male");
        teacher2.DisplayInformation();
        Teacher5 teacher3=new Teacher5("Mohammad",22,"male");
        teacher3.DisplayInformation();
    }
}
class Teacher5{
    String name;
    int age;
    String gender;
    Teacher5(){
        System.out.println("No information");
    }
    Teacher5(String n,String g){
        name=n;
        gender=g;
    }
    Teacher5(String n,int a,String g){
        name=n;
        gender=g;
        age=a;
    }
    void DisplayInformation(){
        System.out.println("name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("age : "+age);
        System.out.println();
    }
}
