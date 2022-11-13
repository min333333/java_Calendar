package honux.calandar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		System.out.println("두 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		String[] split = value.split(",");
		a = Integer.parseInt(split[0]);
		b = Integer.parseInt(split[1]);
		System.out.println("두 수의 합은 " + (a + b));
		scan.close();
	}
}
