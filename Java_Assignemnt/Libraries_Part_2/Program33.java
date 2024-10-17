// Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.

import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("names.txt");
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Enter name ,Enter \"end\" if you want to terminate :");
                String line = sc.nextLine();
                if(line.equalsIgnoreCase("end")){
                    break;
                }
                fw.write(line+"\n");
                fw.flush();

            }
            BufferedReader br = new BufferedReader(new FileReader("names.txt"));
            String l;
            while((l=br.readLine())!=null){
                System.out.println(l);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
