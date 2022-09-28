import java.util.Scanner;

public class $_22_factorial_using_recursion {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number : ");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        int n=fact(num);
        System.out.println("factorial of "+num+"is :"+n);
    }
    public static int fact(int num){
        if(num==0)
            return 1;
        else
            return num*fact(num-1);
    }
}
