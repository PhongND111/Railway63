package frontend;

import java.util.ArrayList;

import entity.Student;

public class Ex1_Q1_demo {

	public static void main(String[] args) {

		// Exercise 1 - Question 1
//		Question 1: static variable
//		Khai báo 1 class student có các thuộc tính id, name, college
//		Với college là static variable.
//		Hãy khởi tạo các student sau:
//		Student có id = 1, name ="Nguyễn Văn A"
//		Student có id = 2, name = " Nguyễn Văn B "
//		Student có id = 3, name = " Nguyễn Văn C "
//		Và tất cả các student này đều học ở "Đại học bách khoa".
//		Dùng vòng for để in ra thông tin các student
//		Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//		Dùng vòng for để in ra thông tin các student

//		khởi tạo các student
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Nguyễn Văn A");

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Nguyễn Văn B");

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Nguyễn Văn B");

// Tất cả các student này đều học ở "Đại học bách khoa"
		Student.setCollege("HUST");

// Dùng vòng for để in ra thông tin các student
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		System.out.println("Thông tin sinh viên trước khi đổi trường");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("\n");

//		Sau đó chuyển các student này sang "Đại học công nghệ"
		Student.setCollege("UET");

		System.out.println("Thông tin sinh viên sau khi đổi trường");
//		Dùng vòng for để in ra thông tin các student
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
