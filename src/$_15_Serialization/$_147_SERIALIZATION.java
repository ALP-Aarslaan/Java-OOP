import java.io.*;

public class $_147_SERIALIZATION {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Mohammad Jonayed";
        emp.address="Debidwar,Cumilla,Bangladesh";
        try{
            FileOutputStream file=new FileOutputStream("emp.txt");
            ObjectOutputStream obj=new ObjectOutputStream(file);
            obj.writeObject(emp);
            obj.close();
            file.close();
            System.out.println("Serialized data is saved in emp.txt file");
        }catch (IOException e){
            e.getMessage();
        }
    }
}

class Employee implements Serializable{
    String name;
    String address;
}