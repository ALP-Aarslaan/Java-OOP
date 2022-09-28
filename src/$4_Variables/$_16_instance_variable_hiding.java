public class $_16_instance_variable_hiding {
    public static void main(String[] args) {
        Instance ob1=new Instance("jonayed",10,23.4f);
        ob1.display();
    }
}
class Instance{
    String name;
    int id;
    float marks;
    Instance(String name,int id,float marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
    void display(){
        System.out.println("using \"this keyword\" to un hide the local variables ");
    }
}
