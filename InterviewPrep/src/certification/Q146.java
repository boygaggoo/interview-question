package certification;

public class Q146 {
public static void main(String[] args) {
	int r=10;
	for(;r>0;){
		int c=r;
		while(c>=0){
			System.out.println(c);
			c-=2;
		}
		System.out.println(r+","+c);
		r=r/c;
		System.out.println(r);
	}
}
}
