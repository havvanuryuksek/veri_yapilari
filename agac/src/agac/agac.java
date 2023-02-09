package agac;

public class agac {

	dugum kok;
	
	
	public agac()
	{
		kok=null;
	}
	
	void ekle(int icerik) {
		dugum yeni= new dugum(icerik);
		dugum tmp=kok;
		dugum tmp2=null;
		if(kok==null) {
			kok=yeni;	return;
		}else {
			tmp=tmp.sag;
			if()
		}
	}
}
//REKÜRSİF FONKSİYONDA BİR TANE ÇIKMA ŞARTI KOYMAZSAN SONSUZA KADAR GİDER