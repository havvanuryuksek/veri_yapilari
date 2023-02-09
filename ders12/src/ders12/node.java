package ders12;

public class node {
	int key;
	String isim;
	node next;
    public node() {
    	next = null;
    	
    }
	public node(int key, String isim) {
		
		this.key = key; // kullanıcıdan almak zorunda olduğumuz şeyler
		this.isim = isim;
		next=null;
	}

}
