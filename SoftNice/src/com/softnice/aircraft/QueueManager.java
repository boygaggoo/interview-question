package com.softnice.aircraft;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * The main class for the AC
 * @author Siddiq Ahmed Syed
 *
 */
public class QueueManager implements Operations {
    private List<AC> aircraft_queue=new LinkedList<AC>();//storing the AC
    private Scanner in; 
    
    public QueueManager() {
		in=new Scanner(System.in);
	}
	@Override
	public void Enque(AC aircraft) {
		aircraft_queue.add(aircraft);
		
	}

	@Override
	public AC Deuque() {
		AC ac = null;
		if(!aircraft_queue.isEmpty()){
			Collections.sort(aircraft_queue, new PriorityComparator());
			ac=aircraft_queue.remove(0);
		}
		return ac;
	}
	


	public void aqm_request_process(String reqType){
		if(reqType.equals(reqType.toLowerCase().equals("deuque"))){
			Deuque();
		}
		else if(reqType.equals(reqType.toLowerCase().equals("enque"))){
			enque();
		}
	}

	private void enque() {
	  System.out.println("Enter the flight information");
	  System.out.println("Flight Type:");
	  String type=in.nextLine();
	  System.out.println("Flight Size:");
	  String size=in.nextLine();
	  Enque(new AC(type, size));
	  
	  
		
	}

}
