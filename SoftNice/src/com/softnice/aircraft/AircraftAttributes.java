package com.softnice.aircraft;
/**
 * ENUM for attributes of AC
 * @author Siddiq Ahmed Syed
 *
 */
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
