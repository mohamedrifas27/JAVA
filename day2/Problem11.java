import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        int Celsius = scanner.nextInt();
        double fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}