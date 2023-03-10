package entity;

public class Student {
	private int id;
	private String name;
	private static String college;
	private static int moneyGroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "College: " + this.getCollege();
	}
}
