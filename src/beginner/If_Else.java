package beginner;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		// Câu điều kiện If-Else
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số x cần tìm");
		int x = sc.nextInt();
		if (x % 2 == 0 && x % 5 == 0) {
			System.out.println(x + " là số chia hết cho 5" );
		} else if (x % 3 == 1 || x %3 ==2) {
			System.out.println(x + " là số không chia hết cho 3 ");
		}else {
			System.out.println( x+  " là số không cần tìm");
		}
	DK3N();
	}

	//toán tử kiều kiện 3 ngôi
	public static void DK3N() {
		int y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập  vào số cần kiểm tra chẵn lẻ ");
		y = sc.nextInt();
		String ketQua= (y % 2 ==0)? "Số " + y + " là số chẵn " : "Số "+ y + " là số lẻ";
		System.out.println(ketQua);
	}
}
