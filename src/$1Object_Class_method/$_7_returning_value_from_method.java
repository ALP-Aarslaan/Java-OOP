import java.util.Scanner;

public class $_7_returning_value_from_method {
    public static void main(String[] args) {
        RM ob1=new RM();
        System.out.println("enter any number:");
        Scanner scan=new Scanner(System.in);
        int value=scan.nextInt();
        System.out.println("square of "+value+" is :"+ob1.square(value));
    }
}
class RM{
    int square(int value)
    {
        return value*value;
    }
}
