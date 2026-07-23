import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mathematics Subject Marks: ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter English Subject Marks: ");
        int englishMarks = scanner.nextInt();
        System.out.print("Enter Computer Science Subject Marks: ");
        int computerScienceMarks = scanner.nextInt();

        int totalMarks = mathMarks + englishMarks + computerScienceMarks;
        double averageMarks = (double) totalMarks / 3;

        System.out.println("The total marks are: " + totalMarks);
        System.out.printf("The average marks are: %.2f%n" , averageMarks);
    }
    
}