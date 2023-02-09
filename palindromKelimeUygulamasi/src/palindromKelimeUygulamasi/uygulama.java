package palindromKelimeUygulamasi;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		stackYapisi st= new stackYapisi(100);
		QueueYapisi qu = new QueueYapisi(100);
		String kelime;
		System.out.println("kelime giriniz : "); 
		kelime=scanner.nextLine();
		int n = kelime.length();
		
		char [] harfler = kelime.toCharArray();
		int i=0;
		while(i<n) {
		
			st.push(harfler[i]);
			qu.enQueue(harfler[i]);
			i++;
		}
		boolean sonuc = true;
		while(!st.bosMu()) {
			if(st.pop()!= qu.deQueue()) {
				sonuc=false;


				break;
				
			}	
		}
		if(sonuc) {
			System.out.println(kelime+ " palindromdur");
		}else {
			System.out.println(kelime+ " palindrom degildir");

		}
	}

}
