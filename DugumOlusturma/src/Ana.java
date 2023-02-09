
 public class Ana {
	
     public static void main (String [] args) {
    	 
    	 Sinif A = new Sinif(); // bellekte düğüm oluşturduk bellekte yer ayırma

    	 Sinif B = new Sinif();
    	 
    	 Sinif C = new Sinif();
    	 
	A.sayi = 11; // düğümlere değerlerini atıyoruz
	B.sayi = 22;
	C.sayi = 33;
	
  A.next = B; // düğümleri birbirine bağladık
  B.next = C;
  C.next = null;
  
  Sinif temp = A; // gezici değişken
  
  while(temp  !=  null) { // travers yani düğümlerin üzerinde dolaştık
	  System.out.println(temp.sayi);
	  temp= temp.next;
  }
	
}
}
