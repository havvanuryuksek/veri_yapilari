package ders9;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("stack yapisina kac eleman girmek istersiniz");
    int n= scanner.nextInt();
    
		stackYapisi liste = new stackYapisi(n);
      int secim =-1, sayi;
      while(secim!=0) {
    	  System.out.println("1- ekle");
    	  System.out.println("2- cikar");
    	  System.out.println("3- en usttekini goster");
    	  System.out.println("4- yazdir");
    	  System.out.println("0- cikis");
    	  System.out.print("seciminiz : ");
    	  secim= scanner.nextInt();
    	switch (secim)
    	{
    	case 1 : System.out.println("sayi : ");
    	   sayi=scanner.nextInt();
    	   liste.push(sayi);
    	        break;
    	case 2 :   liste.pop();break;
    	case 3 :   liste.topGoster(); break;
    	case 4 :   liste.yazdir(); break;
    	case 0 :   System.out.println("cikis yaptiniz ");
    	default:   System.out.println("hatali secim yaptiniz: [0-4]");
    	
    	}
      }
    

	}

}
