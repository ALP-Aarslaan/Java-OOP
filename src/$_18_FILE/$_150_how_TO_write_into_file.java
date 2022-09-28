import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class $_150_how_TO_write_into_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan =new Scanner(System.in);
        PrintStream p=new PrintStream(new File("/home/mohammad-jonayed/IdeaProjects/01.JAVA_COMPLETE_COURSE_BEGINNERS(01)/Person/student.txt"));
        try{
            System.out.println("Write \"EXIT\" to stop ");
            System.out.println("enter data : ");
            String s=scan.nextLine();
            while(!s.equals("Exit")){
                p.println(s);
                s= scan.nextLine();
            }
            p.close();
        }catch (Exception e){
            e.getMessage();
        }
    }
}
