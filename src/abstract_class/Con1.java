package abstract_class;

public class Con1 extends Cha {

	public void name() { // hàm name bên class cha là hàm bthg
		super.name(); // kế thừa từ class cha
	}

	@Override
	public void age() {
		// hàm age bên class cha là abstract
		// tự động override
		// ghi đè thuộc tính của class con
		int age = 5;
		System.out.println("Tuổi :\t" + age);
	}

	@Override
	public void gender(String x) {
		// tương tự
		System.out.println("Giới tính :\t"+x);

	}

}
