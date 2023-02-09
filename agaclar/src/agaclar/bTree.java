package agaclar;

public class bTree {
	node root;
	public bTree() {
		root=null;
	}
	node newNode(int data) { //fonks oluşturduk
		
		root= new node(data);
		System.out.println(data+ " agaca eklendi ");
		return root;
	
	}
	node insert (node root, int data) {
		if (root!=null) {
			if(data<root.data) {
				root.left =insert(root.left,data);	
			}else {
				root.right = insert (root.right,data);
			}
			
		}else {
			root= newNode(data);
		
		}
		return root;
	}

}