public class $_20_call_by_value_Or_call_By_reference {
    public static void main(String[] args) {

        object s=new object();
        int x=10;
        System.out.println("before change : "+x);
        s.change(x);
        System.out.println("after change : "+x);
        s.name="Mohammad";
        System.out.println("before change : "+s.name);
        s.change(s);
        System.out.println("after change :"+s.name);
    }
}

class object{
    String name;
    void change(object r){
        r.name="Sarkar";

    }
    void change(int i){
        i=20;
    }
}
