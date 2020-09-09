/*
inheritance concept :  possible to inherit attributes and methods from one class to another.
    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from
extends : To inherit from a class, use the extends keyword.
final : if we don't want other classes to inherit from a class.
*/

//super class
class Vehicle{
	// if we declare this attribute private, inherited class won't be able to access it.
	protected String brand="Ford";
	public void honk(){
		System.out.println("Tuut tuut!");
	}
}
//subclass
class Car extends Vehicle {
	private String modelName="Mustung";
	public static void main(String[] args){
		Car myCar=new Car();
		myCar.honk();
		System.out.println(myCar.brand+" "+myCar.modelName);
	}
}
