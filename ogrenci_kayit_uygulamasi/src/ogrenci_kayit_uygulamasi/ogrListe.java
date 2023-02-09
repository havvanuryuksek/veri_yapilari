package ogrenci_kayit_uygulamasi;

import java.util.Scanner;

public class ogrListe {
    ogrNode head= null;
    ogrNode son= null;
    ogrNode temp=null;
    ogrNode temp2=null;
    

	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	Scanner scanner = new Scanner(System.in); 
    
    void ekle() {
    	
    	System.out.println("Bilgisayar bolumune kayit olacak ogrenci bilgilerini giriniz :");
    	System.out.println("numara : "); numara = scanner.nextInt();
    	scanner.nextLine(); // boşluğu da değer algılamasın diye
    	System.out.println("ad : "); ad = scanner.nextLine();
    	System.out.println("soyad : "); soyad = scanner.nextLine();
    	System.out.println("viz : "); vize = scanner.nextInt();
    	System.out.println("fin : "); fin = scanner.nextInt();
    	
    	
    	ogrNode eleman = new ogrNode(numara, ad , soyad, vize, fin); // yukarda bilgileri aldık ve eleman nesnesine ekledik
    	
    	if(head==null) {
    		head=eleman;
    		son=null;
    		System.out.println("Bilgisayar bolumune kayıt olacak ogrencilerin liste yapisi olusturuldu ilk ogrenci kayır edildi  ");
    	}else {
    		
    		eleman.next=head;
    		head=eleman;
    		System.out.println(numara + "numarali ogrenci kayıt oldu");
    		
    	}

    }
	
	void sil() {
		if(head==null) {
			System.out.println("liste bos");
			
		}else {
			
			System.out.println("silme istediğiniz ogrencinin numarasını giriniz: ");
			numara= scanner.nextInt();		
			
			if(numara == head.numara && head.next==null) {
				head=null;
				son=null;
				System.out.println(numara +"numarali ogrenci silindi listede kayitli ogrenci kalmadi");
			}else if(numara == head.numara && head.next!=null) { // yine başı silmek isteyebilir ama listede birden fazla eleman varsa başı tutmak gerek
				
				head= head.next;
				System.out.println(numara +"numarali ogrenci silindi");
				
			}else {
				
				temp=head;
				temp2=head;
				while(temp.next!=null) {
					
					if(numara==temp.numara) {
						
						temp2.next=temp.next;
						System.out.println(numara +"numarali ogrenci silindi");
					}
					temp2=temp;// taramak için ikiside
					temp=temp.next;
					
				}
				if(numara==temp.numara) { // aradığımız şey son düğüm olabilir
					
					temp2.next=null;
					son=temp2;
					System.out.println(numara +"numarali ogrenci silindi");
				}
				
			}
			
		}
	}

	void yazdir() {

		
		if(head==null) {
			System.out.println("liste bos !!!");
		}else {
			
			temp=head;
			while( temp!=null) {
				
				System.out.println(temp.numara+"numarali ogrenci bilgileri ");
				System.out.println("ad       :" +temp.ad);
				System.out.println("********************************");
				System.out.println("soyad    :" +temp.soyad);
				System.out.println("********************************");
				System.out.println("vize     :" +temp.vize);
				System.out.println("********************************");
				System.out.println("final    :" +temp.fin);
				System.out.println("********************************");
                System.out.println("ortalama :" +temp.ortalama);			
				System.out.println("********************************");
				System.out.println("durum    :" +temp.durum);

				
				
				temp=temp.next;
				
				
				
			}
		}
		
	}

    void  enBasariliOgrenci() {
    	if(head==null) {
    		System.out.println("liste bos !!!");
    	}else {
    		temp=head;
    		double goodogrenci= temp.ortalama;
    		while(temp!=null) {
    		if( goodogrenci < temp.ortalama) {
    			
    			goodogrenci = temp.ortalama;
    			ad = temp.ad;
    			soyad  =temp.soyad;
    			vize=temp.vize;
    			fin = temp.fin;
    			ortalama = temp.ortalama;
    			durum = temp.durum;
    			
    		}
    			temp=temp.next;
    		}
    		System.out.println("en basarili ogrenci bilgileri ");
			System.out.println("ad       :" +ad);
			System.out.println("********************************");
			System.out.println("soyad    :" +soyad);
			System.out.println("********************************");
			System.out.println("vize     :" +vize);
			System.out.println("********************************");
			System.out.println("final    :" +fin);
			System.out.println("********************************");
            System.out.println("ortalama :" +ortalama);			
			System.out.println("********************************");
			System.out.println("durum    :" +durum);

    	}
    }





}
