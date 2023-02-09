package ders13;
public class tablo {

	node dizi [];
	int size;
	public tablo(int size) {
		this.size=size;
		dizi = new node [size]; // dizimizi tanımlamış olduk
	
	for(int i=0;i<size;i++) {
		dizi[i]= new node();
		
	}
	}
	int indexUret (int key) {
		return key % size;
		
	}
	void ekle(int key, String isim) {
		int index = indexUret(key);
		
		node eleman = new node(key,isim);
		
		node temp = dizi[index]; // bakıcak indise önünde bosluk var mı yok mu
	
	   while(temp.next!=null)  // ilgili bagli listenin sonuna ekleme yaptı
		   temp=temp.next;
	   
		temp.next=eleman;
	
	System.out.println(eleman.isim + " eklendi");
	   
	   }
	
	void sil(int key) {
		boolean sonuc = false; //olmayan kişiyi kontrol altına almak için
		int indis =indexUret(key);
		node temp =dizi[indis];
		node temp2=dizi[indis];
		
		if(temp.next==null)
		{
			System.out.println(key + "numarali kayit yok");
			sonuc=true;
		}
		else if(temp.next.next==null && temp.next.key== key) 
		{ // yani bir tane düğüm var
			sonuc=true;
			System.out.println("bu kisimdaki son kisi olan "+temp.next.isim+" silindi");
			temp.next =null;
		}
		else 
		{	//aradığımız key i bulalım: bşrden fazla düğüm ise
			 while(temp.next!=null)
			 {
				 temp2 = temp;
					temp = temp.next;

					if(temp.key==key) {
						sonuc = true;
						System.out.println(temp.isim+ "  silindi");
						temp2.next=temp.next;
					}
		}
			 
}
		if (sonuc==false) 
			System.out.println(key + " numarali kayit yok");		
	}
	void yazdir() {
		
	for (int i =0; i<size;i++) {
		 node temp = dizi[i];
		 
		 System.out.print( "dizi["+i+"] ->" );
		 
		 if(temp.next!=null) {
			 while(temp.next!=null) {
				 System.out.print(temp.next.key+" - "+temp.next.isim+" -> ");
				 temp=temp.next; //ilerlet ki sonsuz döngüye girmesin
			 }
			 
		 }
		 System.out.println();//satır başı yaptık
	}
	}
	}



























