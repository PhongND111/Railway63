package entity;

public class Xe {
	private int id;
	private String name;
	private final int maxSpeed;

	public Xe(int maxSpeed) {
		super();
		this.maxSpeed = 80;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}

	public final void run() {
		System.out.println("Running");
	}

	@Override
	public String toString() {
		return "Xe [id=" + id + ", name=" + name + ", maxSpeed=" + maxSpeed + "]";
	}

}
