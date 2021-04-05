package oop01;


public class Student extends Person {

	// tạo thuộc tính sv
	
	public double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	//ghi đè 
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Score :\t"+ this.getScore());
	}
}
