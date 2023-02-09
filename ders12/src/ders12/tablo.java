package ders12;

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
	
	   while(temp.next!=null) { // ilgili bagli listenin sonuna eleme yaptı
	
		temp=temp.next;
		temp.next=eleman;
	
	System.out.println(eleman.isim + "eklendi");
	   }
	   }
	
	
	
	
	
}
