package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

import com.vti.entity.Student;

public class Demo1_ArrayList {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Anna");
		Student student2 = new Student(2, "Karl");
		Student student3 = new Student(3, "Yves");
		Student student4 = new Student(4, "Valentino");

		ArrayList<Student> listStudents = new ArrayList<>();
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);

//		for (Student student : listStudents) {
//			System.out.println(student.toString());
//		}
		Iterator<Student> iterator = listStudents.iterator();
		for (Student student : listStudents) {
			System.out.println(iterator.next());
		}

		Student student5 = new Student(5, "Armani");
		listStudents.add(0, student5);
		Iterator<Student> iterator2 = listStudents.iterator();
		for (Student student : listStudents) {
			System.out.println(iterator2.next());
		}

	}

}
