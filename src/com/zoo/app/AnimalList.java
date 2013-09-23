package com.zoo.app;
public class AnimalList {
	private Animal[] animals = new Animal[5];
	private Dog dogs;
	private	Cat cats;
	private int nextIndex = 0;

	public void add(Animal a) {

        
		if (nextIndex < animals.length){
			System.out.println(a.getClass());
			animals[nextIndex] = a;
			System.out.println("Animal add at" + nextIndex);
			
			nextIndex++;
		}
			 
	}
}