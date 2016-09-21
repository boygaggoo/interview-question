package certification;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest {

	public static void main(String[] args) {
		int a=-10;
		int b=17;
		int c=++a;
		int d=b--;
		c++;
		d--;
		System.out.println(c+","+d);
		
		List<Alpha> al=new ArrayList<Alpha>();
	
		al.add(new Alpha());
		al.add(new Beta());
		al.add(new Gama());
		for(Alpha ar:al){
			System.out.println(ar.doStuff("Java"));
		}
		
	}
	
	 

}
class Alpha{
	public String doStuff(String msg){
		return msg;
	}
}
class Beta extends Alpha{
	public String doStuff(String msg){
		return msg.replace('a', 'e');
	}
}
class Gama extends Beta{
	public String doStuff(String msg){
		return msg.substring(2);
	}
}

