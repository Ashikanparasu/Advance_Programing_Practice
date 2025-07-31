import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("\nEven numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
