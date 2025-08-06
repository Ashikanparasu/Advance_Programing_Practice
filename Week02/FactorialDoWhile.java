import java.util.Scanner;
public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        int i = 1;
        if (n == 0) {
            fact = 1;
        } else {
            do {
                fact *= i;
                i++;
            } while (i <= n);
        }
        System.out.println(fact);
    }
}