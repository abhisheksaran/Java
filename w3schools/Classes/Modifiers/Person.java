/*
An abstract class example
*/

//abstract class
abstract class Person{
	public String name="Abhi";
	public int age=21;
	//abstract method
	public abstract void study();
}


class Student extends Person {

	public int graduationYear=2021;
	//the body of abstract method is provided here, in a inherited class
	public void study (){
		System.out.println("Studying all day along");
	}
}
