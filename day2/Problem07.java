import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Area of Square: ");
        int area = scanner.nextInt();
        int perimeter = 4 * area;
        float side = (float) Math.sqrt(area);
        System.out.println("The side of the square is: " + side);
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}