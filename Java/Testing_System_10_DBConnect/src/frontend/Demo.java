package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.Exercise1Backend;

public class Demo {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Exercise1Backend exercise1Backend = new Exercise1Backend();
//		exercise1Backend.question1();
		exercise1Backend.question2();
//		exercise1Backend.question3();
		exercise1Backend.question4();

	}
}
