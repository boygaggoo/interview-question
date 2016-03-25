package com.softnice.aircraft;

public class AC  {
	private AircraftAttributes type;
	private AircraftAttributes size;

    
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

	public int getType() {
		
		return type.getValue();
	}

	public int getSize() {
		
		return size.getValue();
	}
	
	public String toString(){
		return "type="+type+",size="+size;
	}
   
}
