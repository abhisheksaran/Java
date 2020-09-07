/*
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
You can give arguemnts too in the method.
As this method is static, we don;t have to create object for it.
Method Overloading : Multiple Methods can have same name as long as their number of parameters or parameters type are different.
Scope : variables are only accessible inside the region they are created. This is called scope.
	Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared.
	Variables declared inside blocks of code are only accessible by the code between the curly braces which follows the line in which the variable was declared.
Recursion : calling same method again until it satisfies a halting condition.
*/

public class MyClass{
	//basic example
	static void myMethod(String user){
		System.out.println("Hi "+user+"! Method execution is successful!");
	}

	//method overloading example
	static int plusMethod(int x,int y){
		System.out.println("Method overloading example:adding two ints");
		return x+y;	
	}
	static double plusMethod(double x,double y){
		System.out.println("Method overloading example:adding two doubles");
		return x+y;
	}

	//recursive method example 
	static int sumUpto (int x){
		if(x==0){
			 return 0;
		}
		else {
			return x+sumUpto(x-1);
		}
	}

	public static void  main(String[] args){
		myMethod("Abhishek");
	
		System.out.println(plusMethod(1,2));
		System.out.println(plusMethod(1.1,2.2));
	
		int x=10;
		System.out.println("Sum upto 10 is equal to "+sumUpto(10));
	}
}
