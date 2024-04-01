import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        // The second operation goes here
        int divideBy2 = input % 2;
        int times3 = divideBy2 * 3;

        System.out.println(divideBy2);
        System.out.println(times3);

        scanner.close();
    }
}