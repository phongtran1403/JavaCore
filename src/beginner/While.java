package beginner;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int tong =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào giá trị x <=100 ");
		int x = sc.nextInt();
		if(x <=100) {
			while (x<=100) {
			  tong = tong +x ;
			  x++;
			}
			System.out.println(" tổng các số từ " + x +" đến 100 là " + tong );
		}else {
			System.out.println("nhập sai");
		}
	}

}
