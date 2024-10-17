import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Program40 {

    public static void main(String[] args) {

        try{
            Path path1 = Paths.get("names1.txt");
            Path path2 = Paths.get("names2.txt");

        Set<String> uniquenames = new LinkedHashSet<>();

        List<String> names1 = Files.readAllLines(path1);
        List<String> names2 = Files.readAllLines(path2);

        uniquenames.addAll(names1);
        uniquenames.addAll(names2);

        for (String name: uniquenames){
            System.out.println(name);
        }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        

    }
    
}
