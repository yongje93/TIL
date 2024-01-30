import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for (int num : numbers) {
            if (num == v) {
                count++;
            }
        }

        System.out.println(count);
    }

}