package agac2;

	public class tree {
		
	node root;
	public tree() {
		root=null;
	}
	node newNode(int data) {
		 root = new node(data);
		 return root;
	}
	
	node insert (node root, int data) {
		
		if(root!=null) {
			if(data<root.data) {
				root.left=insert(root.left,data);
				
			}else {
				root.right=insert(root.right, data);
			}
			
				}
		else {
			root=newNode(data);
			
		}
		return root;
	}
	
	void preOrder(node root){
		if(root!=null) {
			
		
		System.out.print(root.data + "   ");
		preOrder(root.left);
		preOrder(root.right);
		}
		
	}
	void inOrder(node root){
		if(root!=null) {
			
		
		inOrder(root.left);
		System.out.print(root.data + "   ");
		inOrder(root.right);
		}
		
	}
	void postOrder(node root){
		if(root!=null) {
			
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + "   ");

		}
		
	}
	
	int height(node root) {
		if(root==null)
			return -1; //kökü 0 aldık yani ama istersen 1 olsun return=0 yap
		
		else {
			int sol=0,sag=0; //rekürsif şekilde yapmaıyor
			//geri dönüş amntığıyla gidicez
			sol=height (root.left);
			sag=height(root.right);
			if(sol>sag)
				return sol+1;
			else
				return sag+1;
		}
	}
	
	
	int size(node root) {
		if(root==null)
			return 0;
		else {
			return size(root.left)+ 1 +size(root.right);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
