package palindromKelimeUygulamasi;

public class QueueYapisi {
	node front;
	node rear;
	int cnt;
	int size;
	public QueueYapisi(int size) {
	
		this.size = size;
		front = null;
		rear=null;
		cnt=0;
	}
	void enQueue(char ch) {
		if (!doluMu()) {
			node eleman= new node(ch);
			if(bosMu()) {
				front=eleman;
				rear=eleman;
			}else {
				rear.next= eleman;
				rear=eleman;
			}
			cnt++;
		}
	}
    char deQueue() {
    	if( !bosMu()) {
    		char ch = front.harf;
    	    front=front.next;
    	    cnt--;
    	    return ch;
    	}else {
    		return '+';
    	}
		
	}
    boolean bosMu() {
    	return cnt==0;
    }
 boolean doluMu() {
    	return cnt==size;
    }
}
