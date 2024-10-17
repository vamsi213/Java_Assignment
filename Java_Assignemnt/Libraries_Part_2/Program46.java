import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;



public class Program46 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();

        String re = "^[a-zA-Z]+\\d+$";

        System.out.println("Enter a string , enter end to finish: ");

        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("end")){
                break;
            }

            if(Pattern.matches(re, input)){
                l.add(input);
            }
            else{
                System.out.println("Invalid");
            }
        }
        Collections.sort(l);

        try{
            Path path = Paths.get("Codes.txt");
            Files.write(path,l);
    
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
