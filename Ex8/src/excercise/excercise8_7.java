package excercise;

import java.util.Scanner;

public class excercise8_7 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요.");
			try {
				input = new Scanner(System.in).nextInt();

				if (answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if (answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("맞췄음");
					System.out.println("시도 횟수는 " + count + "번 입니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			}
		} while (true);
	}

}
