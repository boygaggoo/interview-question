package com.softnice.aircraft;
/**
 * Aircraft Class
 * @author Siddiq Ahmed Syed
 *
 */
public class AC  {
	private AircraftAttributes type;
	private AircraftAttributes size;

    /**
     * Contructor
     * @param type of AC
     * @param size of AC
     */
	public AC(String type, String size) {
		
		if(type.toLowerCase().equals("passenger")){
		this.type=AircraftAttributes.PASSENGER;
		}
		else if(type.toLowerCase().equals("cargo")){
			this.type=AircraftAttributes.CARGO;
		}
		if(size.toLowerCase().equals("small")){
			this.size=AircraftAttributes.SMALL;
			}
		else if(size.toLowerCase().equals("large")){
			this.size=AircraftAttributes.LARGE;
		}
	}
/**
 * 
 * @return the value of the AC
 */
	public int getType() {
		
		return type.getValue();
	}
/**
 * 
 * @return the size of AC
 */
	public int getSize() {
		
		return size.getValue();
	}
	
	public String toString(){
		return "type="+type+",size="+size;
	}
   
}
