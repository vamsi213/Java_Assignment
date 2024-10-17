//Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.
import java.io.*;
import java.util.*;
public class Program34 {
    public static void main(String[] args) {
        try{
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter file name ");
            String fName = sc.nextLine();
            FileReader fr = new FileReader(fName);
            int data;
            int upperCount = 0;
            int lowerCount =0;
            while((data=fr.read())!=-1){
                char ch = (char)data;
                if(Character.toUpperCase(ch)==(char)(data)){
                    upperCount++;
                }else if(Character.toLowerCase(ch)==(char)(data)){
                    lowerCount++;
                }

            }
            System.out.println("Lower case Letters are :"+lowerCount);
            System.out.println("Upper Case Letters are :"+upperCount);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
