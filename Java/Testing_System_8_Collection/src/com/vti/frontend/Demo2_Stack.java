package com.vti.frontend;

import java.util.Stack;

import com.vti.entity.Student;

public class Demo2_Stack {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Anna");
		Student student2 = new Student(2, "Karl");
		Student student3 = new Student(3, "Yves");
		Student student4 = new Student(4, "Valentino");

		Stack<Student> studentStack = new Stack<>();
		studentStack.push(student4);
		studentStack.push(student3);
		studentStack.push(student2);
		studentStack.push(student1);
		studentStack.push(student1);

		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());

	}
}
