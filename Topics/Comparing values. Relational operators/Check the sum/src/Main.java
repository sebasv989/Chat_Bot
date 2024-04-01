import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int firstSum = num1 + num2;
        int secondSum = num2 + num3;
        int thirdSum = num1 + num3;

        System.out.println(firstSum == 20 || secondSum == 20 || thirdSum == 20);

        scanner.close();
    }
}