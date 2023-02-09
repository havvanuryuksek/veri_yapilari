package ders13;


public class node {
	int key;
	String isim;
	node next;
    public node() {
    	next = null; // dizi içini gösterisini null yaptık
    	
    }
	public node(int key, String isim) {
		
		this.key = key; // kullanıcıdan almak zorunda olduğumuz şeyler
		this.isim = isim;
		next=null;
	}

}
