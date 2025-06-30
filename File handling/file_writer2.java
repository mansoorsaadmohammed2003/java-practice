import java.nio.file.Files;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths; 

public class file_writer2 {
    public static void main(String[] args) {
        String a="file_writer1.txt";
        String content="hello every nyan";
        try
        {
            Files.write(Paths.get(a),content.getBytes());
            System.out.println("succesful");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
