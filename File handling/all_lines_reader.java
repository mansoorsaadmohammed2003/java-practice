import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class all_lines_reader {
    public static void main(String[] args) {
        String a="filewriter.txt";
        try {
            List<String> lines=Files.readAllLines(Paths.get(a));//get the file from the given path
            for(String line:lines){//use for each
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
