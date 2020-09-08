/*
The constructor name must match the class name, and it cannot have a return type (like void). 
The constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.
Constructors can also take parameters, which is used to initialize attributes.
*/

public class MyClass{

	int x;
	//a class constructor for the MyClass class
	MyClass(int val){
		x=val;
	}
	
	static public void main(String[] args){
		MyClass myObj=new MyClass(10);
		System.out.println(myObj.x);
	}
}
