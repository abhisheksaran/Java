/*
Object-oriented programming has several advantages over procedural programming:
A class is a template for objects, and an object is an instance of a class.
When the individual objects are created, they inherit all the variables and methods from the class.

A Class is like an object constructor, or a "blueprint" for creating objects.
To create a class, we use the keyword class.
To create an object of MyClass, we specify the class name, followed by the object name, and use the keyword new.

Final keyword is useful when you want a variable to store the same value always.
Static v/s Non-static : A static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects.

How to use methods of a class in another class called multiple class use? Refer the files - Car.java and DriverClass.java


*/

class MyClass {
	int x=5;
	//static method	
	static void myStaticMethod(){
		System.out.println("Static Methods can be called without creating objects");
	}

	//non static method 
	public void myPublicMethod(){
		System.out.println("Public Methods must be called by creating objects");
	}

	//main method
	public static void main(String[] args){
		//c++ method declaration
		//myClass myObj;
		//java method declaration
		MyClass myObj=new MyClass();	

		//accessing and printing the class attribute
		System.out.println(myObj.x);
	
		//static v/s non-static methods
		myStaticMethod();
		myObj.myPublicMethod();
	}

}
