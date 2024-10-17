import java.util.Scanner;


public class Program29 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] numbers = new String[5];
        int sum = 0;

        System.out.println("Enter Five Valid Numbers");
        for(int i=0; i<5; i++){
            numbers[i] = sc.nextLine();
        }

        for(String num: numbers){

            try{
            int number = Integer.parseInt(num);
            sum += number;

        }
        catch(NumberFormatException e){
            System.out.println("Invalid input '" + num + "', skipping.");
        }
    }
    System.out.println("The total sum of valid numbers is: " + sum);
    
}
}
