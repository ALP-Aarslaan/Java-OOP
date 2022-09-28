package $_8_This_keyword;

public class $_1_this_keyword {
    public static void main(String[] args) {
        person p1=new person("mohammad",22);
        p1.display();
        System.out.println();
        p1.display1();
        person p2=new person("mohammad",22,"Brown");
        p2.display1();

    }
}
class person{
    int age;
    String name;
    String hairColour;

    person(String name,int age){
        this.age=age;
        this.name=name;
    }
    person(String name,int age,String hairColour){
        this(name,age);
        this.hairColour=hairColour;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }
    void display1(){
        this.display();
        System.out.println("hair colour : "+hairColour);
    }
}
/**
 * we use this keyword to access current class constructor method and variables
 */
