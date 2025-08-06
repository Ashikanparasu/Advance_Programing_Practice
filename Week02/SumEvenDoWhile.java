import java.util.Scanner;
public class SumEvenDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, i = 2;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
}