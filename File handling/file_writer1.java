import java.io.File;
import java.io.FileOutputStream;

public class file_writer1 {
    public static void main(String[] args) {
        String a="file_writer1.txt";
        String content="hello every nyan";
        try(FileOutputStream fos=new FileOutputStream(a)){
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("succesfully stored");
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
