package com.vti.frontend;

import com.vti.entity.Person;
import com.vti.entity.Student;

public class Demo_20230211 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setId(1);
		person1.setNameString("Karl");

		Student student1 = new Student(1, "B", "M", "A");
		student1.showInfo();
	}

}
