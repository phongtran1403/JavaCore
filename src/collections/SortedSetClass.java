package collections;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {

	public static void main(String[] args) {
//		subSet();
//		headSet();
//		tailSet();
		firstAndLast();

	}

	public static void sorted() {
		Scanner sc = new Scanner(System.in);
		SortedSet<String> sortedSet = new TreeSet<String>();

		System.out.println("nhập vào số phần tử của sortedSet ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào dữ liệu của phần tử thứ " + i);
			sortedSet.add(sc.next());
		}

		System.out.println(sortedSet);
	}

	public static void subSet() {
		// trích xuất phần tử
		// giá trik trích xuất trong khoảng sẽ có giá trị từ [a,b)
		Scanner sc = new Scanner(System.in);
		SortedSet<String> sortedSet = new TreeSet<String>();

		System.out.println("nhập vào số phần tử của sortedSet ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào dữ liệu của phần tử thứ " + i);
			sortedSet.add(sc.next());
		}
		// khai báo 1 SortedSet có tên là subset
		// có các phần tử được trích xuất
		// trong đoạn [StringA ,StringB) của sortedsetInteger
		System.out.println("nhập vào giá trị cần tìm ở vị trí đầu ");
		String a = sc.next();
		System.out.println("nhập vào giá trị cần tìm ở vị trí cuối ");
		String b = sc.next();
		SortedSet<String> sortedSet2 = sortedSet.subSet(a, b);
		System.out.println("giá trị trong đoạn từ " + a + " đến " + b + " là ");
		System.out.println(sortedSet2);

		// nếu phần tử đầu và phần tử cuối bằng nhau
		// thì kết quả của phương thức subSet()
		// sẽ trả về subset không có phần tử nào

	}

	public static void headSet() {
		// giá trị trích xuất sẽ từ đầu cho tới giá trị cần tìm
		// giá trik trích xuất trong khoảng sẽ có giá trị từ [đầu , a)

		Scanner sc = new Scanner(System.in);
		SortedSet<String> sortedSet = new TreeSet<String>();

		System.out.println("nhập vào số phần tử của sortedSet ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào dữ liệu của phần tử thứ " + i);
			sortedSet.add(sc.next());
		}

		// khai báo 1 SortedSet có tên là headset
		// có các phần tử được trích xuất
		// từ phần tử đầu tiên đến
		// phần tử đứng trước phần tử 5 trong sortedsetInteger
		System.out.println("nhập vào giá trị làm mốc trích xuất" + "\n" + "trích xuất từ đầu tới giá trị vừa nhập");
		String a = sc.next();
		SortedSet<String> headset = sortedSet.headSet(a);
		System.out.println("Các phần tử có trong headset: ");
		System.out.println(headset);
	}

	public static void tailSet() {
		// khai báo từ phần tử nhập vào đến phần tử cuối
		// giá trik trích xuất trong khoảng sẽ có giá trị từ [a,cuối]

		Scanner sc = new Scanner(System.in);
		SortedSet<String> sortedSet = new TreeSet<String>();

		System.out.println("nhập vào số phần tử của sortedSet ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào dữ liệu của phần tử thứ " + i);
			sortedSet.add(sc.next());
		}

		// khai báo 1 SortedSet có tên là tailset
		// có các phần tử được trích xuất
		// từ phần tử lớn hơn hoặc bằng
		// phần tử fromElement đến phần tử cuối cùng của sortedsetInteger

		System.out.println("nhập vào phần tử bắt đầu ");
		String a = sc.next();
		SortedSet<String> tailSet = sortedSet.tailSet(a);
		System.out.println(" các phần tử có trong tailSet");
		System.out.println(tailSet);
	}

	public static void firstAndLast() {
//		tìm phần tử nhỏ nhất - first
//		tìm phần tử lớn nhất - last

		Scanner sc = new Scanner(System.in);
		SortedSet<String> sortedSet = new TreeSet<String>();

		System.out.println("nhập vào số phần tử của sortedSet ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào dữ liệu của phần tử thứ " + i);
			sortedSet.add(sc.next());
		}

		String pTuNhoNhat = sortedSet.first();
		String pTuLonNhat = sortedSet.last();

		System.out.println(
				"Phần tử lớn nhất và nhỏ nhất trong" + " sortedsetInteger là " 
		         + pTuLonNhat + " và " + pTuNhoNhat);
	}

}
