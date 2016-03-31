package random;

public class AddWIthLogic {
public static void main(String[] args) {
	System.out.println(add(2,3));
}

private static int add(int a, int b) {
	// TODO Auto-generated method stub
	while(b!=0)
	{
	int carry=a&b;
	System.out.println("Carry:"+carry);
	 a=a^b;
	 System.out.println("a"+a);
	 b=carry <<a;
	}
	return a;
}
}
