/*
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:	
	1. Built-in Package
	2. User-Defined Package 
The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.	
To use a class or a package from the library, you need to use the import keyword.
To see the example of user defined package look at file- MyPackageClass.java
*/

//To import whole package 
//import java.util.*
//import just the Scanner class (used for input/output) from the package java.util
import java.util.Scanner;

class MyClass {
	public static void main(String[] args){
		Scanner myObj =new Scanner(System.in);
		System.out.println("Enter username");
		
		String userName = myObj.nextLine();
		System.out.println("Username is: "+userName);
	}
}
	
