/*
Encapsulation, is to make sure that "sensitive" data is hidden from users.
	1. declare class variables/attributes as private
	2. provide public get and set methods to access and update the value of a private variable
Why Encapsulation ? 	
    Better control of class attributes and methods
    Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    Flexible: the programmer can change one part of the code without affecting other parts
    Increased security of data

For example look at file Person.java.
*/

public class MyClass{
	
	static public void main(String[] args){
		Person myObj=new Person();
		//myObj.name="abhishek" //will give an error beacuse name attribute is private
		myObj.setName("abhishek");
		System.out.println("Name: "+myObj.getName());
	}
	
}
