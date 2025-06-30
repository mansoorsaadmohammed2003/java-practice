import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        String a="filewriter.txt";
        File file=new File(a);
        try {
            FileWriter writer=new FileWriter(file);
            System.out.println("succesfully addded data");
            writer.write("Hello devs\n");
            writer.write("welocome to this Company");            
            writer.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        
    }
}
