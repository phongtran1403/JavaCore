package libraryImportant;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HandingTime {
	public static void main(String[] args) {
//		GetCalendar();
//		ChangeTimes();
		SimpleDateFormatClass();
	}

	public static void GetCalendar() {
		// Tạo đối tượng Calendar mô tả thời điểm hiện tại
		// với Locale (khu vực) và TimeZone (múi giờ)
		// của máy tính đang chạy.
		Calendar calendar = Calendar.getInstance();
		// import java.util.Date; để sử dụng Date
		// hiển thị ngày tháng năm giờ phút giây hiện tại của hệ thống
		// sử dụng phương thức getTime()
		// phương thức này sẽ trả về 1 đối tượng Date
		// lưu trữ thông tin ngày tháng năm giờ phút giây hiện tại của hệ thống
		Date date = calendar.getTime();

		// Hiện thị thời gian hiện tại
		System.out.println(date);

		// hiển thị ngày
		System.out.println("Ngày hiện tại là " + calendar.get(Calendar.DAY_OF_MONTH));

		// hiển thị tháng hiện tại
		// sử dụng Calendar.MONTH
		// vì tháng trong Java sẽ chạy từ 0 đến 11
		// tức là nếu hiện giờ là tháng 7 thì chương trình sẽ hiển thị là tháng 6
		// vì vậy để hiển thị đúng thì ta sẽ cộng thêm tháng đó cho 1
		System.out.print("Tháng hiện tại là ");
		System.out.println(calendar.get(Calendar.MONTH) + 1);

		// hiển thị năm
		System.out.println("Năm nay là năm " + calendar.get(calendar.YEAR));

		// hiển thị giờ
		System.out.println("giờ hiện tại là (theo múi giờ 12 giờ )" + calendar.get(calendar.HOUR));
		System.out.println("giờ hiện tại là (theo múi giờ 23 giờ )" + calendar.get(calendar.HOUR_OF_DAY));

		// hiển thị phút hiện tại
		System.out.println("phút hiện tại " + calendar.get(calendar.MINUTE));

		// hiển thị giây hiện tại
		System.out.println("phút giây tại " + calendar.get(calendar.SECOND));

	}

	public static void ChangeTimes() {
		// thay đổi thời gian hệ thống dùng ham set();
		Calendar calendar = Calendar.getInstance();

		// thay đổi ngày
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào ngày bạn muốn thay đổi");
		int day = sc.nextInt();
		calendar.set(calendar.DAY_OF_MONTH, day);
		System.out.println("nhập vào tháng bạn muốn thay đổi");
		int month = sc.nextInt();
		calendar.set(calendar.MONTH, month);
		System.out.println("nhập vào năm bạn muốn thay đổi");
		int year = sc.nextInt();
		calendar.set(calendar.YEAR, year);
		System.out.println("nhập vào giờ bạn muốn thay đổi (kiểu giờ - 24h)");
		int hour = sc.nextInt();
		calendar.set(calendar.HOUR_OF_DAY, hour);
		Date date = calendar.getTime();
		System.out.println("thời gian sau khi thay đổi là : ");
		System.out.println(date);

		// cộng trừ thời gian hệ thống sử dụng hàm add
		System.out.println("nhập vào ngày bạn muốn cộng thêm ");
		int day1 = sc.nextInt();
		calendar.add(calendar.DAY_OF_MONTH, day1);
		System.out.println("nhập vào tháng bạn muốn cộng thêm");
		int month1 = sc.nextInt();
		calendar.add(calendar.MONTH, month1);
		System.out.println("nhập vào năm bạn muốn cộng thêm");
		int year1 = sc.nextInt();
		calendar.add(calendar.YEAR, year1);
		System.out.println("nhập vào giờ bạn muốn cộng thêm (kiểu giờ - 24h)");
		int hour1 = sc.nextInt();
		calendar.add(calendar.HOUR_OF_DAY, hour1);
		Date date1 = calendar.getTime();
		System.out.println("thời gian sau khi cộng thêm là : ");
		System.out.println(date1);

		// thay đổi thời gian nhưng không làm ảnh hưởng tới
		// các giá trị khác
		// sử dụng phương thức roll
		// cú pháp
		// calendar.roll(field, up);
	}

	public static void SimpleDateFormatClass() {
		// SimpleDatefomat là 1 phương thức định dạng thời gian
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();

		// khai báo 1 đối tượng SimpleDateFormat
		// chi tiết về khai báo đối tượng chúng ta sẽ học trong chương "Lập trình hướng
		// đối tượng"
		// đối tượng này sẽ định dạng ngày theo cấu trúc "dd/MM/yyyy"
		// trong đó "dd" là ngày, "MM" là tháng và "yyyy" là năm
		// nếu ngày và tháng nào có 1 chữ số (ví dụ 1, 2, 3,...)
		// thì sẽ được tự động thêm vào số 0 đằng trước

		// import thư viện java.text.SimpleDateFormat
		// tạo đối tượng sdf
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("hiển thị thời gian theo cấu trúc vừa định dạng ");
		System.out.println(sdf.format(date));

		// định dạng ngày giờ hiện tại theo cấu trúc "dd/MM/yyyy HH:mm:ss"
		// trong đó "HH" là giờ, "mm" là phút và "ss" là giây
		// "HH" là định dạng 24 giờ, và "hh" là định dạng 12 giờ
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Ngày giờ hiện tại sau khi định dạng là " + sdf2.format(date));

		// hiển thị ngày giờ theo định dạng 12 giờ
		// với định dạng 12 giờ thì chúng ta sẽ thêm vào "aaa"
		// trong đó "aaa" đại diện cho AM/PM
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println("Ngày giờ hiện tại sau khi định dạng là " + sdf3.format(date));
	}

}
