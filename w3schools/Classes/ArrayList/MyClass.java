/*
The ArrayList class is a resizable array, which can be found in the java.util package.
ArrayList<String> cars;
cars.add("bmw") : adding value at the end of array
cars.get(index) : getting value at index i
cars.set(index,"audi") : replace value at index i
cars.remove(index) : remove element at position index
cars.clear() : to remove all elements
cars.size() : size of array

LinkedList<String> cars;
LinkedList methods -
addFirst() 	Adds an item to the beginning of the list. 	
addLast() 	Add an item to the end of the list 	
removeFirst() 	Remove an item from the beginning of the list. 	
removeLast() 	Remove an item from the end of the list 	
getFirst() 	Get the item at the beginning of the list 	
getLast() 	Get the item at the end of the list

HashMap<String,String> capitalCities= new HashMap<String, String>();
capitalCities.put("England", "London");
capitalCities.get("England");
capitalCities.remove("England");
capitalCities.clear();
capitalCities.size();
Loop through the items of a HashMap with a for-each loop.
Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values.

A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
HashSet<String> cars = new HashSet<String>();
cars.add("Volvo");
cars.contains("Volvo")
cars.remove("Volvo")
cars.clear()
cars.size()
Loop through the items of an HashSet with a for-each loop same as in case of HashMap.

An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package.
The iterator() method can be used to get an Iterator for any collection:
Iterator<String> it=cars.iterator();
To loop through a collection, use the hasNext() and next() methods of the Iterator-
while(it.hasNext()) {
  System.out.println(it.next());
}
it.remove() : Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.
Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.

Java wrapper Classes - 
Primitive Data Type 	Wrapper Class
byte 	Byte
short 	Short
int 	Integer
long 	Long
float 	Float
double 	Double
boolean 	Boolean
char 	Character
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid. Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)
Integer myInt = 5 : To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object.
System.out.println(myInt) : print it
System.out.println(myInt.intValue()) : you can use the intValue method also as we are working with objects.
Another useful method is the toString() method, which is used to convert wrapper objects to strings.
String myString = myInt.toString()
System.out.println(myString.length())

Java try and catch
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The try and catch keywords come in pairs.
The finally statement lets you execute code, after try...catch, regardless of the result.
The throw statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

*/

import java.util.ArrayList;
import java.util.Collections;

public class MyClass{
	public static void main(String[] args){
		ArrayList<Integer> myNum= new ArrayList<Integer> ();
		myNum.add(5);
		myNum.add(4);
		myNum.add(3);
		myNum.add(3);
		Collections.sort (myNum);
		for(int i:myNum){
			System.out.println(i);
		}
	}
}
