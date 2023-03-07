package com.vti.frontend;

import java.util.HashSet;
import java.util.Set;

import com.vti.entity.Student;

public class Demo4_Hashset {
	// Hashset
	// không trùng lặp, không có thứ tự
	public static void main(String[] args) {
		Student student1 = new Student(1, "Anna");
		Student student2 = new Student(2, "Karl");
		Student student3 = new Student(3, "Yves");
		Student student4 = new Student(4, "Valentino");

		Set<Student> studentHashSet = new HashSet<>();
		studentHashSet.add(student4);
		studentHashSet.add(student1);
		studentHashSet.add(student1);
		studentHashSet.add(student4);
		studentHashSet.add(student3);
		studentHashSet.add(student1);
		studentHashSet.add(student4);
		studentHashSet.add(student1);

		for (Student student : studentHashSet) {
			System.out.println(student.toString());

		}
	}
}
