package generic;

public class Generic_Method {
	public static void main(String[] args) {
		Integer[] arrInteger = { 1, 2, 3 };
		String[] arrString = { "java", "Phong Trần" };
//		printArrInteger(arrInteger);
//		printArrString(arrString);
		arrays(arrInteger);
		arrays(arrString);
		
	}
	//gộp lại khai báo 1 hàm 
	public static <A> void arrays(A[] arr) {
		for(A a: arr) {
			System.out.println(a);
		}
	}

	// thay vì khai báo từng hàm
	public static void printArrInteger(Integer[] arrIntegers) {
		for (Integer arr : arrIntegers) // for each //in ra 1 mảng từ đầu tới cuối
		{
			System.out.println(arr);
		}
	}

	public static void printArrString(String[] arrStrings) {
		for (String arr : arrStrings) // for each //in ra 1 mảng từ đầu tới cuối
		{
			System.out.println(arr);
		}
	}
}
