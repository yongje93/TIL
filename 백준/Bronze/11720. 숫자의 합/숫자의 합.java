import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int total = 0;
		String[] array = new String[n];
		String input = scan.next();
		array = input.split("");
		
		for(String s : array) {
			total += Integer.parseInt(s);
		}
		System.out.println(total);
	}

}
