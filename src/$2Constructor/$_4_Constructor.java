public class $_4_Constructor {
    public static void main(String[] args) {
        Teacher3 teacher1=new Teacher3("Mohammad","male",22);
        teacher1.displayInformation();
    }
}
class Teacher3 {
    String name,gender;
    int age;
    Teacher3(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("age : "+age);
        System.out.println();
    }

}
