package com.jug.bolivia;
//Instance variables and objects live on the heap.   
// Local variables live on the stack.
class Collar {}
class Dog{
    Collar c;		// Instance variable
    String name;		// Instance variable
    public static void main (String[] params){
        Dog d;		// Local variable: d
        d = new Dog();
        d.go(d);
    }
    void go(Dog dog){     // Local variable: dog
        c = new Collar();
        dog.setName("Aiko");
    }
    void setName(String dogName){	// Local variable: dogName
        name = dogName;
        // do more stuff
    }
}
//Line 8—main() is placed on the stack.
//
//Line 9—Reference variable d is created on the stack, but there’s no Dog object yet.
//
//Line 10—A new Dog object is created on the heap and is assigned to the d reference variable.
//
//Line 11—A copy of the reference variable d is passed to the go() method.
//
//Line 13—The go() method is placed on the stack, with the dog parameter as a local variable.
//
//Line 14—A new Collar object is created on the heap and assigned to Dog’s instance variable.
//
//Line 17—setName() is added to the stack, with the dogName parameter as its local variable.
//
//Line 18—The name instance variable now also refers to the String object.
//
//Notice that two different local variables refer to the same Dog object.
//
//Notice that one local variable and one instance variable both refer to the same String Aiko.
//
//After Line 19 completes, setName() completes and is removed from the stack. At this point the local variable dogName disappears, too, although the String object it referred to is still on the heap.
