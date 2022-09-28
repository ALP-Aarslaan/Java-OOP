package $3Uses_Of_Static_keyword;

public class $_8_static_variable {
    public static void main(String[] args) {
        Student s1=new Student("Mohammad",19);
        s1.displayInformation();
        Student s2=new Student("Arslan",19);
        s1.displayInformation();
    }
}
class Student{
    String name;
    int id;
    static String UniName="Uap";
    Student(String n,int i){
        name=n;
        id=i;
    }
    void displayInformation(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("university name : "+UniName);
    }
}
