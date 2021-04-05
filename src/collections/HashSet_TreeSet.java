package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSet_TreeSet {

	public static void main(String[] args) {
//		khaiBao();
//		test();
//		them();
	}

	public static void khaiBao() {
		// khai báo 1 set
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<String> treeSet = new HashSet<String>();
		// tạo giá trị cho Set
		// hashSet
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		// treeSet
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("D");
		// tạo iterator
		Iterator<Integer> hashIterator = null;
		Iterator<String> treeIterator = null;
		// gán giá trị của set cho Iterator
		hashIterator = hashSet.iterator();
		treeIterator = treeSet.iterator();
		// xuất ra dữ liệu của 2 set
		while (hashIterator.hasNext()) {
			System.out.println(hashIterator.next());

		}
		while (treeIterator.hasNext()) {
			System.out.println(treeIterator.next());
		}

	}

	// tạo mới 1 set thông qua 1 Collection đã tồn tại
	// với điều kiện 2 collection phải cùng kiểu dữ liệu
	public static void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//		// lấy dữ liệu của list sang hashSet
		Set<Integer> set = new HashSet<Integer>(list);
//		for (Integer integer : set) {
//			System.out.println(integer);
//		}
		// lọc các phần tử là số chẵn trong listInteger
		// và thêm vào trong setInteger
		set = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
		// hiển thị các phần tử trong set
		for (Integer soChan : set) {
			System.out.println(soChan);
		}

	}

	public static void them() {
		// thêm phần tử vào trong set
		System.out.println(" nhập vào số phần tử trong set của bạn ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		// tạo 1 set
		Set<Integer> set = new HashSet<Integer>(x);
		for (int i = 0; i < x; i++) {
			System.out.println("nhập vào giá trị của phần tử thứ " + (i + 1) + " là: ");
			set.add(sc.nextInt());
		}
//		for (Integer integer : set) {
//			System.out.println("giá trị của set vừa nhập là  " + integer);
//		}
		System.out.println("Nhập phần tử cần thêm: ");
		int number = sc.nextInt();

		// thêm một phần tử mới vào setInteger từ bàn phím
		// nếu phần tử đó đã tồn tại thì thông báo đã tồn tại
		// ngược lại thì thêm vào
		if (!set.contains(number)) {
			set.add(number);
			System.out.println("Thêm thành công!");
			System.out.println("Các phần tử trong setInteger sau khi thêm: ");
			System.out.println(set);

		} else {
			System.out.println("Phần tử " + number + " đã tồn tại!");

		}
		// xóa phần tử trong set
		// nếu phần tử cần xóa
		// có tồn tại setString thì sẽ thông báo xóa thành công
		// và hiển thị các phần tử còn lại
		// ngược lại thông báo xóa không thành công
		System.out.println("nhập vào phần tử cần xóa");
		int xoa = sc.nextInt();
		if (set.contains(xoa)) {
			set.remove(xoa);
			System.out.println("Xóa thành công!");
			System.out.println("Các phần tử còn lại trong setString:");
			System.out.println(set);
		} else {
			System.out.println("Xóa không thành công!");
		}
		// hiển thị số phần tử có trong set
		System.out.println("số phần tử của set 1 là " + set.size());
		// xóa hết phần tử trong set
//		set.clear();
//		System.out.println(set + " null");
		// tạo set2
		System.out.println("nhập vào số phần tử set2");
		int y = sc.nextInt();
		Set<Integer> set2 = new HashSet<Integer>(y);
		for (int i = 0; i < y; i++) {
			System.out.println("nhập vào giá trị của phần tử thứ " + (i + 1) + " là: ");
			set2.add(sc.nextInt());
		}
		System.out.println(" set 2 có " + set2);

		if (set.containsAll(set2)) {
			System.out.println("setInteger2 là tập hợp con của setInteger1 ");
		} else {
			System.out.println("setInteger2 không là tập hợp con của setInteger1");
		}

		// tìm tất cả các số thuộc tập con của set 1 và set 2
		set.retainAll(set2);
		System.out.println("các số thuộc cả set 1 và set 2 là ");
		System.out.println(set);

		// xóa bỏ các phần tử có chung trong set 1 và set 2
		set.removeAll(set2);
		System.out.println(set);
	}

}
