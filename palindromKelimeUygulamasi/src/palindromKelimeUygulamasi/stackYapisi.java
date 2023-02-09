package palindromKelimeUygulamasi;

public class stackYapisi {
	
	node top;
	int size;
	int cnt;
	public stackYapisi(int size) {
		this.size = size;
		cnt=0;
		top=null;
	}
	void push(char ch) {
		if( !doluMu()) {
			node eleman =new node(ch);
			if(bosMu()) {
				
				top=eleman;
				
			}else {
				eleman.next=top;
				top=eleman;
				
			}
			cnt++;
		}
		
	}
	
   char pop() {
	   if(!bosMu()) {
		   char harf = top.harf;
		   top=top.next;
		   cnt--; // cıkartma var ya eksiltmeyi unutma
		   return harf;
		   
	   }else {
		   return '-';
	   }
	
}
   boolean bosMu() {
	  return cnt==0; //stack bos
   }
   boolean doluMu() {
	 return  cnt==size; //stack dolu
	   
   }
}
