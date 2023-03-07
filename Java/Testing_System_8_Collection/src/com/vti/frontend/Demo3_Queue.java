package com.vti.frontend;

import java.util.LinkedList;
import java.util.Queue;

import com.vti.entity.Student;

public class Demo3_Queue {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Anna");
		Student student2 = new Student(2, "Karl");
		Student student3 = new Student(3, "Yves");
		Student student4 = new Student(4, "Valentino");

		Queue<Student> studentQueue = new LinkedList<>();
		studentQueue.add(student4);
		studentQueue.add(student3);
		studentQueue.add(student2);
		studentQueue.add(student1);
		studentQueue.add(student1);

		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());

	}

}
