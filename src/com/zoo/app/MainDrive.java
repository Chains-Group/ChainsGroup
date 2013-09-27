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
        
       ArrayList<Object> list1 = new ArrayList<Object>();
       Dog d = new Dog();
       Cat c = new Cat();
       list1.add(d);
       list1.add(c);
       Object o = list1.indexOf(d);
       System.out.println(o);


       Object o2 = list1.get(0);
       Dog d2 = (Dog)o2;
       d2.makeNoise();

       System.out.println("Funcionono");

	}
}