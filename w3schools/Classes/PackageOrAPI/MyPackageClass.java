/*
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:	
	2. User-Defined Package:
		a. To create a package, use the package keyword.
		b. javac MyPackageClass.java : Save the file and compile it
		c. javac -d . MyPackageClass.java : This forces compiler to create a package, -d option is for the destination directory where we want to save this package.
		d. java mypack.MyPackageClass : To run the MyPackageClass.java file 
*/
//package name
package mypack;

class MyPackageClass {
	public static void main(String[] args){
		System.out.println("This is my package!");
	}
}
	
