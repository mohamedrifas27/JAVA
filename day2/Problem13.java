import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The last number of the given number is: " + (number % 10));
    }
}
