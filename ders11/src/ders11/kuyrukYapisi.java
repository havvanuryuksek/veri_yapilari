package ders11;

public class kuyrukYapisi {
	
	node front; //head
	node rear; // son
	int cnt; // kaç eleman ekleneceğini tutan sayaş (counter sayıcı)
   
	int size;//kuyruk kaç elemanlı olsun diye kullanıcıya sorma

	public kuyrukYapisi(int size) {
		
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
	}
	
	void enQueue(int data) {
		if(doluMu()) {
			System.out.println(data+ " kuyruk dolu oldugundan eklenemedi");
		}else {
			node eleman = new node(data);
			
			//hep sona ekleyecez
			if(bosMu()) {
				
				front = eleman;
				rear  = eleman;	
				System.out.println(data+ "kuyruga ilk eleman olarak eklendi");
			}else {
				rear.next = eleman;
				rear=rear.next;
				System.out.println(data+ "kuyruga eklendi");
			}
			cnt++;
		}
	}
	void deQueue() {
		
		//bastan silecez
		if(bosMu()) {
			System.out.println("kuyruk bos, silinecek eleman yok");
		}else {
			System.out.println(front.data+"silindi");
			front=front.next;
			cnt--;
		}
		 
	}
	private boolean bosMu() {
		return cnt==0;
	}
	

    private boolean doluMu () {
	return cnt==size;

}
    void yazdir() {
    	
    	if(bosMu()) {
    		System.out.println("kuyruk bos, yazdirilacak eleman yok");
    		
    	}else { // bastan sona yazdirma
    		node temp = front;
    		System.out.print("bas <-");
    		while(temp!=null) {
    			System.out.print(temp.data + "<-");
    			temp=temp.next;
    			
    			
    		}
    		System.out.println("son");
    	}
    }


	
	
	
	
	
	
	
	
}
