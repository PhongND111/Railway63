package frontend;

import entity.Student;

public class Demo_20230214 {

	public static void main(String[] args) {

		Student.classNameString = "Class 3";
		Student student1 = new Student();
		student1.setId(1);
//		student1.setClassNameString("Class 1");
		student1.setNameString("Name 1");

		Student student2 = new Student();
		student2.setId(2);
//		student2.setClassNameString("Class 2");
		student2.setNameString("Name 2");

		Student student3 = new Student();
		student3.setId(3);
//		student3.setClassNameString("Class 3");
		student3.setNameString("Name 3");

		Student student4 = new Student();
		student4.setId(4);
//		student4.setClassNameString("Class 4");
		student4.setNameString("Name 4");

		System.out.println("Thông tin học viên");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

		student1.classNameString = "Class 1";
		System.out.println("Thông tin học viên update");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

	}

}
