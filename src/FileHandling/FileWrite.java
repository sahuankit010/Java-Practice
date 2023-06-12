package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            String data = "Hello, I am Ankit\n";
            System.out.println("Enter something to write in the file or press -1 to exit");
            writer.write(data);
            Scanner sc = new Scanner(System.in);
            while(true) {
                data = sc.nextLine();
                if (data.equals("-1")) break;
                writer.write(data + "\n");
            }
            writer.close();
            sc.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {

        }
    }
}
