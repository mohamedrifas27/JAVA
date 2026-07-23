import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int cube = number * number * number;
        System.out.println("The cube of the number is: " + cube);
    }
}