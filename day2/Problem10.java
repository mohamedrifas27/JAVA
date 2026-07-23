import java.util.Scanner;
public class Problem10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        int hours = minutes / 60;
        int minutesremaining = minutes % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutesremaining);
    }
}