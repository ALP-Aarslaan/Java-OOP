public class $_3_parameterized_method {
    public static void main(String[] args) {
        Teacher2 teacher1=new Teacher2();
    //    teacher1.setInformation("Mohammad Jonayed","Male",22);
        teacher1.displayInformation("Mohammad Jonayed","Male",22);
    }
}
class Teacher2{
    String name,gender;
    int age;
   /* void setInformation(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }

    */
    void displayInformation(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
        System.out.println("name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("\n");
    }
}