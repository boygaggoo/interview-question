package Arrays;

public class FibWithMemoization {
	static int [] dictionary=new int [20];
public static void main(String[] args) {
	for(int i=0;i<dictionary.length;i++){
		dictionary[i]=0;
	}
	System.out.println(fibs(19));
	
}

private static int fibs(int n) {
	// TODO Auto-generated method stub
	
		if (n == 0) 
		{
		  // special case because fib(0) is 0
		  return dictionary[0];
		}
		else 
		{
		  int f = dictionary[n];
		  if (f == 0) {
		    // number wasn't calculated yet.
		    f = fibs(n-1) + fibs(n-2);
		    dictionary[n] = f;
		  }
		  return f;
		}
	
}
}
