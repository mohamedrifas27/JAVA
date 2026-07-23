import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        int farenheit = scanner.nextInt();
        double celsius = (farenheit - 32) * 5/9;
        System.out.printf("The temperature in Celsius is: %.2f ", celsius);
    }
}