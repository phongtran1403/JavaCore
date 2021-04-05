package exception;

public class ExceptionBasic { // lỗi ngoại lệ
	public static void main(String[] args) {
		test();
	}

	// Finnaly
	// luôn luôn đc thực hiện dù có hay k có exception
	public static void test() {
		// runtime exception - sảy ra khi đã thực thi
		int num1 = 1;
		int num2 = 0;
		try {
			System.out.println("num1/num2 = " + num1 / num2);
		} catch (Exception e) {
			// Exception cha luôn nằm dưới
			//những exception con 
			System.out.println("error: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("success");
	}

	public static void test1() {
		// checked exception - sảy ra khi chưa thực thi
		// trình biên dịch hoặc editor phát hiện lỗi
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
