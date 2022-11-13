package honux.calandar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "> ";

	public int parseDay(String week) {
		if (week.equals("SU"))
			return 0;
		else if (week .equals("MO"))
			return 1;
		else if (week.equals("TU"))
			return 2;
		else if (week.equals("WE"))
			return 3;
		else if (week.equals("TH"))
			return 4;
		else if (week.equals("FR"))
			return 5;
		else if (week.equals("SA"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scan = new Scanner(System.in);

		int year = 1;
		int month = 1;

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT);
			year = scan.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12 || month < -1) {
				continue;
			}
			cal.printCalendar(year, month);
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
