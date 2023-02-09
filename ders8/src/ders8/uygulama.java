package ders8;

public class uygulama {

	public static void main(String[] args) {
    stackYigin stack = new stackYigin(5);
    
    
    stack.push(1);
    stack.push(9);
    stack.push(81);
    stack.push(15);
    stack.push(16);

    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
    System.out.println("cıkan : "+stack.pop());
   
    



    
	}

}
