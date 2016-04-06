package String;

public class StringToInteger {
public static void main(String[] args) {
	System.out.println('1'-'0');
	System.out.println(atoi("10"));
}

private static int  atoi(String str) {
	if (str == null || str.length() < 1)
		return 0;
 
	double result = 0;
	int i=0;
	// calculate value
	while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		result = result * 10 + (str.charAt(i) - '0');
		i++;
	}
 
//	if (flag == '-')
//		result = -result;
 
	// handle max and min
	if (result > Integer.MAX_VALUE)
		return Integer.MAX_VALUE;
 
	if (result < Integer.MIN_VALUE)
		return Integer.MIN_VALUE;
 
	return (int) result;
}
}
