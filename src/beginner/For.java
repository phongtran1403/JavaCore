package beginner;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("nhập vào số >0");
			int i = sc.nextInt();
			if (i > 0) {
				for (i = 1; i < 10; i++) {
					tong = tong + i;
				}
				System.out.println(tong);
				break;

			} else {
				System.out.println("nhập sai mời nhập lại");
			}
			
		} while (true);

	}
}