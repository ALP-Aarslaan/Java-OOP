import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class $_148_DESERIALIZATION {
    public static void main(String[] args) {
        Employee emp=new Employee();
        try {
            FileInputStream file=new FileInputStream("emp.txt");
            ObjectInputStream obj=new ObjectInputStream(file);
            emp=(Employee)obj.readObject();
            obj.close();
            file.close();
        }catch (Exception e){
            e.getMessage();
        }
        finally {
            System.out.println("Deserializing....");
            System.out.println(emp.name);
            System.out.println(emp.address);
        }
    }
}
