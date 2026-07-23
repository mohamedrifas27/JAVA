import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a diameter of circle: ");
        int diameter = scanner.nextInt();
        int radius = diameter / 2;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
    }
}