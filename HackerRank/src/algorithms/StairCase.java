package algorithms;

public class StairCase {
public static void main(String[] args) {
	print(6);
	
}

private static void print(int n) {
   for(int i=1;i<=n;i++){
	   System.out.printf("%"+n+"s",getHash(i));
	   System.out.println();
   }
	
}

private static String getHash(int n) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<n;i++){
		sb.append("#");
	}
	return sb.toString();
}
}
