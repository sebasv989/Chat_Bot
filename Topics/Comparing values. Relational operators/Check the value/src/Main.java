import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberInput = scanner.nextInt();

        boolean lessThan10 = numberInput < 10;

        System.out.println(lessThan10);

        scanner.close();
    }
}