import java.io.FileInputStream;

public class file_input_stream {
    public static void main(String[] args) {
        String a="demopic.jpg";
        try(FileInputStream fis=new FileInputStream(a)) {
            int characters;//use this var for conversion
            while ((characters=fis.read()) != -1) { //character stores ASCII values and -1 represents the end of line {EOL}
                System.out.println((byte)characters);//using expicit gtypecasting u convert ascci into string again , using type casting cuz int size is 4 and char size is 2
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//output will be in binary but u can convert it using (char)character in above example
}
