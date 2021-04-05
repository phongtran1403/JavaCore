package beginner;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		// thực hiện lệnh do trước khi kiểm tra điều kiện của whlie
		do {
			System.out.println("nhập vào giá trị của x là số có 1 chữ số khác 0");
			
			int x = sc.nextInt();
			tong += x;
		}while(tong <10 ) ;
			System.out.println(tong);
		
	}
}
