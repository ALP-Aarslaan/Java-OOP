package $_11_Abstraction;

public class $_131_abstraction_problem_solving {
    public static void main(String[] args) {
        shape s1;
        s1=new Circle(10);
        s1.area();
        s1=new Rectangle(10,20);
        s1.area();
        s1=new Triangle(10,20);
        s1.area();
    }
}
abstract class shape{
    double dim1,dim2;
    shape(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
}
class Circle extends shape{
    double r;
    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result =Math.PI*(dim1*dim2);
        System.out.println("area of a circle : "+result);
    }
}
class Rectangle extends shape{
    double height,width;
    Rectangle(double height,double width){
        super(height,width);
    }

    @Override
    void area() {
        double result= dim1*dim2;
        System.out.println("area of a rectangle is : "+result);
    }
}
class Triangle extends shape{
    double height,base;
    Triangle(double base,double height){
        super(base,height);
    }

    @Override
    void area() {
        double result=0.5*dim1*dim2;
        System.out.println("area of a triangle : "+result);
    }
}
