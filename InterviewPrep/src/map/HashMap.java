package map;

public class HashMap {
	int capacity=16;
	HashEntry[] map;
	public HashMap() {
		map=new HashEntry[capacity];
	}
	public int get(int key){
		int hash=key%capacity;
		while(map[hash]!=null &&map[hash].getKey()!=key){
			hash=(hash+1)%capacity;
		}
		if(map[hash]==null){
			return -1;
		}
		else{
			return map[hash].getValue();
		}
	}
	public void put(int key,int value){
		int hash=key%capacity;
		while(map[hash]!=null&&map[hash].getKey()!=key){
			hash=(hash+1)%capacity;
		}
		map[hash]=new HashEntry(key, value);
		
	}
	
	
}
