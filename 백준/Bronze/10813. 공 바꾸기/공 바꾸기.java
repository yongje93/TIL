import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        for (int idx = 0; idx < m; idx++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int temp = array[i - 1];
            array[i - 1] = array[j - 1];
            array[j - 1] = temp;
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }

}
