package $_10_Polymorphism;

import java.util.Scanner;

public class $_128_method_overriding {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter how many time you want to calculate : ");
        int size=scan.nextInt();
        Shape s[]=new Shape[size];
        s[0]=new Shape();
        s[1]=new Rectangle(10,10);
        s[2]=new Triangle(10,10);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].area());
        }
    }
}
class Shape{
    double area(){
        System.out.println("area of shape : ");
        return 0;
    }
}
class Triangle extends Shape{
    double height,base;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        System.out.println("area of triangle : ");
        return .5*base*height;
    }
}
class Rectangle extends Shape{
    double height,width;
    Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }

    @Override
    double area() {
        System.out.println("area of rectangle : ");
        return height*width;
    }
}
