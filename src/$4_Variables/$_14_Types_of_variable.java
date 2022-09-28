public class $_14_Types_of_variable {
    public static void main(String[] args) {

    }
}

/**
 * 3 types of variables :
 * 1.local
 * 2.instance
 * 3.static or class variable
 *
 * local variable:
 * local variable is a variable which are declared in a method
 * example : check below that inside a constructor there is a string type variable
 * n,and integer type variable i these are local variable of this constructor
 * and constructor is a special type of method. this variables we can't use any where
 * outside of the method
 *
 * instance variables:
 * these variables are declared inside a class but not inside a method.these will
 * not be declared as static
 * example:check below class
 * String name,int id,float marks these are instance variable of this class
 *
 * static variable:
 * we can easily recognize these variables because there is always a keyword
 * "static" before the name of a variable.it can't be declared as local variables
 * example:check below class "static String university="UAP""
 */
class TypesOfVariables{
    String name;
    int id;
    float marks;
    static String university="UAP";
    TypesOfVariables(String n,int i){
        name=n;
        id=i;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("marks : "+marks);
    }
}
