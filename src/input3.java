import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class input3 {
   public static void main(String[] args) throws IOException {
     InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\temp\\1.txt"));

//   FileInputStream test1 = new FileInputStream("C:\\temp\\1.txt");

//        int x = inputStreamReader.read();
        inputStreamReader.read();

        System.out.println(inputStreamReader);
    }

 /*   FileInputStream inputStream = new FileInputStream("C:\\temp\\1.txt");
try {
        String everything = IOUtils.toString(inputStream);
    } finally {
        inputStream.close();
    }


 try(FileInputStream inputStream = new FileInputStream("C:\\temp\\1.txt")) {
        String everything = IOUtils.toString(inputStream);
        // do something with everything string

  */
    }