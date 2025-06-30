import java.io.FileReader;

public class file_read {
    public static void main(String[] args) {
        String a="witefile.txt";
        try(FileReader reader=new FileReader(a)) {
            int characters;//use this var for conversion
            while ((characters=reader.read()) != -1) { //character stores ASCII values and -1 represents the end of line {EOL}
                System.out.print((char)characters);//using expicit gtypecasting u convert ascci into string again , using type casting cuz int size is 4 and char size is 2
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
