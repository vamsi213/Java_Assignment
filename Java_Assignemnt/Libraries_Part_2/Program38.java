//Write a program to accept a file and convert its contents to uppercase.(write in compact way)

import java.io.*;
import java.util.*;
import java.nio.file.*;


public class Program38 {

    public static void main(String[] args) {

        try{
        
        Path path = Paths.get("names.txt");
        String content = Files.readString(path);
        Files.writeString(path, content.toUpperCase());

        
    }
    catch(IOException e){
        e.printStackTrace();
    }
    
}
}

