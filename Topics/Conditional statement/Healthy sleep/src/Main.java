import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sleepNumber1 = scanner.nextInt();
        int sleepNumber2 = scanner.nextInt();
        int sleepNumber3 = scanner.nextInt();


        if (sleepNumber3 < sleepNumber1) {
            System.out.println("Deficiency");
        } else if (sleepNumber3 > sleepNumber2) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

        scanner.close();
    }
}