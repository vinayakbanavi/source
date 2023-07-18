/*
 			Tree is a Hierarchical Data Structure. 
 			Where as Stack, Queue, List are Linear Data Structures.
 			
 			
 			Components of a General Tree (Upside Down of a Physical tree)
 				1. Root
 				2. Branches
 				3. Leaf (end Node)
 				
 			Binary Tree - is a form of the tree which will be having only max Two subBranches for each branch
 			
 							             Normal tree																BinaryTree
 																														
 								             1                                                                               1
 						2      |      3      |    4             5                                                    2       |          5
 					6	7	8  |  9	 10	 11  | 12    13  | 14   15   16                                           3  |  4         6     |     7
 					                                                                                           8  |  null      9  |  null
 					                                                                                           
 			BasicTerms Of Binary Tree
	 			1. parent Node
	 			2. leftChild
	 			3. rightChild
	 			4. sibling Node - nodes having same parent Node
	 			5. ancestors
	 			6. leaf - nodes with no offspring/ end Node
	 			7. levels   (B)
	 			8. subTree (left and right)
 			
 			
 			Types of Traversing a Tree
 				1. preOrder 
 				2. inOrder          --> we can implement the code using recursion
 				3. postOrder
 				
 				4. levelOrder       --> implementing using iteration
 			
 */

package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree 
{
	Tree()
	{
		
	}
	
	Tree(int[] preOrder)
	{
		buildTree(preOrder);
	}
	
	private Node root;
	
	class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}

	private int index = -1;
	
	public Node buildTree(int[] preOrder)  // 1 2 3 -1 -1 4 -1 -1 5 6 -1 -1 7 -1 -1
	{
		index++;
		
		if(preOrder[index] == -1 || index == preOrder.length)
		{
			return null;
		}
		
		Node newNode = new Node(preOrder[index]);
		newNode.left  = buildTree(preOrder);
		newNode.right = buildTree(preOrder);
		
		root = newNode;
		return root;
	}
	
	public Node root()
	{
		return root;
	}
	
//	Order of traversing : Root, leftSubTree, rightSubTree
	public void preOrderTraverse(Node root)
	{
		if(root == null)
		{
			System.out.print(-1 + " ");
			return;
		}
		
		System.out.print(root.data + " ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
//	Order of traversing : leftSubTree, root , rightSubTree
	public void inOrderTraverse(Node root)
	{
		if(root == null)
		{
//			System.out.println(-1);
			return;
		}
		
		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);		
	}
	
//	Order of traversing : leftSubTree, rightSubTree, root
	public void postOrderTraverse(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.data + " ");
	}
	
//	traverse level wise
//	will implements level order traverse using iterative method
	public void levelOrderTraverse(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		Queue<Node> q = new LinkedList();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Node currNode = q.remove();
			if(currNode == null)
			{
				System.out.println();
				
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				System.out.print(currNode.data + " ");
				
				if(currNode.left != null)
				{
					q.add(currNode.left);
				}
				if(currNode.right != null)
				{
					q.add(currNode.right);
				}
			}
		}
		
	}
	public int count(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int leftCount = count(root.left);
		int rightCount = count(root.right);
		
		return leftCount + rightCount  + 1;
	}
	
	public int sum(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		
		return leftSum + rightSum + root.data;
	}
	
//	total height of tree
	public int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
//	Diameter of a tree (Max Number of nodes in between two nodes )
//	possible cases
//		1. diameter passing through root
//		2. diameter not passing through root
	
//	1st approach Time Complexity : O(n^2) Quadratic time
	public int diameter(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftDia = diameter(root.left);
		int rightDia = diameter(root.right);
		
		int endtoendDia = height(root.left) + height(root.right) + 1;
		
		return Math.max(Math.max(leftDia, rightDia), endtoendDia);
	}
	
//	2nd approach with Time Complexity : O(n) linear time
	
//	class TreeInfo will store each nodes current height and diameter 
	
	class TreeInfo
	{
		 int height;
		 int dia;
		
		TreeInfo(int height,int dia)
		{
			this.height = height;
			this.dia = dia;
		}
	}
	
	public TreeInfo treeDia(Node root)
	{
		if(root == null)
		{
			return new TreeInfo(0,0);
		}
		
		TreeInfo left = treeDia(root.left);
		TreeInfo right = treeDia(root.left);
		
		int currHeight = Math.max(left.height, right.height) + 1;
		
		int leftDia = left.dia;
		int rightDia = right.dia;
		int endtoendDia = left.height + right.height + 1;
		
		int currDia = Math.max(Math.max(leftDia, rightDia), endtoendDia);
		return new TreeInfo(currHeight, currDia);
	}
	
//	check whether Subtree of another tree (Given Two root Nodes of two trees)
	public boolean subTree(Node mainRoot, Node subRoot)
	{	
		if(subRoot == null)
		{
			return true;
		}
		
		if(mainRoot == null)
		{
			return false;
		}
		
		if(mainRoot.data == subRoot.data)
		{ 
//			boolean b1 = subTree(mainRoot.left, subRoot.left);
//			boolean b2 = subTree(mainRoot.right, subRoot.right);
//			return b1 == true && b2 == true;
			
	    	return isIdentical(mainRoot, subRoot);
			
		}
	
		return subTree(mainRoot.left, subRoot) || subTree(mainRoot.right, subRoot);
		
	}
	
	public boolean isIdentical(Node mainRoot, Node subRoot)
	{
		if(mainRoot == null && subRoot == null)
		{
			return true;
		}
		
		if(mainRoot == null || subRoot == null)
		{
			return false;
		}
		
		if(mainRoot.data == subRoot.data)
		{
			return isIdentical(mainRoot.left, subRoot.left) && isIdentical(mainRoot.right, subRoot.right);
		}
		
		return false;
	}
} 

