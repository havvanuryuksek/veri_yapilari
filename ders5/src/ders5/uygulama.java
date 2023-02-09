package ders5;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		bagliListe bl =new bagliListe();
		
		int secim = -1, sayi, indis;
		
		while(secim !=0) {
			System.out.println("1- basa Ekle");
			System.out.println("2- sona Ekle");
			System.out.println("3- araya Ekle");
			System.out.println("4- bastan sil");
			System.out.println("5- sondan sil");
         	System.out.println("6- aradan sil");
         	System.out.println("7- sondan basa yazdir");


			System.out.println("0- cikis");
			System.out.println("seciminiz : ");
            secim= scanner.nextInt();
            
           if(secim == 1)
            
           {
        	   
        	   System.out.println("sayi : ");
        	   sayi = scanner.nextInt();
        	   bl.basaEkle(sayi);
           }else if(secim==2) {
        	   System.out.println("sayi : ");
        	   sayi = scanner.nextInt();
        	   bl.sonaEkle(sayi);
        	 
           }else if(secim==3) {
        	   
        	   System.out.println("indis");
        	   indis = scanner.nextInt();
        	   
        	   System.out.println("sayi");
        	   sayi = scanner.nextInt();
        	   
        	   
        	   bl.arayaEkle(indis , sayi);
        	   
           } else if(secim == 4) {
        	   
        	   bl.bastanSil();
        	   
           }else if(secim==5){
        	   
        	   bl.sondanSil();
           }
           
           else if(secim==6){
        	   
        	   System.out.println("indis : ");
        	   indis = scanner.nextInt();
        	   bl.aradanSil(indis);
        	   
           }
           
           else if(secim==7) {
        	   bl.sondanYazdir();
           }
           
            
    	   bl.yazdir();

			
			
		}
		
		
		
	
		
		
		
	}

}
