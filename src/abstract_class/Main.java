package abstract_class;

public class Main {

	public static void main(String[] args) {
		// tạo 1 thằng con 
		Cha con01 = new Con1();
		con01.name();
		con01.age();
		con01.gender("bê đê");
		
		Con1 con1= new Con1();
		con1.name();
		con1.age();
		con1.gender("thẳng");
		
		
	}

}
