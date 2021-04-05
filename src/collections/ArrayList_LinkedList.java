package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList_LinkedList {
	public static void main(String[] args) {
		arrayList();
//      linkedList();
//   	interator();
//		listInterator();
//		coppy();
//		shuffle();
//		ex1();
	}

	public static void arrayList() { // hoán vị là đảo vị trí các phần tử lẫn lộn k có quy tắc
		// khai báo ListInterface
		List<String> arrayList = new ArrayList<String>();
		// thêm phần tử
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		
		// hiển thị các phần tử có trong listString
		// bằng cách sử dụng vòng lặp for duyệt theo đối tượng
		// trong đó kiểu dữ liệu của biến element
		// phải trùng với kiểu dữ liệu của listString
		System.out.println("các phần tử có trong arrayList là ");
		for (String xuat : arrayList) {
			System.out.println(xuat);
		}
	}

	public static void linkedList() {
		List<Integer> linkedList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào 4 đối tượng trong linkedList ");
		linkedList.add(sc.nextInt());
		linkedList.add(sc.nextInt());
		linkedList.add(sc.nextInt());
		linkedList.add(sc.nextInt());
		System.out.println(" các phần tử trong linkedList  ");
		// thêm phần tử có giá trị bằng 3 vào vị trí thứ 3
		linkedList.add(3, 3);
		for (Integer xuat : linkedList) {
			System.out.println(xuat);
		}
	}

	public static void interator() {
		// Interator là cách mới sử dụng để
		// duyệt qua các phần tử của một Collection

		// khai báo List Interface có tên là listString
		// kiểu dữ liệu là String
		List<String> listString = new LinkedList<String>();

		// khai báo một Iterator
		Iterator<String> iterator = null;

		// thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");

		System.out.println("Các phần tử có trong listString là: ");
		// Lấy ra đối tượng iterator để truy cập vào các phần tử của tập hợp.
		// Đối tượng iterator này chỉ chứa các String.
		// Lúc này iterator sẽ trỏ vào
		// chỉ số trước chỉ số của phần tử đầu tiên trong listString
		iterator = listString.iterator();

		// Kiểm tra xem Iterator còn phần tử tiếp theo hay không?
		// Nếu có thì sẽ di chuyển vị trí mà iterator
		// đang trỏ vào sang vị trí của phần tử kế tiếp
		// và hiển thị phần tử đó ra
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void listInterator() {
		// ListInterator chỉ sử dụng cho list
		// không dùng được cho set và map

		// khai báo List Interface có tên là listString
		// kiểu dữ liệu là String
		List<String> listString = new LinkedList<String>();
		// khai báo List mới

		// khai báo một ListIterator
		ListIterator<String> listIterator = null;

		// thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		listString.add("Two");

		List<String> newList = new LinkedList<String>();
		newList.add("Hehe");
		newList.add("Haha");
		newList.add("Hihi");
		newList.add("HaHa");
		newList.add("Hoho");

		// xóa phần tử
		listString.remove(0);
		// xóa phần tử trùng ở phía sau của list
		newList.remove("HaHa");
		// tìm kiếm phần tử trong list
		if (listString.contains("Four")) {
			System.out.println("có phần tử  " + listString.get(2));
		} else {
			System.out.println("đéo có ");
		}

		System.out.println("Các phần tử có trong listString là: ");
		// Lấy ra đối tượng listIterator để truy cập vào các phần tử của tập hợp.
		// Đối tượng ListIterator này chỉ chứa các String.
		// Lúc này ListIterator sẽ trỏ vào
		// chỉ số trước chỉ số của phần tử đầu tiên trong listString
		// thêm list newList ra sau listString
		listString.addAll(newList);
		listIterator = listString.listIterator();

		// cập nhật giá trị phần tử thứ 2
		// để sửa phần tử trong list thì dùng câu lệnh list.set(index,element)
		System.out.println("cập nhật phần tử 3 của listString là " + listString.set(2, "zero"));
		// tìm kiếm vị trí xuất hiện đầu tiên của một phần tử
		int first = listString.indexOf("Two");
		System.out.println(first);
		// tim vị trí xuất hiện cuối cùng của phần tử trong list
		int last = listString.lastIndexOf("Two");
		System.out.println(last);
		// sắp xếp phần tử theo thứ tự tăng dần theo kí tự
		Collections.sort(listString);
		// Kiểm tra xem listIterator còn phần tử tiếp theo hay không?
		// Nếu có thì sẽ di chuyển vị trí mà listIterator
		// đang trỏ vào sang vị trí của phần tử kế tiếp
		// và hiển thị phần tử đó ra
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("goi phan tu so 3 của listString " + listString.get(3 - 1));

	}

	public static void coppy() {
		// danh sách nguồn
		List<String> listSource = new ArrayList<String>();

		listSource.add("A");
		listSource.add("B");
		listSource.add("C");
		listSource.add("D");

		// danh sách đích
		// số phần tử của listDest phải lớn hơn hoặc bằng
		// với số phần tử của listSource
		List<String> listDest = new ArrayList<String>();

		listDest.add("V");
		listDest.add("W");
		listDest.add("X");
		listDest.add("Y");
		listDest.add("Z");

		// sao chép các phần tử của listSource
		// vào trong listDest
		// các phần tử của listSource sẽ thay thế các phần tử listDest trong listDest
		Collections.copy(listDest, listSource);

		System.out.println("Các phần tử có trong listDest: ");
		for (String str : listDest) {
			System.out.println(str);
		}
	}

	public static void shuffle() {
		// tạo 1 listNumber có kiểu dữ liệu là Integer
		List<Integer> listNumber = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			listNumber.add(i);
		}

		System.out.println("Các phần tử trong listNumber trước khi hoán vị: ");
		// hiển thị các phần tử trong listNumber ở dạng mảng
		System.out.println(listNumber);

		Collections.shuffle(listNumber);

		System.out.println("Các phần tử trong listNumber sau khi hoán vị: ");
		System.out.println(listNumber);
	}

	public static void ex1() {
		// tạo đối tượng
		List<String> dayInWeek = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int x = 7;
		System.out.println("nhập vào các ngày trong tuần");
		for (int i = 0; i < x; i++) {
			dayInWeek.add(i, sc.nextLine());
		}
		// khai báo 1 Interator
		Iterator<String> iterator = null;
		iterator = dayInWeek.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		// khai báo 1 listInterator
//		// phải hiện thị listIterator mới hiện thị lên previos
//		ListIterator<String> listIterator = null;
//		listIterator = dayInWeek.listIterator();
//		System.out.println("\nHiển thị phần tử sử dụng ListIterator: ");
//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		// hiển thị giá trị của list theo thứ tự từ dưới lên
//		// chỉ listIterator có
//		while (listIterator.hasPrevious()) {
//			System.out.println("hiển thị theo thứ tự từ dưới lên " +listIterator.previous());
//		}

		// thay thế 1 ngày trong tuần bằng cái khác
		System.out.println("nhập vào giá trị thay đổi của phần tử mới");
		String element = sc.nextLine();
		System.out.println("nhập vào giá trị phần tử cần thay đổi ");
		int index = sc.nextInt();

		dayInWeek.set((index - 2), element);
		System.out.println(" xuất ra các ngày sau thay đổi");
		for (String string : dayInWeek) {
			System.out.println(string);
		}
	}
}
