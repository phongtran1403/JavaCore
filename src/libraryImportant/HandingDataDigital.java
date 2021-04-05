package libraryImportant;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import beginner.Scan;

public class HandingDataDigital { // xử lí dữ liệu số

	public static void main(String[] args) {
		// NumberFormatClass();
		// test();
		// CurrentcyFormatClass();
		// ChangeCurrrency();
		RoundingNumber();
	}

	public static void NumberFormatClass() {
		// import thư viện java.text.NumberFormat;
		// tạo 1 đối tượng numberFormat
		NumberFormat nf = NumberFormat.getInstance();
		double d = 100000.08d;
		// định dạng từ kiểu double về string
		String str = nf.format(d);
		System.out.println("Số " + d + " sau khi định dạng là " + str);

		// tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
		// bằng cách tạo 1 đối tượng Locale (chi tiết về đối tượng chúng ta sẽ học sau)
		// Locale là đối tượng đại diện duy nhất cho các ngôn ngữ và quốc gia, khu vực
		// khác nhau trên toàn thế giới
		// trong đó "en" là ngôn ngữ và "EN" là tên quốc gia.

		// Để sử dụng Locale chúng ta sẽ import gói thư viện java.util.Locale của Java
		// tạo đối tượng locale

		Locale locale = new Locale("en", "EN");

		// NumberFormat.getInstance(locale)
		// dùng để định dạng số chung cho quốc gia, khu vực được chỉ định
		// (ở đây là nướcAnh)

		NumberFormat en = NumberFormat.getInstance(locale);
		String string = en.format(d);
		System.out.println("Số " + d + " sau khi định dạng theo tiêu chuẩn nước anh là " + string);

		Locale localeV = new Locale("vi", "VN");
		NumberFormat vi = NumberFormat.getInstance(localeV);
		String stringv = vi.format(d);
		System.out.println("Số " + d + " sau khi định dạng theo tiêu chuẩn nước Việt là " + stringv);

	}

	public static void test() {
		// Locale.getDefault() sẽ trả về biến currentLocale
		// là khu vực mặc định của hệ thống máy ảo JVM
		Locale currentLocale = Locale.getDefault();

		// getDisplayLanguage() trả về tên ngôn ngữ của currentLocale
		// getDislayCountry() trả về tên quốc gia của currentLocale
		System.out.println(currentLocale.getDisplayLanguage());
		System.out.println(currentLocale.getDisplayCountry());

		// getLanguage() trả về mã ngôn ngữ của currentLocale
		// getCountry() trả về mã quốc gia của currentLocale
		System.out.println(currentLocale.getLanguage());
		System.out.println(currentLocale.getCountry());

		// getProperty() trả về chuỗi bao gồm các thông tin của hệ thống
		// user.country là quốc gia
		// user.language là ngôn ngữ
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.language"));
	}

	public static void CurrentcyFormatClass() {
		double d = 100.49d;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String str = nf.format(d);
		// định dạng mặc định là đô la
		System.out.println("số tiền được định dạng mặc định là " + str);

		Locale locale = new Locale("vi", "VN");
		NumberFormat tienViet = NumberFormat.getCurrencyInstance(locale);
		String strv = tienViet.format(d);
		System.out.println("số tiền được định dạng dưới tiền việt " + strv);

	}

	public static void ChangeCurrrency() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào giá trị tiền đức ");
		Float number = sc.nextFloat();
		System.out.println("nhập vào tỉ giá tiền Đức/VN");
		Float tiGia = sc.nextFloat();
		Float number2 = number * tiGia;
		// tạo đơn vị tiền tệ theo tiêu chuẩn của đức
		Locale locale = new Locale("de", "DE");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		String string = format.format(number);
		System.out.println("số tiền dưới đơn vị tiền Đức là " + string);

		// thay đổi tiền tệ
		// từ tiêu chuẩn đức
		// sang VN
		// Currency.getInstance() sẽ trả về 1 đơn vị tiền tệ nào đó (Việt Nam)
		// sử dụng setCurrency để thay đổi định dạng
		Locale locale2 = new Locale("vi", "VN");
		format.setCurrency(Currency.getInstance(locale2));
		String string2 = format.format(number2);
		System.out.println(string + " đổi ra bằng " + string2);
	}

	public static void PercentFormats() {
		double percentageDoubleNumber = 0.758d;
		// định dạng số percentageDoubleNumber ở dạng phần trăm
		// theo khu vực mặc định của máy ảo JVM
		// khu vực mặc định này là nước Mỹ
		// lưu ý là phần trăm của số sẽ được làm tròn
		NumberFormat numEN = NumberFormat.getPercentInstance();
		String percentageEN = numEN.format(percentageDoubleNumber);
		System.out.println("Số " + percentageDoubleNumber + " ở dạng phần trăm = " + percentageEN);
	}

	public static void RoundingNumber() {
		NumberFormat numf = NumberFormat.getNumberInstance();
		numf.setMaximumFractionDigits(2); // làm tròn đến 2 chữ số phần thập phân

		// RoundingMode.UP: làm tròn lên
		numf.setRoundingMode(RoundingMode.UP);
		System.out.println("Chế độ làm tròn: " + numf.getRoundingMode());
		System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
		System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
		System.out.println("823.456 sau khi làm tròn = " + numf.format(823.456));

		// RoundingMode.DOWN: làm tròn xuống
		numf.setRoundingMode(RoundingMode.DOWN);
		System.out.println("\nChế độ làm tròn: " + numf.getRoundingMode());
		System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
		System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
		System.out.println("823.456 sau khi làm tròn = " + numf.format(823.455));

	}

	public static void DecimalFormatClass() {

		double doubleNumber = 1.223d;

		// khai báo 1 DecimalFormat có tên là dcf
		// để định dạng số doubleNumber theo mẫu "#.##"
		// tức là phần thập phân của số doubleNumber sau khi định dạng sẽ có 2 chữ số
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("Số " + doubleNumber + " sau khi định dạng = " + dcf.format(doubleNumber));
	}

}