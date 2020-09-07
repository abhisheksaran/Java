/*
This is the hellowrold example consisting of basics Java notes.
Every java application must have at least one class definition that consists of class keyword followed by class name.
final keyboard variable declare a variable as "final" or "constant", which means unchangeable or read-only. 
Data Types - 
	1. primitive : byte, short, int, long, double, float, boolean, char
	2. Non-primitive : String, Arrays and Classes
Type Casting - 
	1. Widening Casting :  byte -> short -> char -> int -> long -> float -> double
	2. Narrow Casting :  double -> float -> long -> int -> char -> short -> byte 
Bitwise Operators - 
	1. <<	Zero-fill left shift : Shift left by pushing zeroes in from the right and letting the leftmost bits fall off
	2. >>	Signed right shift : Shift right by pushing copies of the leftmost bit in from the left and letting the rightmost bits fall off
	3. >>>	Zero-fill right shift : Shift right by pushing zeroes in from the left and letting the rightmost bits fall off	
Strings -
	1. Declaration : String str="Abhishek"
	2. Length : str.length	()
	3. Uppercase/Lowercase : str.toUpperCase()/str.toLowerCase()
	4. Findind a char in string :  str.indexOf("he")
	5. Concatenation : using + operator or using concat method (eg.- str.concat("saran") )
	6. Special Chracters : \', \", \\ to insert ', " and \ respectively 
	7. If you add a number using + operator result will be an string.
Math -
	1. Maximum : Math.max(x,y)
	2. Minimum : Math.min(x,y)
	3. Square Root : Math.sqrt(x)
	4. Abosulte value : Math.abs(x)
	5. Random Number [0.0,1.0] : Math.random()
If/Else, Switch, For Loop, While Loop -
	. Same as C++
Break - To jump out of the loop.
Continue - To break one iteration in loop.
Arrays -
	1. Declaration : Strings[] cities = {"delhi", "bombay"}
	2. Length : cities.length
	3. Loop Each : for(String i : cities) 
	4. Multidimensional : int[] id={{1,0},{0,1}}
*/


class BasicsJava 
{ 
    //Public access specifier makes the main method public that means that we can call the method from outside the class.
    //static: We do not need to create object for static methods to run. They can run itself.
    //main is our method name. 
    public static void main(String args[]) 
    { 
	int age=18;
	String myName="Abhishek ";
        System.out.println("Hello! "+myName+age+", You have successfully jotted down the java basics notes."); 
    } 
} 
