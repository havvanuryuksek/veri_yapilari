package ders13;

public class uygulama {

	public static void main(String[] args) {

	tablo hTablo = new tablo(5);
    hTablo.ekle(10, "selahaddin");		
    hTablo.ekle(0, "naciye");		

    hTablo.ekle(3, "arzu");		
    hTablo.ekle(4, "sadiye");		

    hTablo.ekle(2, "murat");		
    hTablo.ekle(22, "mesut");		

    hTablo.ekle(15, "bunyamin");		
    hTablo.ekle(9, "mirac sadi");	
    
    hTablo.ekle(5, "buse");		
    hTablo.ekle(20,"havva nur");		

    System.out.println();
  hTablo.yazdir();

//System.out.println(hTablo.dizi[3].next.isim);
		
		
		
	}

}
