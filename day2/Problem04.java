import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of Rectangle: ");
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}