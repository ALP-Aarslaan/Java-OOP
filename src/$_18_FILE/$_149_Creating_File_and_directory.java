import java.io.File;

public class $_149_Creating_File_and_directory {
    public static void main(String[] args) {
        File directory = new File("Person");
        directory.mkdir();
        String dPath=directory.getAbsolutePath();
        System.out.println(dPath);
        File file1=new File(dPath+"/student.txt");
        File file2=new File(dPath+"/teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created successfully");
        }catch(Exception e){
            System.out.println(e);
        }
        //file2.delete();
        if(file2.exists()){
            System.out.println("file 2 is available");
        }
        else{
            System.out.println("file 2 is not available");
        }
    }
}
