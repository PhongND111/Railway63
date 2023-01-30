package entity;

public class Department {
	public int id;
	public String name;

//	@Override
//	public String toString() {
//		return "ID: " + id + ", Name: " + name;
//	}

	public void inThongTin() {
		System.out.println("Thong tin phong ban");
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
