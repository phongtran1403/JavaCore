package regular_expression;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRelex {

	public static void main(String[] args) {
		study008();
	}

	// pattern +matcher

	public static void study001() {
		String input = "aBc1_";
		// case1
		// sử dụng biểu thức chính quy
		if (input.matches("[A-Za-z_]+")) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}

		// case 2
		// sử dụng pattern và matcher
		Pattern pattern = Pattern.compile("[A-z0-9_]+");
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}

		// case3
		// rút gọn
		if (Pattern.matches("[A-z0-9_]+", input)) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}

	}

	public static void study002() {
		String input1 = "Java.VN";
		String input2 = "Javac.VN";

		Pattern pattern = Pattern.compile("java.vn", Pattern.CASE_INSENSITIVE);// không phân biệt chữ hoa và thường
		Matcher matcher = pattern.matcher(input1);
		if (matcher.matches()) {
			System.out.println(input1 + " Dữ liệu hợp lệ");
		} else {
			System.out.println(input1 + " Dữ liệu không hợp lệ");
		}

		matcher.reset(input2);
		if (matcher.matches()) {
			System.out.println(input2 + " Dữ liệu hợp lệ");
		} else {
			System.out.println(input2 + " Dữ liệu không hợp lệ");
		}
	}

	public static void study003() {
		String input = "Phong Trần đang ốm";
		Pattern pattern = Pattern.compile("\\s+");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.replaceAll("----"));

	}

	public static void study004() {
		String input = "Java.VN";

		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// không phân biệt chữ hoa và thường
		Matcher matcher = pattern.matcher(input);
		// so sánh chuỗi java với chuỗi input
		if (matcher.matches()) {
			System.out.println(input + " Dữ liệu hợp lệ");
		} else {
			System.out.println(input + " Dữ liệu không hợp lệ");
		}

		// so sánh 1 đoạn với đoạn Đầu của chuỗi input
		if (matcher.lookingAt()) {
			System.out.println(input + " Dữ liệu hợp lệ");
		} else {
			System.out.println(input + " Dữ liệu k hợp lệ");
		}
	}

	public static void study005() {
		String input = "java---haha-hihi";
		Pattern pattern = Pattern.compile("-+");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			matcher.start();
			matcher.end();
			matcher.group();

			System.out.printf("START: %s \n", matcher.start());
			System.out.printf("END: %s \n", matcher.end());
			System.out.printf("GROUP: %s \n", matcher.group());
			System.out.println("------------");
			// giá trị của group = end -start
		}
	}

	public static void study006() {

		String input = "java---haha-hihi";
		Pattern pattern = Pattern.compile("[A-z]{3}-(?<id>\\d+)");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			System.out.println(matcher.group("id"));

		}
	}

	public static void study007() {

		String input = "pa>asdf>asdf";
		Pattern pattern = Pattern.compile("(?<name>.*?)>");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.println(matcher.group("name"));

		}
	}

	public static void study008() {
		String input = "Java=20;PHP=140;JS=90";
		Pattern pattern = Pattern.compile("(?<name>[A-z]+)=(?<time>\\d+);?");
		Matcher matcher = pattern.matcher(input);

		Map<String, String> map = new HashMap<String, String>();

		while (matcher.find()) {

			map.put(matcher.group("name"), matcher.group("time"));
		}
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(key + ":"+ value);
			
		}
	}
}