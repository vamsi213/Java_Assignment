// File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
import java.io.*;
public class Program36 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("Marks.txt");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();

            String[] spl = line.split(",");
            int total = 0;
            
                for(String a :spl){
                    total=total+Integer.parseInt(a);
                }
                
            System.out.println(total);

        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
