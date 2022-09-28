public class $_15_problem_solving {
    public static void main(String[] args) {
        Box box1=new Box(10,10,10);
        box1.displayVol();
        Box box2=new Box(20,30,10);
        box2.displayVol();

    }
}
class Box{
    double height,weight,depth;
    Box(double height,double weight,double depth){
        this.height=height;
        this.weight=weight;
        this.depth=depth;
    }
    void displayVol(){
        double volume=(height*weight*depth);
        System.out.println("total volume : "+volume);
    }
}
