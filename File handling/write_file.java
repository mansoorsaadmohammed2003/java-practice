
import java.nio.file.Files;
import java.nio.file.Paths;
public class write_file {
    public static void main(String[] args) {
        String a="witefile.txt";
        try{
            Files.write(Paths.get(a),"Hello Saad".getBytes());
            System.out.println("file created succesfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
