package algorithms;

import java.util.Date;

public class LibraryFine {
	public static void main(String[] args) {
		int d1=9,m1=6,y1=2015,d2=9,m2=7,y2=2015;
		System.out.println(calculateFine(d1,m1,y1,d2,m2,y2));
		System.out.println(calculateFine(6, 6 ,2015,9, 6, 2016));
		
	}

	private static int calculateFine(int d1, int m1, int y1, int d2, int m2,
			int y2) {
	
		int fine=0;
		if(y1==y2){
			if(m1==m2){
				if(d1>d2){
				int differenceDate=d1-d2;
				fine=15*differenceDate;
			}
				
		}
			else if(m1>m2){
				int differenceMonth=m1-m2;
				fine=500*differenceMonth;
			}
		
			}
		else if(y1>y2){
			fine=10000;
		}
	    return fine;	
	}

}
