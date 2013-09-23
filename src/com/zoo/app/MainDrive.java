package com.zoo.app;
import java.util.*;
class MainDrive {
	public static void main(String [] args) {
	    System.out.println("primer codigo guardado");
	    AnimalList al = new AnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
	    al.add(d);
	    al.add(c);
        


        Dog d3 = new Dog();
		Dog d4 = (Dog)getObject(d3);
		System.out.println("Casting " + d4.toString()+ "Casting");




	}
	

	public static Object getObject(Object o){
		return o;
	}
}