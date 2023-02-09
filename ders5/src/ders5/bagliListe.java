package ders5;

public class bagliListe {
// çift yönlü doğrusal bağlı liste yapisi
	
	node head=  null;
	node son = null;
	
	void basaEkle(int data) {
		
		node eleman = new node(data);
		
		 if(head == null)
		 {
			 head = eleman;
			 son = eleman;
		 }else 
		 {
			 eleman.next= head;
			 head.prev=eleman;
			 head = eleman;
			 
		 }
	}
	
	void sonaEkle(int data) {
		node eleman = new node(data);
		
		 if(head == null)
		 {
			 head = eleman;
			 son = eleman;
		 }else
		 {
			 son.next=eleman;
			 eleman.prev= son;
			 son=eleman;
		 }
		 
	}
	
	
	
	void arayaEkle (int indis, int data) {
		
		node eleman = new node(data);
		
		if(head==null) {
			head=eleman;
			son=eleman;
		}else if (head != null && indis == 0) {
			
			eleman.next= head;
			head.prev= eleman;
			head=eleman;
			
		}else {
			
			int n = 0; // eleman yapisini saydırmamız lazım
			node temp= head;
			while (temp!=null) {
				temp=temp.next;
		        n++;	
			}
			temp=head;
			if(indis > n) {
				
				eleman=son.next;
				eleman.prev= son;
				son=eleman;
				
			}else{
				int i=0;
				while (i!=indis ) {

					temp= temp.next;
					i++;
					
					
				}
				
                 	eleman.prev=temp.prev;
                 	temp.prev.next= eleman;
                 	
                 	eleman.next = temp;
                 	temp.prev = eleman; 	
				
			}}}
	
	
	void bastanSil() {
		
		if (head !=null) {
			if (head.next==null) {
				head=null;
				son=null;
			}else {
				head = head.next;
				head.prev= null;
			}
		}
	}
	
	void sondanSil() {
		
		if (head !=null) {
			if (head.next==null) {
				head=null;
				son=null;
			}else {
				son= son.prev;
				son.next=null;
			}
		}
		
	}void aradanSil(int indis) {
		
		if (head !=null) {
			if (head.next==null && indis <=0) 
			{
				head=null;
				son=null;
			}
			else if(head.next!=null && indis <=0) // burda bastan sil yaptik
			{
				head= head.next;
				head.prev=null;
			}
			else
			{
				
			int n =0;
			node temp= head;
			while(temp!=null) {
				n++;
				temp=temp.next;
				
			}if(indis>=(n-1)){
				
				son=son.prev;
				son.next=null;
				
			}else {
				temp= head;
				int i=0;
				while(i<indis) {
					i++;
					temp= temp.next;
	
				}	
				temp.next.prev= temp.prev;
				temp.prev.next=temp.next;
			
				
				
			}
			}
			}
		
	}
	
	void yazdir() {
		
		node temp=head;
		System.out.print("bas ->");
		
		while(temp!=null) {
			System.out.print(temp.data+ "->");
			temp=temp.next;
		} 
		System.out.println(" son.");
	}
	

	void sondanYazdir() {
		
		node temp=son;
		System.out.print("son ->");
		
		while(temp!=null) {
			System.out.print(temp.data+ "->");
			temp=temp.prev;
		} 
		System.out.println("-> bas.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
