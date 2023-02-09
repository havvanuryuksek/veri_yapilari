package ders6;

import java.util.Scanner;

public class bagliListe {
	Scanner scanner = new Scanner(System.in);
	node head= null ;
	node son= null;
	
	void basaEkle()
	{
		int data;
		System.out.println("data : ");
		data= scanner.nextInt();
		node eleman = new node(data);
		
		if(head==null) {
			head=eleman;
			son=eleman;
			son.next=head;
			//System.out.print("bas->");

			
		}else {
		
			eleman.next=head;
			head=eleman;
			son.next=head; //unutma dairesel
			
		}
		
	}
void sonaEkle() {
	
	int data;
	System.out.println("data :");
	data = scanner.nextInt();
	node eleman = new node(data);
	
	if (head == null) {
		
		head=eleman;
		son=eleman;
		son.next=head;
	}else 
	{
		son.next = eleman;
		son=eleman;
		eleman.next=head;
		//System.out.print("bas->");
	}
	
	
}
	void arayaEkle() {
		
		int data, indis;
		
		System.out.println("indis : ");
		indis=scanner.nextInt();
		System.out.println("data : ");
		data= scanner.nextInt();
		
		node eleman = new node(data);
		
		if(head==null)
		{
			head=eleman;
			son=eleman;
			son.next= head;
		}else if(indis==0)
		{
			eleman.next=head;
			head=eleman;
			son.next=head;
		}else 
		{
			int n = 0;
			node temp = head;
			node temp2=head;
			while(temp!=son)
			{
				temp=temp.next;
				n++;
			}
			n++; // 1 tane daha arttırıp kaç eleman olduğunu buluyoruz
		
		 
		if(indis>=(n)) {
			
			son.next=eleman;
			son=eleman;
			son.next=head;
		}else
		{
			temp = head;
			temp2=temp;
			int i= 0;
			while(i< indis) {
				
				i++;
				temp2=temp;
				temp=temp.next;
			}
			
			temp2.next= eleman;
			eleman.next= temp;
		}
		}	
	}
	void bastanSil()
	{
		if(head==null)
			System.out.println("liste boş");
		else if (head==son ){
			head=null;
			son=null;
		}else {
			head=head.next;
			son.next=head;
		}
	}
	void sondanSil()
	{
		if(head==null)
			System.out.println("liste boş");
		else if (head==son ){
			head=null;
			son=null;
		}else {
			node temp= head;
			while(temp.next!=son) {
				
				temp = temp.next;
				
				
			}
			son=temp;
			son.next=head; 
		}
	}
	void aradanSil()
	{
		if(head==null)
			System.out.println("liste boş");
		else if (head==son ){
			head=null;
			son=null;
		}else {
			int indis,n = 0;
			System.out.print("indis : ");
		    indis= scanner.nextInt();
		    scanner.nextLine();
		    
			node temp=head;
			node temp2=temp;
			
			while(temp.next!=son) {
				// önce düğüm sayisini bulalım
				temp=temp.next;
				n++;
				
			}
			n++;
			temp = head; 
			
			int i=0;
			while(i <indis) {
				temp2 = temp;
				temp = temp.next;
				i++;
			}
			temp2.next=temp.next;
		}
		
	}
	
	 void yazdir() {
		
		if(head==null)
			System.out.print("liste bos");
		else {
			node temp=head;
			System.out.println("bas ->");
			while( temp!=son)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data+"-> son -> bas ");
		}
	}
}






