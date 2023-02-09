package ders4;

public class TekYonluListeYapisi { //düğümleri buranın içerisine ekliyoruz
	
	node head = null;
	node son=null;
	
	void basaEkle(int x) {
		
		node eleman = new node();
		eleman.data = x;
		
		if(head==null) {
			eleman.next=null;
			head = eleman;
			son=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
		}else {
			 eleman.next=head;
			 head=eleman;
			 System.out.println("başa eleman eklendi");
		}
	
	
		
		
	}
	void sonaEkle(int x) {
		
		node eleman = new node();
		eleman.data=x;
		
		if(head==null) {
			eleman.next=null;
			head=eleman;
			son=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
			
		}else {
			eleman.next=null;
			son.next= eleman; //ekleme yaptık
			son= eleman; //isim güncelledik
			System.out.println("sona eleman eklendi");
		}
		
	}
	
	void arayaEkle(int indis, int x) {
		
		node eleman = new node();
		eleman.data= x;
		
		 if(head==null && indis==0) {
			 eleman.next=null;
			 head=eleman;
			 son=eleman;
			 System.out.println("Liste yapisinde eleman oluşturuldu ilk eleman eklendi");
		 }else if(head!=null && indis==0) {
			 eleman.next= head;
			 head=eleman;
			 System.out.println(indis + "indisinci elemana yeni eleman eklendi");
		 }else {
			 
			 int n =0;
			 node temp= head;
			 node temp2 =head;
			 
			 while(temp.next!=null) 
			 {
				n++;
				temp2=temp;
				temp = temp.next;
				 
			 }
			 if( n==indis ) { //sondan bir önceki için
				 
				 temp2.next= eleman;
				 eleman.next=temp;
				 System.out.println("eleman eklendi");
				 
				 
			 }else
			 {
				temp=head;
				temp2=head;
				int i = 0;
				while( i!=indis) {
					temp2=temp;
					temp=temp.next;
					i++;
					
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis+ "indisinci siraya eleman eklendi");
			 }
			 
			 
		 }
		
		
	}
	
	void bastanSil()
	{
		if(head==null) {
			System.out.println("liste bos, silinecek nesne yok");
		}else if(head.next==null) {
			head=null;
			son=null;
			System.out.println("listede kalan son elemanda silindi");
			
		}else {
			
			head=head.next;
			System.out.println("bastaki eleman silindi");
		}
	}
	
	void sondanSil(){

		if(head==null) {
			System.out.println("liste bos");
		}else if(head.next==null) {
			son=null;
			head=null;
			System.out.println("listede kalan son eleman silindi");
		}else {
			
			node temp=head;
			node temp2=head;
			
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
			}
			
			temp2.next=null;
			son=temp2;
			System.out.println("sondan eleman silindi");
		}
		

	}
   
	
	void aradanSil(int indis) {
		if(head==null) {
			System.out.println("liste bos, silinecek bir şey yok");
		}
		else if(head.next==null && indis==0) { // 0.indiste düğüm varsa silmek için
			head=null;
			son=null;
			System.out.println("listede kalan son eleman silindi");
		
	}else if(head.next!=null && indis==0) { // head i silmek için
		
		head= head.next;
		System.out.println("bastaki eleman silindi");
		
	}else {
		
		int i=0;
		node temp=head;
		node temp2=head;
		
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		if( i==indis ) {
			
			temp2.next=null;
			son=temp2;
			System.out.println("listediki son eleman silindi");
		}
		else {
			temp=head;
			temp2=head;
			int j = 0;
			while(j!= indis) {
				
				temp2=temp;
				temp=temp.next;
				j++;
			}
			
			temp2.next=temp.next;
			System.out.println("aradaki nesne silindi");
		}
		
	}
	}
	
	void yazdır( ) {
		
		if(head==null) {
			System.out.println("liste yapisi boş");
		}else {
			node temp= head;
			System.out.print("bas ->");
			while( temp!=null) {
				System.out.print(temp.data+ "->");
				temp= temp.next;
			}
			System.out.println("son.");
		}
		
		
	}
	
	

}
