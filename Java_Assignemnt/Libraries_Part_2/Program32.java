//Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.

import java.util.Scanner;
public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.println("Enter number if you want to exit Enter Zero:");
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            total+=num;
        }
        System.out.println("Sum of given number is :"+total);
    }    
}
