package com.zoo.app;
public class DogsList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a) {
		if (nextIndex < animals.length){
			animals[nextIndex] = d;
			System.out.println("Animal add at" + nextIndex);
			nextIndex++;
		}
	}
}