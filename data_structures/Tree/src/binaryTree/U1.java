package binaryTree;

public class U1 
{	
	public static void main(String[] args) 
	{
		int[] preOrder = {1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, 7, -1, -1};
		Tree tree = new Tree();
		tree.buildTree(preOrder);
		
//		System.out.println(((Tree.Node)obj).data);
		
//		tree.preOrderTraverse(tree.root());
//		tree.inOrderTraverse(tree.root());
//		tree.postOrderTraverse(tree.root());
		
		
//		tree.levelOrderTraverse(tree.root());
		
//		System.out.println(tree.count(tree.root()));
//		System.out.println(tree.sum(tree.root()));
//		
//		System.out.println(tree.height(tree.root()));
		
//		System.out.println(tree.diameter(tree.root()));
		
//		System.out.println(tree.treeDia(tree.root()).dia);
		
		int[] preOrder1 = {5, 6, -1, -1, 7, -1, -1};
		Tree tree1 = new Tree();
		tree1.buildTree(preOrder1);
		
		System.out.println(tree1.subTree(tree.root(), tree1.root()));
		
	}
}
