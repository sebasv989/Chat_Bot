import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Your code here
        String checker = number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero";

        System.out.println(checker);

        scanner.close();
    }
}