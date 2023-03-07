package entity;

public class Student {
	private int id;
	private String nameString;
	public static String classNameString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getClassNameString() {
		return classNameString;
	}

	public void setClassNameString(String classNameString) {
		this.classNameString = classNameString;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", classNameString=" + classNameString + "]";
	}

}
