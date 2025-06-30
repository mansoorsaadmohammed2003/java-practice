import java.io.FileOutputStream;
import java.util.*;
public class create_file {
public static void main(String[] args) {
    try(FileOutputStream fos=new FileOutputStream("FileOutputStreamimages.jpg")) {
        System.out.println("binary file succesfully created");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
}
    
}