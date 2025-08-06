import java.util.Scanner;
public class SimpleInterestFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            double si = (p * r * i) / 100;
            System.out.println("Year " + i + ": " + si);
        }
    }
}