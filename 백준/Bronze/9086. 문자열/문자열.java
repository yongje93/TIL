import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] array = new String[t];

        for (int i = 0; i < t; i++) {
            String text = scanner.next();
            array[i] = text.charAt(0) + String.valueOf(text.charAt(text.length() - 1));
        }

        for (String s : array) {
            System.out.println(s);
        }
    }

}