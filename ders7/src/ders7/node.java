package ders7;

public class node {
	int data;
    node ileri;
    node geri;
    
    public node(int data) {
    	this.data = data;
    	ileri=null;
    	geri=null;
    }
}
