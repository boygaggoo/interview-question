package String;

public class RemoveChar {
	
	
	public static String removeCharRecursive(String str, char c) {
		// TODO Auto-generated method stub
		int index=str.indexOf(c);
		if(index==-1){
			return str;
		}
		
		
		return removeCharRecursive((str.substring(0,index)+str.substring(index+1)),c);
	}

	public  static String removeChar(String str, char charToRemove) {
	    StringBuilder sb=new StringBuilder();
	    for(char c:str.toCharArray()){
	    	if(c!=charToRemove){
	    		sb.append(c);
	    	}
	    }
		return sb.toString();
	}

}
