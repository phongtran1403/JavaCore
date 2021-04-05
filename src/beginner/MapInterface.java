package beginner;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
//		HashMap();
//		linkedHashMap();
		treeMap();

	}

	public static void HashMap() {
		// khai báo
		// các giá trị sẽ không hiển thị theo thứ tự nhập vào
		Map<Integer, String> hashMap = new java.util.HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("nhập vào số phần tử trong map");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào giá trị key thứ " + (i + 1));
			int key = sc.nextInt();
			System.out.println(" nhập vào giá trị value thứ " + (i + 1));
			String value = sc.next();
			hashMap.put(key, value);
		}
		System.out.println(hashMap);
	}

	public static void linkedHashMap() {
		// tương tự ta sẽ khai báo
		// các giá trị sẽ được hiển thị theo thứ tự nhập vào
		Map<Integer, String> linkedHashMap = new java.util.HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("nhập vào số phần tử trong map");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào giá trị key thứ " + (i + 1));
			int key = sc.nextInt();
			System.out.println(" nhập vào giá trị value thứ " + (i + 1));
			String value = sc.next();
			linkedHashMap.put(key, value);
		}
		System.out.println(linkedHashMap);

	}

	public static void treeMap() {
		// treeMap có giá trị đc sắp xếp theo thứ tự tăng dần
		Map<Integer, String> treeMap = new java.util.HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("nhập vào số phần tử trong map");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào giá trị key thứ " + (i + 1));
			int key = sc.nextInt();
			System.out.println(" nhập vào giá trị value thứ " + (i + 1));
			String value = sc.next();
			treeMap.put(key, value);
		}

		// cách lấy ra toàn bộ key-value trong map
		// sử dụng entry

		// tạo 1 Set có tên là entries
		// chứa toàn bộ các entry (vừa key vừa value)
		// của treemap
		Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
		System.out.println(" các entry có trong entries ");
		System.out.println(entries);

		// duyệt map bằng forEach trong java 8 thay vì sử dụng entry
		// đối số thứ nhất bên trong forEach là key
		// đối số thứ hai bên trong forEach là value
		treeMap.forEach((keyInt, valueString) -> System.out.println("Key = " + keyInt + ", value = " + valueString));

		// cách lấy toàn bộ key của map
		// phương thức keySet
		// sẽ trả về 1 set key có trong map
		System.out.println("các key trong map là ");
		for (Integer key : treeMap.keySet()) {
			System.out.println(key);
		}
		for (Entry<Integer, String> entry : entries) {

			System.out.println("a" + entry);
		}
	}

}
