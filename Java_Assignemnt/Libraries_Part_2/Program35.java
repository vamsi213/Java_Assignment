//  Write a program to display lines that contains more than 5 characters.



import java.io.*;

public class Program35 {
    public static void main(String[] args) {
       try{
            
            BufferedReader br = new BufferedReader(new FileReader("names.txt"));
            String line ;
            while((line=br.readLine())!=null){
                if(line.length()>5){
                    System.out.println(line);
                }
            }

       }catch(IOException e){
            e.printStackTrace();
       }
    }
}
