public class $_5_types_of_constructor {
    public static void main(String[] args) {
        //two types constructor:
        /**
         * 1.default constructor;
         * 2.parameterized constructor
         */
        Teacher4 teacher1=new Teacher4();
        teacher1.displayInformation();
        Teacher4 teacher2=new Teacher4("Mohammad",22);
        teacher2.displayInformation();
    }
}
class Teacher4{
    String name;
    int age;
    Teacher4(){

    }
    Teacher4(String n,int a){
        name=n;
        age=a;
    }
    void displayInformation(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println();
    }
}
