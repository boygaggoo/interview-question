package certification;

public class ExceptionOne {
public static void main(String[] args) throws Exception  {
	doSomething();
}
private static void doSomething() throws Exception {
	
		/*try {
			doSomethingElse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	throw new Exception();
}
private static void doSomethingElse() throws Exception {
	
		throw new Exception();
	
}
}
