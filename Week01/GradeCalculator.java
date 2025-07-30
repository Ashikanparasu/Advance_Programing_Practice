import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10: 
                case 9:
                    System.out.println("Grade: A (Excellent)");
                    break;
                case 8:
                    System.out.println("Grade: B (Very Good)");
                    break;
                case 7:
                    System.out.println("Grade: C (Good)");
                    break;
                case 6:
                    System.out.println("Grade: D (Satisfactory)");
                    break;
                default:
                    System.out.println("Grade: F (Fail)");
            }
        } else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
