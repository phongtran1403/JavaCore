package beginner;

import java.util.Scanner;

public class PrefixAndPostfix {
	// Tiền tố và hậu tố
	// Xử lí x trước tiếp đến result sau cùng là y 
	//X là prefix và y là Postfix
	public static void main(String[] args) {
        int x = 5, y = 7;
        int result = x++ + ++y - 8;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Third variable = " + result);
        soSanh();
    }
	public static void soSanh() {
		double x , y;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào x");
		x = sc.nextDouble();
		System.out.println("nhập vào y");
		y = sc.nextDouble();
		System.out.println("kết quả so sanh bằng là " + (x ==y ));
		System.out.println("kết quả so sanh khác là " + ( x !=y));
		System.out.println("kết quả so sanh x > y là" + (x > y ));
	
	}
}
