import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll number: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("The name is: " + name);
        System.out.println("The Roll number is: " + n);
    }
}