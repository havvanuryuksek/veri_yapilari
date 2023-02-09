package ders7;

import java.util.Scanner;

public class bagliListe {
 Scanner scanner = new Scanner(System.in);
    node temp=null;
    node temp2=null;
    node bas = null;
	node son = null;
	int data;
	int indis;
	
	void basaekle() 
	{
		System.out.println("data : ");
		data=scanner.nextInt();
		
		node eleman = new node(data);
		
		if(bas==null) {
			
			bas=eleman;
			son = eleman;
			bas.ileri=son;
			son.geri=bas;
			bas.geri= son;
			son.ileri=bas;
		}
		else
		{
			eleman.ileri=bas;
			bas.geri=eleman;
			bas=eleman;
			son.ileri=bas;
			bas.geri=son;
		}
		
	}
	void sonaEkle() {
		System.out.println("data : ");
		data=scanner.nextInt();
		node eleman = new node(data);
		
		if(bas==null) {
			
			bas=eleman;
			son = eleman;
			bas.ileri=son;
			son.geri=bas;
			bas.geri= son;
			son.ileri=bas;
		}else {
			son.ileri=eleman;
			eleman.geri=son;
			son=eleman;
			son.ileri=bas;
			bas.geri=son;
		}
	}
		
		void arayaekle() 
		{
			System.out.println("data : ");
			data=scanner.nextInt();
			System.out.println("indis : ");
			indis=scanner.nextInt();
			
			
			node eleman = new node(data);
			
			if(bas==null) {
				
				bas=eleman;
				son = eleman;
				bas.ileri=son;
				son.geri=bas;
				bas.geri= son;
				son.ileri=bas;
			}
			else if( indis==0) //kullanıcı 0 girerse basa ekleme
			{
				eleman.ileri=bas;
				bas.geri=eleman;
				bas=eleman;
			} 
			else 
			{
			temp=bas;
			temp2=temp;
			int n=0; //eleman sayısını sayacak
			while( temp!=null) {
				n++;
				temp = temp.ileri;
			
			}
			temp=bas;
			
			int i=0;
			while( i<indis ) //yani kullanıcıdan aldığım indise kadar git
			{
				temp2=temp;
				temp = temp.ileri; // temp indisinci değerde olur temp2 de bir öncekinde
				i++;
			}
			if( n < indis )
			{ // eklemek istediğimiz son düğüm olabilir
			
		        son.ileri=eleman;
		        eleman.geri=son;
		        son=eleman;
		        son.ileri=bas;
		        bas.geri=son;
			}
			else {
				
				temp2.ileri=eleman;
				eleman.geri=temp2;
				eleman.ileri=temp;
				temp.geri=eleman;
		}		
	}
	}
		void bastanSil() {
			
			if(bas==null) {
				System.out.println("liste bos");
			}else if(bas==son) {
				bas=null;
				son=null;
			}else {
				bas=bas.ileri;
				bas.geri=son;
				son.ileri=bas;
			}
		}
		void sondanSil() {
			if(bas==null) {
				System.out.println("liste bos");
			}else if(bas==null) {
				bas=null;
				son=null;
				
			}else {
				// önceki düğümü tutmamız gerek,yor sondan silebilmek için
				temp = bas;
				while(temp.ileri!= son) {
					
					temp=temp.ileri;
				}
				//artık burada güncelleme yapıyoruz
				son=temp;
				son.ileri=bas;
				bas.geri=son;
			}
		}
		void aradanSil() {
			if(bas==null) {
				System.out.println("liste bos");
			}else {
				 System.out.println("indis : ");
				 indis=scanner.nextInt();
			
				 if(indis == 0 && bas == son) { // yani listede tek eleman var ve kullanıcı da onu silmek istiyor
					 bas=null;
					 son=null;
				 }else if(indis==0 && bas!=son) { // yani listede birden fazla eleman var ama biz başı silecez
					 bas=bas.ileri;
					 bas.geri=son;
					 son.ileri=bas;
				 }else {
					 int n = 0;
					 temp=bas;
					  while(temp!=son){
						 
						 n++;
						 temp=temp.ileri; // temp son olduğunda çık döngüden ve yani kullanıcı son düğümü silmek istiyo
						 
					 }if (indis >= n) {
						 son=temp;
						 son.ileri=bas;
						 bas.geri=son;
						 
					 }else {
						 temp=bas;
						 temp2=temp;
						 int i=0;
						 while(i<indis) {
							 
							 i++;
							 temp2 = temp;
							 temp = temp.ileri;
							 
						 }
						 temp2.ileri=temp.ileri;
						 temp.ileri.geri = temp2; // yani tempten sonra gelen düğümün bir öncesinede temp2 yi ata
						 }
				 }
			} }
		
		void yazdir() {
			if( bas==null) {
				System.out.println("liste bos");
			}
			else {
			temp= bas;
			System.out.print("bas ->");
			while(temp!=son) {
				System.out.print(temp.data + "->");
				temp=temp.ileri;
			}
			System.out.println(temp.data + "-> son.");

			}
				
		}
		void terstenYazdir() {
			if( bas==null) {
				System.out.println("liste bos");
			}
			else {
			temp= son;
			System.out.println("son ->");
			while(temp!=bas) {
				System.out.println(temp.data + "->");
				temp=temp.geri;
			}
			System.out.println(temp.data + "-> bas.");

			}
				
		}


}




















