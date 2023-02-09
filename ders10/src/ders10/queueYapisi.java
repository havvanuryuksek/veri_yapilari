 package ders10;

public class queueYapisi {
	int []dizi;
	int size; // kapasitesi
	int front; // dizinin baştaki elemanını tutuar
	int rear; // dizinin sondaki elemanını tutar
	
	public queueYapisi (int size) {
		this.size=size;
		 dizi= new int[size]; //kuyruk yapımız
		 front=0;
		 rear = -1;
		 
	}
	
	void enQueue (int data)
	{
		if(doluMu()) {System.out.println("kuyruk dolu, ekleme yapamazsiniz");
			
		}else {
			rear++;
			dizi[rear] = data;
			System.out.println(dizi[rear]+ "kuyruga eklendi ");
		}
		
	}
	void deQueue () {
    	 if(bosMu()) {
    		System.out.println("kuyruk bosi silinecek eleman yok"); 
    	 }else {
    	 int sayi = dizi[front];
    	 for(int i=1; i<=rear; i++) {
    		 dizi[i-1]= dizi[i]; // frontu dizinin 1. elemanı olarak güncelledik artık
    //kayma oldu yani		 
    		 }
    	 rear--;
    	 System.out.println(sayi+"kuyruktan cikartildi");
    	 }
     }

    boolean doluMu() {
		return rear == size -1; //size eleman sayısı rear da sıfır yasize ın 1 eksiği olunca boş olur
	}

     boolean bosMu() {
    	 return rear==-1;
     }
     
    void elemanSayisi() {

    System.out.println("eleman saysisi : "+ (rear+1)); //çünkü rear 0dan baslyor ya
    }
    void yazdir() {
    	int i=rear;
    	System.out.print("son ->");
    	while(i>=0) //reardan foronta kadar
    	{
    		System.out.print(dizi[i]+ " ->");
    		i--; 
    	}
    	System.out.println("bas");
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

