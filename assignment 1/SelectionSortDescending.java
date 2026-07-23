public class BubbleSortDescending {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Descending Order:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}