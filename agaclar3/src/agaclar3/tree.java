package agaclar3;

public class tree {
	
	node root;

	public tree() {
     root = null;	}
	node newnode(int x) {
		
		root = new node(x);
		return root;
		
	}
	node insert (node root,int x) {
	 if(root!=null) {
		if(x<root.data) 
			root.left = insert(root.left,x);
			
		else
		root.right = insert(root.right,x);
		
			
		
	}else
		root=newnode(x);
	 return root;
}
	
	void inOrder(node root)
	{
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+ "    ");
			inOrder(root.right);
		}
		
	}
	
	node delete(node root, int x) {
		node t1,t2;
		if(root==null)
			return null;
		if(root.data==x)
		{
			if(root.left==root.right) {//yani diyorki tek kök
			
			root=null;
			return null;
		
			}
			else if(root.left==null) {
				
				t1=root.right;
				return t1;
			}
			else if(root.right==null) {
				t1=root.left;
				return t1;
			}
			else { // her iki kolunda da çocuk varsa
				t1=t2=root.right;
				while(t1.left!=null) {
					t1=t1.left;
				}
				t1.left=root.left;
				return t2;
				
			}
		}
		else {
			if(x<root.data) {
				root.left= delete(root.left, x);
				
			}else {
				root.right=delete(root.right,x);
				
			}
			return root;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
