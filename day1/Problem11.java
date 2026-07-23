public class Problem11 {
    public static void main(String[] args) {
        int a = 10;
        float b = a;
        System.out.println("The datatype of a: " + ((Object) a).getClass().getName());
        System.out.println("The datatype of b: " + ((Object) b).getClass().getName());
    }
}