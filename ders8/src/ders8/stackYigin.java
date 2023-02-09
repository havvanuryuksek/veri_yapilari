package ders8;

public class stackYigin {
	int dizi[]; //dizi oluşturuyoruz ,stack
    int size; //kullanıcıdan alma dizi boyutunu
    int indis;
    
    public stackYigin(int size) {
    	this.size= size;
    	dizi = new int [size];
    	indis=-1;
    }
    void push(int data) { // ekle
    	if(doluMu())
    	{
    		System.out.println("stack dolu!");
    	}else {
    	indis++;
    	dizi[indis] = data;
    	System.out.println("eklenen : "+dizi[indis]);
    	} 
    	}
    int pop() { // cıkar
    	if( !bosMu()) {
        	return dizi[indis--]; // yani dizinin indisini 1 eksilt ve geriye döndür
    	}else {
    		System.out.println("dizi bos ! ");
    		return -1; // hatayı kapatmak için -1 dönderdik
    	} 
    	}
    
    boolean doluMu() {
    	return(indis==size-1); // çünkü kullanıcıdan 5 alırsak indis 4 e kadar gitiği için size-1 aldık
    }
    boolean bosMu() { //isEmpty
    	return (indis == -1); /* şöylede yazılabilir bu kod
    	                          if(indis==-1)
    	                          return true;
    	                          else
    	                          return false;    */
    	
    }
}
