import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Program43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PAN number: ");
        String pan = sc.nextLine();
        String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern pattern = Pattern.compile(panRegex);
        Matcher matcher = pattern.matcher(pan);

        if (matcher.matches()) {
            System.out.println("PAN number is valid.");
        } else {
            System.out.println("PAN number is invalid.");
        }
        sc.close();


}
}
