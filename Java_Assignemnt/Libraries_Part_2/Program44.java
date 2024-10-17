import java.util.Scanner;

public class Program44 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string seperated by spaces or commas");
        String input = sc.nextLine();

        String separator = "[,\\s]+";

        String[] words = input.split(separator);

        for (String word : words){
            System.out.println(word);
        }
    }
}
