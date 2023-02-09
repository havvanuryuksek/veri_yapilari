package ders10;

public class uygulama {

	public static void main(String[] args) {

		queueYapisi kuyruk = new queueYapisi(5);
		
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
        kuyruk.deQueue();
	

	    kuyruk.elemanSayisi();
	    kuyruk.yazdir();
	System.out.println("kuyrugun basindaki eleman: "+kuyruk.dizi[kuyruk.front]);
	System.out.println("kuyrugun basindaki eleman: "+kuyruk.dizi[kuyruk.rear]);

	}

}
