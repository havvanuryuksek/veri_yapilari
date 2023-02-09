package agaclar;

public class uygulama {

	public static void main(String[] args) {
		
		bTree bt = new bTree();
		
		bt.root=bt.insert(bt.root, 10); // insert ün geri dönüş değeir old için hep rootta tutucaz
		bt.root =bt.insert(bt.root, 15);
		bt.root =bt.insert(bt.root, 8);
		bt.root =bt.insert(bt.root, 20);
		bt.root =bt.insert(bt.root, 4);
		bt.root =bt.insert(bt.root, 12);

		System.out.println("kokun datasi : "+bt.root.data);
		System.out.println("kokun sagindaki datasi : "+bt.root.right.data);
		System.out.println("kokun solundaki datasi : "+bt.root.left.data);
		System.out.println("kokun solunun solunun datasi : "+bt.root.left.left.data);
		System.out.println("kokun saginin sagi datasi : "+bt.root.right.right.data);
		System.out.println("kokun saginin solu datasi : "+bt.root.right.left.data);

		
		
		
		
	}

}
