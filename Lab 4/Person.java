package Lab4;

public class Person{
	String name;
	float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	

	public static void main(String[] args) {
	
	Person person1 = new Person();
	Person person2 = new Person();
	
	person1.setName("Smith");
	person1.setAge(24);
	
	System.out.println("Person Details:");
	System.out.println("Name:"+ person1.name);
	System.out.println("Age:"+ person1.age);
	
	
	person1.setName("Kathy");
	person1.setAge(28);
	
	System.out.println("Person Details:");
	System.out.println("Name:"+ person1.name);
	System.out.println("Age:"+ person1.age);
	
	
}
}
