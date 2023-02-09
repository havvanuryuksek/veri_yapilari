package ogrenci_kayit_uygulamasi;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		
		int secim = -1;
		ogrListe bilBolum = new ogrListe(); // liste yapisini nesne olarak oluşturuduk
		
	Scanner scanner = new Scanner(System.in);
		
		while(secim!=0) {
			System.out.println();
			System.out.println("bilgisayar bolumu ogrenci kayit uygulamasi");
			System.out.println("1 - yeni kayit");
			System.out.println("2 - kayit sil");
			System.out.println("3 - kayitlar listele");
			System.out.println("4 - en basarili ogrenci bilgileri");
			System.out.println("0 - cikis");
			System.out.println("seciminiz : ");
			
			secim = scanner.nextInt();
			
			if(secim == 1)
				   bilBolum.ekle();
		    else if (secim == 2)
						bilBolum.sil();
			else if (secim == 3)
						bilBolum.yazdir();
			else if (secim == 4)
						bilBolum.enBasariliOgrenci();
		    else if (secim == 0)
						
					System.out.println("programi sonlandirdiniz .....");
			else 
					System.out.println("hatali secim yaptiniz [0-4]");
		}
	}

}
