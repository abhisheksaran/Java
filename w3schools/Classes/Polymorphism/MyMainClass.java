/*
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
*/

//superclass
class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound");
	}
}

//subclass1
class Dog extends Animal{
	public void animalSound(){
		System.out.println("The dog says : woo woo!");
	}
}	

//subclass2
class Cow extends Animal{
	public void animalSound(){
		System.out.println("The cow says : bhee bhee!");
	}
}

class MyMainClass{
	public static void main(String[] args){	
		//creat a animal object
		Animal myAnimal= new Animal();
		//create a dog object
		Dog myDog= new Dog();
		//create a cow onject
		Cow myCow= new Cow();

		//polymorphism of animalSound method
		myAnimal.animalSound();
		myDog.animalSound();
		myCow.animalSound();
	}
}
