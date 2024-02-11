
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        int length = text.length();

        int answer = 1;

        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                answer = 0;
            }
        }

        System.out.println(answer);
    }

}