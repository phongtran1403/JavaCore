package oop01;

public class Main {
	public static void main(String[] args) {
		// tạo đối tượng
		Person personObj = new Person();
		//personObj.showInfo();
		
		Student studentObj = new Student();
		studentObj.setName("Phong");
		studentObj.setScore(3);
		studentObj.showInfo();

	}

}
