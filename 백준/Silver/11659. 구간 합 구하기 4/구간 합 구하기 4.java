import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] array = new int[N + 1];
        array[0] = 0;
        
        for (int i = 1; i <= N; i++) {
            array[i] = array[i - 1] + sc.nextInt();
        }
        
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(array[b] - array[a-1]);
        }
    }
}