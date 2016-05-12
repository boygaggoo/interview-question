package String;

import java.util.Map;
import java.util.TreeMap;

import map.Entry;

public class NumberRange {

	public static String findRange(String inputRange) {
		
		StringBuilder result=new StringBuilder();
		Map<Integer, Integer> rangeMap=new TreeMap<Integer, Integer>();
		String input=inputRange.replaceAll("\\s", "");
		String [] inputArray=input.split(",");
		int prevEntry=0;
		for(String s:inputArray){
			String []limits=s.split(":");
			int start=Integer.parseInt(limits[0]);
			int end=Integer.parseInt(limits[1]);
			
			if(rangeMap.containsKey(start)){
				//CASE a: 1:5,1:10->1:10
				if(rangeMap.get(start)>end){
					rangeMap.put(start, end);
					prevEntry=start;
				}
				
				
			}
			//CASE b: 1:5,2:10->1:10
			else if(start-prevEntry==1){
				if(rangeMap.get(prevEntry)<end){
				rangeMap.put(prevEntry, end);
				}
				
			}
			//CASE b: 1:5,7:10->1:5,7:10
			else{
				rangeMap.put(start, end);
				prevEntry=start;
			}
			
		}
		for(java.util.Map.Entry<Integer, Integer> entry:rangeMap.entrySet()){
			result.append(entry.getKey()+":"+entry.getValue()+",");
		}
		return result.toString();
		
	}

}
