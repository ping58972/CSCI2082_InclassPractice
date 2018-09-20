package InClass08302018;

public class Person {
	private String name;
	private int year;
	private double height;
	
	public Person(String name, double h, int age) {
		this.name = name;
		this.year = age;
		this.height = h;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
