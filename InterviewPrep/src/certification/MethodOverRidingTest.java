package certification;

public class MethodOverRidingTest {
	public static void main(String[] args) {
		char x=8;
		int z='8';
		System.out.println(doMsg(x));
		System.out.println(doMsg(z));
	}

	private static String doMsg(char x) {
		// TODO Auto-generated method stub
		return "Good Day!";
	}
	private static String doMsg(int x) {
		// TODO Auto-generated method stub
		return "Good Luck!";
	}


}
