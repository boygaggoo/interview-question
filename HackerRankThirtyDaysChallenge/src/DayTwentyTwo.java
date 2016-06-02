
public class DayTwentyTwo {
	 
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if( DayTwentyTwo .class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }

	private static <T> void printArray(T[] a) {
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
}

