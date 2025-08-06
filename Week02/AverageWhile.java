import java.util.Scanner;
public class AverageWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            sum += num;
            count++;
        }
        if (count > 0) {
            System.out.println(sum / count);
        }
    }
}