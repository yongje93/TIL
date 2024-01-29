import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int total = 60 * a + b + c;
        
        int hour = (total / 60) % 24;
        int minute = total % 60;

        System.out.println(hour + " " + minute);
    }
}
