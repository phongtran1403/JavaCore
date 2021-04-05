package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class MangDaChieu {

	public static void main(String[] args) {
		studyMatrix();
	}

	public static void Test() {
		// khai báo số dòng và số cột
		int soDong, soCot;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số dòng của mảng ");
		soDong = sc.nextInt();
		System.out.println("nhập vào số cột của mảng ");
		soCot = sc.nextInt();
		// khai báo cấp phát bộ nhớ cho mảng
		int[][] A = new int[soDong][soCot];
		// Để nhập giá trị các phần tử cho mảng
		// chúng ta sẽ sử dụng 2 vòng lặp for
		// vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
		// và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
		// mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.println("nhập phần tử thứ [ " + i + "," + j + "]: ");
				A[i][j] = sc.nextInt();
			}
		}
		// hiển thị các phần tử trong mảng vừa nhập
		// chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

			}

		}
		System.out.println(Arrays.deepToString(A));

	}

	// tính tổng phần tử trong ma trận
	public static void studyMatrix() {
		int soDong, soCot;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số dòng của mảng ");
		soDong = sc.nextInt();
		System.out.println("nhập vào số cột của mảng ");
		soCot = sc.nextInt();
		// khai báo cấp phát bộ nhớ cho mảng
		int[][] A = new int[soDong][soCot];
		int sum = 0;
		int tinh = 0;

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.println("nhập phần tử thứ [ " + i + "," + j + "]: ");
				A[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		// hiển thị các phần tử trong mảng vừa nhập
		// chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

			}

		}
		System.out.println(Arrays.deepToString(A));
		// tính tổng từng hàng
		System.out.println("nhập vào dòng cần tính tổng \n" + "số nhập vào phải nhỏ hơn hoặc bằng số dòng ban đầu ");
		tinh = sc.nextInt();
		while (tinh > soDong) {

			System.out.println("nhập sai mời nhập lại ");
			tinh = sc.nextInt();
		}

		for (int number : A[tinh - 1]) {
			sum += number;
		}
		System.out.println("tổng của hàng " + tinh + " là " + sum);

		// tính tổng cột
		System.out.println("nhập vào cột cần tính tổng \n" + "số nhập vào phải nhỏ hơn hoặc bằng số cột ban đầu ");
		tinh = sc.nextInt();
		while (tinh > soCot) {

			System.out.println("nhập sai mời nhập lại ");
			tinh = sc.nextInt();
		}
		System.out.println("giá trị của cột "+ tinh);
		for(int i =0; i<A.length;i++) {
			System.out.println(A[i][tinh-1]);
			sum += A[i][tinh-1];
		}
		
		System.out.println("tổng của hàng " + tinh + " là " +sum );

	}
}
