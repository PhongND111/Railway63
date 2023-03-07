package frontend;

import entity.Xe;

public class Demo {
	public static void main(String[] args) {
		Xe xemay = new Xe(80);
		xemay.setId(1);
		xemay.setName("Liberty");
//		xemay.setMaxSpeed(80);

		Xe xemay1 = new Xe(100);
		xemay.setId(1);
		xemay.setName("Liberty");

		System.out.println(xemay.toString());
	}
}
