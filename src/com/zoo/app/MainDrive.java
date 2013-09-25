package com.zoo.app;
import java.util.*;
class MainDrive {
	public static void main(String [] args) {
	    
	    go();


	}
	

	public static Object getObject(Object o){
		return o;
	}

	public static void go(){
        Dog d = new Dog();
		Cat c = new Cat();

		Object d1 = getObject(d);
		Object c1 = getObject(c);

		ArrayList<Object> l1 = new ArrayList<Object>();
		
         
		l1.add(d1);
        l1.add(c1);

        Object o1 = l1.get(0);
        Object o2 = l1.get(1);
        System.out.println(o1.toString() + " - " + o2.toString() );

        Dog d2 = (Dog)o1;
        Cat c2 = (Cat)o2;

        
        System.out.println("Dog & Cats Again = " );
        d2.makeNoise();
        c2.makeNoise();

	}
}