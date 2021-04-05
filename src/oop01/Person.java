package oop01;

import java.util.Calendar;

public class Person {
	public String name;
	public String code;
	public int birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		Calendar now = Calendar.getInstance(); // gọi ra thời gian hiện tại
		int age = 0;
		age = now.get(Calendar.YEAR) - this.getBirthday();
		return age;

	} 	

	// showInfo
	public void showInfo() {
		System.out.println("Info :\t ");
		System.out.println("Name :\t " + this.getName());
		System.out.println("Code :\t  " + this.getCode());
		System.out.println("Birthday :\t " + this.getBirthday());
		System.out.println("Age :\t " + this.getAge());
	}

}
