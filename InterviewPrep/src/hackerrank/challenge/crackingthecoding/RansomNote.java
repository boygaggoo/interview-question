package hackerrank.challenge.crackingthecoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RansomNote {
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String magazine,note;
    public RansomNote(String magazine, String note) {
    	magazineMap=new HashMap();
    	noteMap=new HashMap<>();
    	this.magazine=magazine;
    	this.note=note;
    	
    	
        
    }
    
 

	public boolean solve() {
		for(String s: magazine.split(" ")){
	        if(magazineMap.containsKey(s))
	            magazineMap.put(s,magazineMap.get(s)+1);
	        else
	             magazineMap.put(s,1);
	    }
	    for(String s: note.split(" ")){
	        if(magazineMap.containsKey(s) && magazineMap.get(s)!=0)
	             magazineMap.put(s,magazineMap.get(s)-1);
	        else
	            return false;
	    }

	    return true;  
}
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }

}
