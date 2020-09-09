/*
Nested classes : In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
One advantage of inner classes, is that they can access attributes and methods of the outer class.
:WQTo access the inner class, we have to create an object of the outer class, and then create an object of the inner class
Just like static attributes and methods, a static inner class does not have access to members of the outer class.
*/

class OuterClass{
	int x=10;
	class InnerClass{
		int y=5;
	}
	//Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private
	private class InnerClass2{
		int z=15;
	}
	//An inner class can also be static, which means that you can access it without creating an object of the outer class:	
	static class InnerClass3{
		int w=9;
	}
}

class MyMainClass{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();	
		System.out.println(myInner.y+myOuter.x);

		//you can't access inner class2 from here.
		//accessing inner class 3 without creating outerclass object
		OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();	
		System.out.println(myInner3.w);
	}
}
