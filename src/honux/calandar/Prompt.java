package honux.calandar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scan = new Scanner(System.in);

		int month = 1;

		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12 || month < -1) {
				continue;
			}
			cal.printCalendar(2022, month);
		}
		System.out.println("gg");
		scan.close();
	}

	public static void main(String[] args) {

		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
