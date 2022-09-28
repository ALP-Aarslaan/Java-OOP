import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class $_151_how_to_read_from_file {
    public static void main(String[] args) {
        try{
            File file =new File("/home/mohammad-jonayed/IdeaProjects/01.JAVA_COMPLETE_COURSE_BEGINNERS(01)/Person/student.txt");
            Scanner scan =new Scanner(file);
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
