package com.vti.frontend;

import com.vti.entity.Calculator;

public class Demo_20230211_02 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Tổng 2 số là: " + calculator.add(1, 5));
		System.out.println(calculator.add(1.3f, 1.4f));

	}

}
