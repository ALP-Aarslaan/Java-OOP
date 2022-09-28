public class $_19_automatic_type_conversion {
    public static void main(String[] args) {
        addition ob1=new addition();
        ob1.sum();
        ob1.sum(1,2,3);
        ob1.sum(23,32);
    }
}
class addition{
    void sum(){
        System.out.println("none");
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
    void sum(float a,float b,float c){
        System.out.println(a+b+c);
    }
}
