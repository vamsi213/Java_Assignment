import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;


public class Program48 {

    public static void main(String[] args) {
        
        String fileName = "customers.txt";
        List<String> l = new ArrayList<>();
        String re = "^[a-zA-Z]+\\s\\d{10}$";
        Pattern p = Pattern.compile(re);

        try{
            Path path = Paths.get(fileName);
            List<String> lines = Files.readAllLines(path);
            for(String line:lines){
                Matcher m = p.matcher(line);
                if(m.matches()){
                    l.add(line);
                }
                
            }
            l.sort((c1, c2) -> c1.split(" ")[0].compareToIgnoreCase(c2.split(" ")[0]));
            System.out.println("Sorted customer list by name:");
            for (String customer : l) {
                System.out.println(customer);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
