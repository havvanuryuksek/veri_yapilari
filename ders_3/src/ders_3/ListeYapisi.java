package ders_3;

public class ListeYapisi {
	
node head = null;
node son = null;

	void ekle(int x )
	{
		node eleman = new node(); // eklenecek olan düğüm(obje)
		eleman.data = x ;
		eleman.next = null ;
		
		if (head==null ) {
			
			head = eleman;
			son = eleman;
			System.out.println("liste oluşturuldu ve ilk düğüm (obje) ekledi");
			
		}else 
		{
			son.next= eleman; // son elemanın devamına yeni düğümü ekledim
			son = eleman;// son düğümü (tail) güncelledim
			System.out.println("listenin sonuna yeni bir eleman eklendi" ); 
		}
		
	}
	void yazdir() {
		if(head==null) {
			System.out.println("liste yapisi bos !!!");
		}else {
			node temp = head;
			System.out.print( "\n bas -->");
			while(temp!=null) {
				System.out.print(temp.data + "-->");
				
				temp = temp.next;

			}
			System.out.println("son");

		}
	}
	
}
