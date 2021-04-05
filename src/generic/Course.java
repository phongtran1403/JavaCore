package generic;

public class Course<T1, T2> {
	private String name;
	private T1 time;
	private T2 chapter;

	// contructor
	public Course(String name, T1 time, T2 chapter) {
		this.name = name;
		this.time = time;
		this.chapter = chapter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T1 getTime() {
		return time;
	}

	public void setTime(T1 time) {
		this.time = time;
	}

	public T2 getChapter() {
		return chapter;
	}

	public void setChapter(T2 chapter) {
		this.chapter = chapter;
	}
}
