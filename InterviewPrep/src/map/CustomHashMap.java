package map;

public class CustomHashMap <K,V>{
      Entry<K,V> [] table;
	public CustomHashMap() {
		table=new Entry[4];
	}
	public void put(K newKey, V data){
		
		Entry<K, V> newEntry=new Entry<K, V>(newKey, data, null);
		if(newKey==null){
			return;
		}
		int hash=hash(newKey);
		if(table[hash]==null){
			table[hash]=newEntry;
			}
		else{
			Entry<K, V> previous=null;
			Entry<K, V> current=table[hash];
			while(current!=null){
				if(current.key.equals(newKey)){
					if(previous==null){
						newEntry.next=current.next;
						table[hash]=newEntry;
						return;	
					}
					else{
		                   newEntry.next=current.next;
		                   previous.next=newEntry;
		                   return;
		               }
					
				}
				 previous=current;
	             current = current.next;
	         }
	         previous.next = newEntry;
			
        }
			
		
	}
	
	public V get(K key){
		int hash=hash(key);
		if(table[hash]==null){
			return null;
		}
		Entry<K, V> temp=table[hash];
		while(temp!=null){
			if(temp.key.equals(key)){
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode())%4;
	}
}
