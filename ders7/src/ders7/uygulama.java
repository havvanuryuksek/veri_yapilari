package ders7;

import java.util.Scanner;

public class uygulama {
	public static void main(String[] args) { // çift yönlü dairesel bağli liste
		
		Scanner scanner = new Scanner(System.in);
		
		bagliListe liste= new bagliListe();
		int secim=-1;
		while(secim != 0) {
			
			System.out.println("1- basa ekle");
			System.out.println("2- sona ekle");
			System.out.println("3- araya ekle");
			System.out.println("4- bastan sil");
			System.out.println("5- sondan sil");
			System.out.println("6- aradan sil");
            System.out.println("7- tersten yazdir");
			System.out.println("0- cikis");
			System.out.println("seciminiz:");
			secim= scanner.nextInt();
			

			switch (secim)
			{
			case 1 : liste.basaekle(); break;
			case 2 : liste.sonaEkle(); break;
			case 4 : liste.bastanSil(); break;
			case 5 : liste.sondanSil(); break;
			case 6 : liste.aradanSil(); break;
			case 7 : liste.terstenYazdir(); break;
			case 0 : System.out.println("cikis yaptiniz"); break;
			default : System.out.println("hatali secim [0-4]"); break;

			}
			
			liste.yazdir();
		}
		
		
		
	}

}
