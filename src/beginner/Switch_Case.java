package beginner;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào giá trị cần tìm ");
		int x = sc.nextInt();
		int y = x % 5;

		switch (y) {
		case 0: {
			System.out.println(x+ "Là số k chia  hết cho 5");
			break;
		}
		case 1: {
			System.out.println(x+ "Là k số chia hết cho 5");
			break;
		}
		case 2: {System.out.println(x+ "Là k số chia hết cho 5");
		break;
		}
		case 3: {System.out.println(x+ "Là k số chia hết cho 5");
		break;
		}
		case 4: {System.out.println(x+ "Là số k chia hết cho 5");
		break;
		}

		default:
			// không có defaut trong th này
		}
	}

}
