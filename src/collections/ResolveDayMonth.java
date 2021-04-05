package collections;

import java.util.Calendar;
import java.util.Date;

public class ResolveDayMonth {

	public static void main(String[] args) {
		calendar();
	}

	public static void calendar() {
		// tạo calendar mô tả thời điểm hiện tại
		// đối với locale (khu vực) hay timeZone (múi giờ)
		// của đối với khu vực máy tính đang chạy

		Calendar calendar = Calendar.getInstance();

		// import java.util.Date; để sử dụng Date
		// hiển thị ngày tháng năm giờ phút giây hiện tại của hệ thống
		// sử dụng phương thức getTime()
		// phương thức này sẽ trả về 1 đối tượng Date
		// lưu trữ thông tin ngày tháng năm giờ phút giây hiện tại của hệ thống

//		Date date = calendar.getTime();
		System.out.println("thời điểm hiện tại là " + calendar.getTime());
	}

}
