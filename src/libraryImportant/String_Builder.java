package libraryImportant;

public class String_Builder {
	
	//đọc đell hiểu gì
	//link 
	// https://freetuts.net/thu-vien-xu-ly-chuoi-trong-java-1117.html
	public static void main(String[] args) {
	}

	public static void create() {

		// Dạng 1: tạo 1 StringBuilder rỗng có khả năng lưu trữ 16 ký tự.
		StringBuilder stringBuilder = new StringBuilder();
		// Dạng 2: tạo 1 StringBuilder rỗng có khả năng lưu trữ số ký tự = 32
		StringBuilder stringBuilder1 = new StringBuilder(32);

		// Dạng 3: tạo 1 StringBuilder từ 1 chuỗi str có sẵn
		// khả năng lưu trữ của stringBuilder2 = 16 + chiều dài của chuỗi
		String str = "Hello World!";
		StringBuilder stringBuilder2 = new StringBuilder(str);
	}

	public static void append() {
		// phương thức append()
		// dùng nối chuỗi
		// thay thế cho dấu +
		// sử dụng khi nối nhiều chuỗi
		StringBuilder str = new StringBuilder("hello");
		for (int i = 0; i < 10; i++) {
			str.append("count "+i);
			str.append("\t");
		}
		System.out.println(str);
	}
	
	

}
