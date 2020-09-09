/*
The Scanner class is used to get user input, and it is found in the java.util package.
To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings.
Other examples- 
nextBoolean() 	Reads a boolean value from the user
nextByte() 	Reads a byte value from the user
nextDouble() 	Reads a double value from the user
nextFloat() 	Reads a float value from the user
nextInt() 	Reads a int value from the user
nextLine() 	Reads a String value from the user
nextLong() 	Reads a long value from the user
nextShort() 	Reads a short value from the user
*/
import java.util.Scanner;
class MyClass{
	public static void main( String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name, age and salary: ");
			
		//string input
		String name = myObj.nextLine();
					
		//numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();	
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
}
