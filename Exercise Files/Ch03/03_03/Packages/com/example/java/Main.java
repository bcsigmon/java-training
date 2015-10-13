/*
3. Getting Started
Hello World Example
*/

package com.example.java;
//reverse domain name notation 

public class Main {

	/* 
	- public is an access modifier, public means the class we're about to declare is available to the entire application 
	- class is a keyword
	- Main is the name of the class
		- all Java classes should start with upper case letter
		- remember everything else - methods, variables, and other members of class always start with a lower case character
		- and CONSTANTS are always all upper case
	- {} = a code block
	*/

	//method of the class
	public static void main (String[] args){	
		/*
		public =  an access modifier
		static = this is a member of the class that can be called from the class itself, without needing to be called from an instance of the class; static vs member methods come later
		void = this method won't return any value (like a procedure in pl/sql has no return value, but a function does in pl/sql)
		main = the name of the method (think of it like a procedure name in pl/sql. remember the method name is lower case
		() = method signature; this is where the arguments go
		String[] args = String is the data type (also a class itself), it's an array to the double brackets, and args is the name of the argument (parameter). All main methods require this "signature": public static void main (String[] args){} 
		*/
		
		//Hello World Eample
		System.out.println("Hello from Java!");
		
		//Passing arguments to a console application 
		System.out.println(args[0]); //print 1st item in the args array
		
		//save file as "Main.java". Main must match the class name and is case sensitive
	}
}