import java.util.Scanner;
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}