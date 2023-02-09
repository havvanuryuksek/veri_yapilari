package ogrenci_kayit_uygulamasi;

public class ogrNode {
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	ogrNode next;

	public ogrNode(int numara, String ad, String soyad, int vize, int fin) {
		
		this.numara = numara;
		this.ad = ad;
		this.soyad = soyad;
		this.vize = vize;
		this.fin = fin;
		
		// yukarı yerin ismi constructor dır
		
		ortalama = vize*0.4 + fin*0.6;
		
		if (ortalama>=50) {
			durum ="gectiniz:)";
		}else {
		    durum = "kaldınız :(";
		}
		
		next = null;
		
		
		
	}
	
	
	
	
	
	

}
