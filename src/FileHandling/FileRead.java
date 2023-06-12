package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) throws IOException {
        try{
            File file = new File("output.txt");
            FileReader reader = new FileReader(file);

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
