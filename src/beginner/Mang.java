package beginner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		sort();
	}

	public static void begin() {
		// tạo mảng

		// tạo mảng có kiểu là Striing
		String b[] = new String[] { "Phong ", "Trần" };
		// truy xuất chữ n trong mảng b
		System.out.println("vị trí thứ 1 trong Phong Trần là " + b[0]);
		System.out.println(" nhập vào độ dài mảng a");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		// tạo mảng có kiểu là int
		int a[] = new int[size];
		// a.length: trả về kích thước của mảng
		// vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
		for (int i = 0; i < size; i++) {
			System.out.println("Nhập vào phần tử thứ " + i + ": ");
			a[i] = sc.nextInt();// nhập giá trị cho phần tử

		}
		// hiển thị giá trị cho phần tử
		for (int i = 0; i < size; i++) {
			System.out.println("Phần tử thứ " + i + " của mảng là " + a[i]);
		}

	}

	public static void sort() { // tăng hoặc giảm dần các giá trị của mảng
		int arrInt[] = { 1, 6, 35, 4, 8 };
		// mảng chưa được sắp xếp
		System.out.println("giá trị chưa sắp xếp của mảng lúc đầu:" 
		+ Arrays.toString(arrInt));
		// sắp xếp theo giá trị tăng dần
		Arrays.sort(arrInt);
		System.out.println("giá trị tăng dần của mảng:" 
		+ Arrays.toString(arrInt));
		// phân tích sắp xếp mảng theo giá trị giảm dần
		// muốn xếp theo giá trị giảm dần đầu tiên phải tìm tăng dần

		// tạo chiều dài của mảng
		int lengthArr = arrInt.length;

		// tạo vòng lặp for để đổi vị trí của mảng
		// vị trí 0 thay cho vị trí lengthArr-1
		// 1 thay cho lengthArr -2
		// cứ như vậy xét cho tới vị trí của lengthArr/2
		for (int i = 0; i < lengthArr / 2; i++) {
			// tạo 1 mảng mới để đổi vị trí
			// ví dụ muốn chuyển vị trí của A với B
			// ta cần tạo C để đưa A->C
			// B-> A
			// A từ C về B
			int element = arrInt[i];
			arrInt[i] = arrInt[lengthArr - i - 1];
			arrInt[lengthArr - i - 1] = element;
		}
		// xem thông tin của mảng 
		System.out.println(Arrays.toString(arrInt));
		
		

	}

	public static void test() {
		// tìm phần tử nhập vào trong mảng
		int n, max = 100, i;
		// tạo mảng A có số phần tử là max
		int A[] = new int[max];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhập vào số phần tử của mảng");
			n = sc.nextInt();
		} while (n <= 0 || n >= max);
		System.out.println("nhập giá trị cho các phần tử của mảng");
		for (i = 0; i < n; i++) {
			System.out.println(" Mảng A[ " + i + " ] = ");
			A[i] = sc.nextInt();
		}
		// nhập số nguyên cần tìm
		System.out.println("nhập số nguyên cần tìm ");
		int k = sc.nextInt();
		// tiến hành tìm kiếm phần tử
		// nếu không tìm thấy giá trị tại i bằng với số nguyên k
		// thì tăng i lên 1
		while (i < n && A[i] != k) {

		}
		// Nếu i lớn hơn số phần tử của mảng - 1
		// thì thông báo không tìm thấy phần tử
		// ngược lại hiển thị ra i
		if (i > n - 1) {
			System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
		} else {
			System.out.println("Phần tử đầu tiên có giá trị bằng " + k + " tại vị trí = " + i);
		}
	}

}
