package $3Uses_Of_Static_keyword;

public class $_9_Static_variable_part_2 {
    public static void main(String[] args) {
        student ob=new student();
        System.out.println("name : "+ob.UniversityName);
        /**
         * for static variable we don't need to create object
         */
        System.out.println("name : "+student.uni);

    }
}
class student{
    String UniversityName="University of Asia Pacific";
    static String uni="uap";
}
