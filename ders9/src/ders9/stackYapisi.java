package ders9;

public class stackYapisi {

	// önce kapasite oluşturucaz size ile
	
	int size;
	int cnt; // cnt ekleme yaptıkça artacak azaltma yaptıkça azalacak
	node top; // en üst düğümü tutan gösterici head gibi düşünülebilir
	
	public stackYapisi(int size) {
		this.size=size;
		cnt=0; // yapı var ama boş anlamına gelecek
		top=null;
		
	}
	 
	void push(int data) { //ekle
		
		node eleman= new node(data);
		if(doluMu()) {
			System.out.println("stack dolu ekleme yapilamadi");
			
		}else {
			if(bosMu()) {
				top = eleman;
			System.out.println(top.data +"stacke ilk eleman olarak eklendi");	
			}else {
				eleman.next=top;
				top=eleman;
				System.out.println(top.data+"stacke eklendi");
			}
			cnt++;
		}
		
		
	}
	void pop() { // cıkarma
		if(bosMu()) {
			System.out.println("stack bos, cikarilacak bir sey yok");
		}else {
			System.out.println(top.data+"cikartildi");
			top=top.next;
			cnt--;
		}
	}
	void yazdir() {
		if(bosMu()) {
			System.out.println("stack bos, yazdirilacak bir sey yok");
			
		}else {
			node temp= top;
			System.out.println("stack deki veriler \n");
			while(temp!= null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println("\n");
		}
		
		}
	void topGoster() {
		if(bosMu()) {
			System.out.println("stack bos");
		} else
			System.out.println("en ustteki dugumun datası : "+ top.data);
	
	}
	boolean doluMu() {
		return cnt == size;
		
	}
	boolean bosMu() {
		
		return cnt == 0;
	}
	
	
}
