package exception;

public class Throws_Throw {
	// throws dùng cho class , method
	// throw dùng cho cái nhỏ hơn - hàm

	public static void main(String[] args) {
		try {
			testMyFuction(2, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void testMyFuction(int x, int y) throws Exception {
		if (y == 0)
			throw new ArithmeticException("lỗi chia cho 0");
		System.out.println(x / y);
	}
}
