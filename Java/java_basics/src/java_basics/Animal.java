package java_basics;

public class Animal {
	String name;
	int age;
	String gender;
	int weight;

	public Animal(String name, int age, String gender, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public void helloWorld() {
		System.out.println("I'm " + name + ".");
		System.out.println("I'm " + age + " years old.");
		System.out.println("I'm " + gender + ".");
		System.out.println("I'm " + weight + "pounds.");
	}

}
