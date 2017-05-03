package test1;

public class dog {
	String name;
	int age;
	String color;
	public dog(String newName, int newAge, String newColor) 	{
		name = newName;
		age = newAge;
		color = newColor;
		System.out.println("dog's name is :" + newName);
		System.out.println("dog's age is :" + newAge);
		System.out.println("dog's color is :" + newColor);
	}
	public static void classBark() {
		System.out.println("dog bark");
	}
	
	public void bark() {
		System.out.println(name + "bark");
	}
}
