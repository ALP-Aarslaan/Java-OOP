package $_9_Final_keyword;

public class $_124_final_keyword {
    public static void main(String[] args) {
        University ob=new University();
        ob.display();
    }
}
class University{
    final String UNIVERSITY_NAME="University Of Asia Pacific";
    final int fees;//blank final variable
    static final int year;//static blank final variable
    static {
        year=4;
    }
    University(){
        fees=85000;
    }
    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println("fees : "+fees);
        System.out.println("year : "+year);
    }
}
