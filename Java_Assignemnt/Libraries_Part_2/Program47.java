import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.io.IOException;;



public class Program47 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path: ");
        String d_Path = sc.nextLine();
        System.out.println("Enter a string: ");
        String s_String = sc.nextLine();

        Path path = Paths.get(d_Path);

        if (!Files.isDirectory(path)){
            System.out.println("Invalid");
            return;

        }
        File directory = new File(d_Path);
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
        } else {
            boolean found = false;
            // Traverse each file in the directory
            for (File file : files) {
                if (file.isFile()) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;
                        // Read each line in the file
                        while ((line = br.readLine()) != null) {
                            // Check if the line contains the search string
                            if (line.contains(s_String)) {
                                System.out.println("Found in file: " + file.getName());
                                found = true;
                                break; // Exit loop after finding the string
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + file.getName());
                    }
    }
    
}
}
}
}

