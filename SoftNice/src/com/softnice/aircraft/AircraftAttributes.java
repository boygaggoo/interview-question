package com.softnice.aircraft;

public enum AircraftAttributes {
   PASSENGER(4),CARGO(3),LARGE(2),SMALL(1);
   
   private int value;
   
   private AircraftAttributes (int value) { 
	   this.value = value; 
	   
   }
   public int getValue(){
	   return value;
   }

 
}
