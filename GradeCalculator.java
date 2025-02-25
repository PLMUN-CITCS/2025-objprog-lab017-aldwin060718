import java.util.Scanner;

public class GradeCalculator {

    // Method to calculate the grade based on the score
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Calculate the grade using the calculateGrade method
        char grade = calculateGrade(score);

        // Output the grade
        System.out.println("Your Grade is: " + grade);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
