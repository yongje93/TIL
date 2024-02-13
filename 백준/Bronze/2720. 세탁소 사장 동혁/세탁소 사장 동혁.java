import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < t; i++) {
            int c = scanner.nextInt();
            System.out.print(c / quarter + " ");
            c = c % quarter;
            System.out.print(c / dime + " ");
            c = c % dime;
            System.out.print(c / nickel + " ");
            c = c % nickel;
            System.out.println(c / penny + " ");
        }
    }

}
