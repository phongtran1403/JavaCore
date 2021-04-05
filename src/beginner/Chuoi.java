package beginner;

import java.util.Scanner;

public class Chuoi {

	public static void main(String[] args) {
		equal();
	}

	public static void test1() {
		// tạo chuỗi
		String chuoi = "Xin chao";
		// cách 2
		String chuoi1 = new String("");
		// cách 3
		String chuoi3 = new String();
		chuoi3 = "";

		// đếm độ dài chuỗi
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn ");
		chuoi1 = sc.nextLine();
		int dem = chuoi1.length();
		System.out.println("Tên " + chuoi1 + "có " + dem + " kí tự.");

		// nối chuỗi
		String noi = chuoi.concat(" ").concat(chuoi1);
		System.out.println(noi);

		// Lấy ra 1 kí tự trong chuỗi
		char kiTu = chuoi1.charAt(0);
		System.out.println(kiTu);

		// so sánh độ dài 2 chuỗi
		// dùng compareTo
		int ketQua = chuoi.compareTo(chuoi1);
		if (ketQua == 0) {
			System.out.println(chuoi1 + " có số kí tự bằng " + chuoi);
		} else if (ketQua < 0) {
			System.out.println(chuoi1 + " có số kí tự ít hơn " + chuoi);
		} else {
			System.out.println(chuoi1 + " có số kí tự nhiều hơn " + chuoi);
		}
		// Hàm trả về vị trí xuất hiện đầu tiên của chuỗi này trong chuỗi khác. nếu k có
		// sẽ cho kết quả bằng -1
		int ketQua1 = chuoi.indexOf(chuoi1);
		System.out.println("Vị trí đầu tiên xuất hiện chuỗi " 
		+ chuoi1 
		+ " trong chuỗi " 
		+ chuoi 
		+ " = " 
		+ ketQua);
		int ketQua2 = chuoi.lastIndexOf(chuoi1);
		System.out.println("Vị trí cuối cùng xuất hiện chuỗi " 
		+ chuoi1 
		+ " trong chuỗi " 
		+ chuoi 
		+ " = " 
		+ ketQua);

		// thay đổi chuỗi
		String y = chuoi.replace("chao", "con cặc");
		System.out.println(y);

	}

	public static void test2() {
		// chuyển chuỗi số thành số
		// nếu trong chuỗi có kí tự sẽ lỗi
		String chuoi = new String("555");

		// chuyển
		int number = Integer.parseInt(chuoi);
		System.out.println("giá trị của chuỗi +5 là :" + (number + 5));
	}

	public static void equal() {// so sánh 2 chuỗi = hay k bằng nhau
		String chuoi1= new String("Java");
		String chuoi2= new String("JaVa");
		System.out.println("sánh phân biệt chữ hoa và chữ thường: "
				+chuoi1.equals(chuoi2));
		System.out.println("sánh không phân biệt chữ hoa và chữ thường: "
				+chuoi1.equalsIgnoreCase(chuoi2));
	}

}
