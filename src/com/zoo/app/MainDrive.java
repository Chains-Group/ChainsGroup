package com.zoo.app;
class MainDrive {
	public static void main(String [] args) {
	    System.out.println("primer codigo guardado");
	    AnimalList al = new AnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
	    al.add(d);
	    al.add(c);
	}
}