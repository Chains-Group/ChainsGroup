package com.zoo.app;
import java.util.*;
class ObjectContent {
	private ArrayList<Dog> dogs = new ArrayList<Dog>();


	public void addDogs(){
		Dog d1 = new Dog();
		dogs.add(d1);
		Dog d = dogs.get(0);
		System.out.println(d.getClass());
	}
}