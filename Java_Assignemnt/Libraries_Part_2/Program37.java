import java.io.*;
public class Program37 {
 public static void main(String[] args) {
    try{
        FileWriter file = new FileWriter("Marks.txt",true);
        file.write("20\n");
        file.flush();
    }catch(IOException e){
        System.out.println(e.getLocalizedMessage());
    }
 }   
}