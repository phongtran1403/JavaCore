package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapClass {

	public static void main(String[] args) {
//		sortedMap();
//		subMap();
		headMap();
	}

	public static void sortedMap() {
		SortedMap<String, String> sortedMap = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		// nhập vào các phần tử của map
		System.out.println("nhập vào số phần tử cảu Map");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println("phần tử thứ " + (i + 1));
			System.out.println("nhập vào key của phần tử " + (i + 1));
			String key = sc.next();
			System.out.println("nhập vào value của phần tử " + (i + 1));
			String value = sc.next();
			sortedMap.put(key, value);
		}
		// in ra các key - value có trong Map
		// xử dụng vòng forEach mới
		System.out.println("Các phần tử có trong SortedMap là ");
		sortedMap.forEach((keyS, valueS) -> System.out.println(keyS + "=" + valueS));
	}

	public static void subMap() {
		// subMap là tập con của sortedMap
		// trả về giá trị [form,to)
		SortedMap<Integer, String> sortedMap = new TreeMap<>();

		// thêm các entry vào trong sortedMap
		sortedMap.put(4, "Wednesday");
		sortedMap.put(2, "Monday");
		sortedMap.put(3, "Tuesday");
		sortedMap.put(8, "Sunday");
		sortedMap.put(6, "Friday");
		sortedMap.put(5, "Thursday");
		sortedMap.put(7, "Saturday");

		// khai báo 1 SortedMap có tên là submap
		// có key nằm trong đoạn [3, 7) của sortedMap
		Map<Integer, String> subMap = sortedMap.subMap(3, 8);
		System.out.println("Các entry có trong submap là: ");
		subMap.forEach((keyChar, valueInt) -> System.out.println("Key = " + keyChar + ", value = " + valueInt));

		// nếu key đầu và key cuối trùng nhau
		// thì kết quả của phương thức subMap()
		// sẽ trả về submap không có entry nào
		subMap = sortedMap.subMap(3, 3);
		System.out.println("Các entry có trong submap là: ");
		System.out.println(subMap);
	}

	public static void headMap() {
		// headMap là tập con của sortedMap
		// giá trị trả về [ đầu , key)
		SortedMap<Integer, String> sortedMap = new TreeMap<>();

		// thêm các entry vào trong sortedMap
		sortedMap.put(4, "Wednesday");
		sortedMap.put(2, "Monday");
		sortedMap.put(3, "Tuesday");
		sortedMap.put(8, "Sunday");
		sortedMap.put(6, "Friday");
		sortedMap.put(5, "Thursday");
		sortedMap.put(7, "Saturday");
		// khai báo 1 headMap
		Map<Integer, String> headMap = sortedMap.headMap(4);
		System.out.println("các entry có trong map là ");
		headMap.forEach((key, value) -> System.out.println("key = " + key + "value =" + value));

	}

	public static void tailMap() {
		// ngược lại đối với headMap
	}

}
