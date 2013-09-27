package com.zoo.app;
import com.zoo.PetApp.Pet;

class Dog extends Canino implements Pet {
   public void makeNoise(){
  	  System.out.println("im the dogWAUFFFF !!! ");
   }
   public void eat(){
   	System.out.println(" i eat Cats");
   }
   public void sleep(){
     System.out.println("im the DOG ZzzzZZZzzz ");

   }
   public void roam(){
   	System.out.println("whatelse DOg");
   }	
   public void beFriendly() {
    System.out.println("Im a nice dog ben friendly");
   }
   public void play(){
        System.out.println("im plying DOG");
   }
}