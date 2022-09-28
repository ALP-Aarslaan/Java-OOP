package $_7_Super_Keyword;

public class $_4_full_Usages_of_super_keyword {
    public static void main(String[] args) {
        car a=new car(100000,"black","BMW");
        a.attributes();
    }
}
class vehicle{
    String colour;
    int price;
    vehicle(int price,String colour){
        this.colour=colour;
        this.price=price;
    }
    void attributes(){
        System.out.println("colour : "+colour);
        System.out.println("Price : "+price);
    }
}
class car extends vehicle{
    String name;
    car(int price,String colour,String name){
        super(price,colour);
        this.name=name;
    }
    void attributes(){
        super.attributes();
        System.out.println("name : "+name);
    }
}