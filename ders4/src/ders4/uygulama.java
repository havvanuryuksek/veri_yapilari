package ders4;

import java.util.Scanner;

public class uygulama {


	public static void main(String[] args) {

		TekYonluListeYapisi tyList = new TekYonluListeYapisi();
		int secim=1;
		
		Scanner scanner = new Scanner(System.in);
		 
		int sayi, indis;
		
		while(secim!=0) {
			
			System.out.println("1 basa ekle");
			System.out.println("2 sona ekle");
			System.out.println("3 araya ekle");
			System.out.println("4 bastan sil");
			System.out.println("5 sondan sil");
			System.out.println("6 aradan sil");
			System.out.println("0 cikis");
			System.out.println("seciminiz : ");
			
			secim = scanner.nextInt();

		 if( secim== 1) {
			System.out.println("sayi : ");
			sayi= scanner.nextInt();
			tyList.basaEkle(sayi); 
		}else if(secim==2) {
			
			System.out.println("sayi : ");
			sayi= scanner.nextInt();
			tyList.sonaEkle(sayi); 	
			
		}else if(secim==3) {
			
			System.out.println("sayi : ");
			sayi= scanner.nextInt();
			System.out.println("indis : ");
			indis= scanner.nextInt();
			tyList.arayaEkle(indis, sayi);
			
		}else if(secim==4) {
			
			tyList.bastanSil(); 	
			
		}else if(secim==5){
			
			tyList.sondanSil();
		}else if(secim==6){
			System.out.println("indis : ");
			indis=scanner.nextInt();
			
			tyList.aradanSil(indis); // hemen hemen hepsinde neyi silecğimizi parametre olarak göndrdik
			
		}else if(secim==0) {
			System.out.println("program sonlandirildi .........");
		}else {
			
			System.out.println("hatali secim yaptiniz ");
		}
		 tyList.yazdır();
		
	}
		}
 
	
}
