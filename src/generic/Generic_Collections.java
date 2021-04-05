package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generic_Collections {
	public static void main(String[] args) {
		map();
	}

	public static void list() {
		List<Object> arrList = new ArrayList<Object>();
		arrList.add(1);
		arrList.add(2);
		arrList.add("muốn thêm cg cũng đc vì object là to nhất ");

		// gọi hàm iterator
		Iterator<Object> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// generic

		List<Course<String, Integer>> listCourse = new ArrayList<Course<String, Integer>>();
		listCourse.add(new Course<String, Integer>("Java", "25h", 130));

		Iterator<Course<String, Integer>> irt2 = listCourse.iterator();
		while (irt2.hasNext()) {
			System.out.println(irt2.next());
		}
	}

	public static void set() {
		Set<Course<String, Integer>> setCourse = new HashSet<Course<String, Integer>>();
		setCourse.add(new Course<String, Integer>("a", "b", 22));

		Iterator<Course<String, Integer>> irt3 = setCourse.iterator();
		while (irt3.hasNext()) {
			System.out.println(irt3.next());
		}
	}

	public static void map() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Phong");
		map.put(2, "Trần");


		Iterator<Integer> irt4 = map.keySet().iterator();

		while (irt4.hasNext()) {
			Integer key = irt4.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
