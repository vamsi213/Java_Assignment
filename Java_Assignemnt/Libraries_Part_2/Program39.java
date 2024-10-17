
import java.io.*;
import java.util.*;
import java.nio.file.*;


public class Program39 {

    public static void main(String[] args) {
        
    

        String filename = "names.txt";
    
        try {
    
            List<String> lines = Files.readAllLines(Paths.get(filename));
    
            Set<String> uniquenames = new TreeSet<>(lines);
    
            for (String name : uniquenames){
                System.out.println(name);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
