/*
Access Modifiers - controls the access level
	1. Classes : For classes you can use public or default
		a. public : The class is accessible by any other class
		b. default : The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
	2. Attributes, Methods and Constructors : Public, protected, private, default.
		a. public : The code is accessible for all classes
		b. private : The code is only accessible within the declared class
		c. protected : The code is accessible in the same package and subclasses(derived).
		d. default : The code is only accessible in the same package. This is used when you don't specify a modifier.
Non-Access Modifiers - do not control access level, but provides other functionality
	1. Classes : Final and Abstract
		a. final : The class cannot be inherited by other classes
		b. abstract : The class cannot be used to create objects. (To access an abstract class, it must be inherited from another class)
	2. Attributes and Methods : final, static, abstract, transient, synchronized, volatile
		a. final : Attributes and methods cannot be overridden/modified
		b. static : Attributes and methods belongs to the class, rather than an object	
		c. abstract : Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
		d. transient : Attributes and methods are skipped when serializing the object containing them
		e. synchronized : Methods can only be accessed by one thread at a time
		f. volatile : The value of an attribute is not cached thread-locally, and is always read from the "main memory" 

*For an abstract class example look at Person.java
*/

public class MyClass{

	final int x=10;
	
	static public void main(String[] args){
		MyClass myObj=new MyClass();	
		//myObj.x=50 //this will give an error as x is final 
		System.out.println(myObj.x);

		//abstract class Person defined in file Person.java
		System.out.println("Example of an abstract class-");
		Student studentObj = new Student();
		System.out.println("Name: "+studentObj.name);	
		System.out.println("Age: "+studentObj.age);	
		System.out.println("Graduation Year: "+studentObj.graduationYear);	
		//calling abstract method
		studentObj.study();
		
	}
	
}
