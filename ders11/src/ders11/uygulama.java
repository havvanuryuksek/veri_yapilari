package ders11;

public class uygulama {

	public static void main(String[] args) {

		kuyrukYapisi kuyruk = new kuyrukYapisi(5);
		
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(52);
		kuyruk.enQueue(40);
		kuyruk.enQueue(96);


		kuyruk.deQueue();
		kuyruk.deQueue();

		System.out.println("kuyruktaki eleman sayisi : "+kuyruk.cnt);
		System.out.println("kuyrugun basindaki eleman : "+ kuyruk.front.data);
		System.out.println("kuyrugun sonundaki eleman : "+ kuyruk.rear.data);

		kuyruk.yazdir();
	}

}
