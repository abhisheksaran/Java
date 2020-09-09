/*
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).
*/

//interface
interface Animal{
	//interface methods does not have a body
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	//body of interface methods provided here
	public void animalSound(){
		System.out.println("The pig says : wee wee");
	}
	public void sleep(){
		System.out.println("Zzz");
	}
}

//multiple interface example
interface FirstInterface{
	public void myMethod();	
}

interface SecondInterface{
	public void myOtherMethod();	
}

class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod(){
		System.out.println("A method of first interface");
	}
	public void myOtherMethod(){
		System.out.println("A method of second interface");
	}
}

class MyMainClass{
	public static void main(String[] args){
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		//example of multiple inheritance using interfaces
		DemoClass myObj= new DemoClass();	
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}

