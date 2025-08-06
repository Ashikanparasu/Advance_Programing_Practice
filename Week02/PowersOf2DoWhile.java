import java.util.Scanner;
public class PowersOf2DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        int i = 0;
        do {
            System.out.println((int)Math.pow(2, i));
            i++;
        } while (i <= exp);
    }
}