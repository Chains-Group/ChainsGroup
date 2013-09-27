package com.zoo.app;

public abstract class Animal {


   public static void main(String [] args){
   	   System.out.println("Works !!! ");
   	   Lion l = new Lion();
   	   l.makeNoise();
   }

   // metodos abstractos a implementar en classes concretas que hereden de animal
   public abstract void makeNoise();
   public abstract void eat();
   public abstract void sleep();
   public abstract void roam();
}