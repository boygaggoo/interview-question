package com.softnice.aircraft;

import java.util.Comparator;
/**
 * 
 * @author Siddiq Ahmed Syed
 *
 */
public class PriorityComparator implements Comparator<AC> {
/**
 * The goal is to compare the sort based on following rules
 * a. Passenger AC’s have removal precedence over Cargo AC’s.
   b. Large AC’s of a given type have removal precedence over Small AC’s of the same type.
   c. Earlier enqueued AC’s of a given type and size have precedence over later enqueued AC’s of the same type and size.
 */
	@Override
	public int compare(AC ac1, AC ac2) {
	    int ac1Type=ac1.getType();
	    int ac2Type=ac2.getType();
	    int ac1Size=ac1.getSize();
	    int ac2Size=ac2.getSize();
	    if(ac1Type>ac2Type ||ac1Size>ac2Size){
	    	return 1;
	    }
	    else if(ac1Type<ac2Type||ac1Size<ac2Size){
	    	return -1;
	    }
	    else{
		return 0;
	    }
	}

}
