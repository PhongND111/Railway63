package com.vti.frontend;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo5_Treeset {
	public static void main(String[] args) {
		SortedSet<String> nameStudentTreeSet = new TreeSet<String>();
		nameStudentTreeSet.add("E");
		nameStudentTreeSet.add("A");
		nameStudentTreeSet.add("B");
		nameStudentTreeSet.add("A");
		nameStudentTreeSet.add("H");
		nameStudentTreeSet.add("Z");
		nameStudentTreeSet.add("A");
		nameStudentTreeSet.add("O");
		nameStudentTreeSet.add("A");
		nameStudentTreeSet.add("M");

		for (String string : nameStudentTreeSet) {
			System.out.println(string);
		}
	}
}
