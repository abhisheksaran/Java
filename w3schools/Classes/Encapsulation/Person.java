/*
Encapsulation, is to make sure that "sensitive" data is hidden from users.
	1. declare class variables/attributes as private
	2. provide public get and set methods to access and update the value of a private variable

*/

public class Person{
	private String name ;
	//getter
	public String getName(){
		return name;
	}
	//setter
	public void setName(String newName){
		this.name=newName;
	}
	
}
