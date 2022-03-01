package day15_w4_constructors;

// click ==> Source + Generate constructor using Fields. and choose Last member and that click Generate


/*
We use instance variables in constructors as parameters, because constructors create objects
and they use object related variables which are instance variables.

We do not use class variables inside the constructors, because class variables are related with class
not with objects
*/



public class _01_Animal {

String name;
int age;
boolean isCarnivorous;
String specy;
char gender;

static int counter;

public _01_Animal() {
	counter++;
}

public _01_Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
	this.name = name;
	this.age = age;
	this.isCarnivorous = isCarnivorous;
	this.specy = specy;
	this.gender = gender;
	counter++;
}

public _01_Animal(String name, int age, char gender) {
	this.name = name;  
	this.age = age;
	this.gender = gender;
	counter++;
}

public _01_Animal(String specy) {
	/*
	 	1) this() is used for constructor call
	 	2) this() must be in the first line inside the constructor
	 	3) In a constructor, how many times can "this()" be used? 
	 	   Answer: At most once. Because this() must be in the first line, if you use 
	 	           more than once where will you put it? You need to put it into second, third, etc
	 	           lines but it is not allowed.
	 	           
	 	What is the difference between "this()" and "this"?           
	 	1)"this()" is used for constructor call, "this" is used for variable call.          
	 	2)"this()" can be used just once, "this" can be used many times.         	           
   */
	this("Bobby", 5, 'M'); 	
	this.specy = specy;		
	counter++;
}
}