package com.softnice.aircraft;

import java.util.Comparator;

public class PriorityComparator implements Comparator<AC> {

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
