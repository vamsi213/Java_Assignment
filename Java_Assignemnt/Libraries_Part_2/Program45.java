import java.io.*;
import java.nio.file.*;

public class Program45 {
    public static void main(String[] args) {
        
        try{

            String filepath = "names.txt";
            Path path = Paths.get(filepath);

            String content = new String(Files.readAllBytes(path));

            String new_content = content.replaceAll("\\s+", " ");

            Files.write(path,new_content.getBytes());


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
