package maths;

public class CLockAngles {
public static void main(String[] args) {
	System.out.println(findAngle(12,30));
}

private static double findAngle(int hour, int min) {
	double m=6*min;
	double h=0.5*(60*hour+min);
	return Math.abs(h-m);
	
}
}
