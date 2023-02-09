package agac2;

public class uygulama {

	public static void main(String[] args) {
		
		tree bst = new tree();
		
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 5);
		bst.root=bst.insert(bst.root, 12);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 9);
		bst.root=bst.insert(bst.root, 30);


		System.out.print("preorder : ");
         bst.preOrder(bst.root);
         System.out.println();
         System.out.print("inorder : ");
         bst.inOrder(bst.root);
         System.out.println();
         System.out.print("postorder : ");
         bst.postOrder(bst.root);
		System.out.println("\nagac uzerindeki eleman sayisi "+ bst.size(bst.root));
         
         System.out.println("\n\nagacin yuksekligi : "+ bst.height(bst.root) );
		/* 
		System.out.println("kok : "+bst.root.data);
		System.out.println("kokun solu : "+bst.root.left.data);
		System.out.println("kokun sagi : "+bst.root.right.data);*/
	}

}
