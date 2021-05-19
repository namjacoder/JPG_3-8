package calendar3_8;

import java.util.Scanner;

public class Calendar {
	static int[] MONTH_LAST_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getMaxDaysOfMonth(int index) {
		return MONTH_LAST_DAY[index-1];
	}

	public static void main(String[] args) {
		System.out.println("반복횟수를 입력하세요.");
		System.out.print("cal>");
		
		Scanner scanner = new Scanner(System.in);
		
		//int만 입력
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("숫자를 입력해주세요.");
		}

		int input = scanner.nextInt();
		
		for (int i=0; i<input; i++) {
			System.out.println("월을 입력하세요.");
			System.out.print("cal>");

			Scanner scanner2 = new Scanner(System.in);
			
			//int만 입력
			while(!scanner2.hasNextInt()) {
				scanner2.next();
				System.out.println("숫자를 입력해주세요.");
			}
			
			int input2 = scanner2.nextInt();
			
			//3-9 풀이 소스에는 continue를 썼음. 이게 왜 생각이 안났을까.
//			if(input2 < 1 || input2 > 12) {
//				continue;
//			}
			
			if(input2 < 1 || input2 > 12 || input2 == -1) {
				System.out.println("Have a nice day!");
				scanner2.close();
				break;
			}
			
			System.out.println(input2+"월은 "+MONTH_LAST_DAY[input2-1]+"일까지 있습니다.");
		}
		
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		//3-8 소스
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		
//		System.out.println("반복횟수를 입력하세요.");
//		int repeat = scanner.nextInt();
//		
//		
//		for(int i=0; i<repeat; i++) {
//			System.out.println("달을 입력하세요");
//			int month = scanner.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, getMaxDaysOfMonth(month));
//		}
//		
//		System.out.println("Bye~");
//		scanner.close();
	}
}
