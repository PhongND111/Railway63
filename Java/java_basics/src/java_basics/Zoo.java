package java_basics;

public class Zoo {
	int hp;
	Engine myEngine;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal1 = new Animal("Koala", 2, "male", 25);
//		Animal animal2 = new Animal("human", 25, "male", 50);

//		animal1.helloWorld();
//		System.out.println("\n");
//		animal2.helloWorld();
		Animal animal2 = new Animal("human", 25, "male", 50);

		animal2.helloWorld();

		Engine bigEngine = new Engine();
System.out.println(bigEngine);
		Zoo myZoo = new Zoo();

		myZoo.hp = 100;
		myZoo.myEngine = bigEngine;
		System.out.println(myZoo.myEngine + " hehe");

	}

}
