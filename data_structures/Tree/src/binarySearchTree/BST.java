/*
		BinarySearchTree  O(H)  H - height Of the Tree.
		
		Build: 
			BST follows the following Conditions
			1. Left SubTree will be smaller than the Root
			2. Right SubTree will be Greater than the Root
			3. At any given point the current Node must follow the above two rules
			
			4. BST contains only unique values(Duplicates are not allowed)
			5. BST with inOrder traversal will give the values in the increment order.
			
		Types:
			1. Balanced 
			   * (height = log(N)  where N - no of nodes)
			   * Nodes are balanced on both the sides
			   
											4
									2				5	
								1		3				6
								
								
			2. Skewed 
			   * (height = N)
			   * Nodes are linear in only one direction
			
											1
												2
													3
														4
 */


package binarySearchTree;

import java.util.ArrayList;

public class BST 
{
//	inner class Node will store the data, left and  right 
	static class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
/**
 		insert will get the data and create binary search tree
		approach :
			data less than data stored in root lies on the left side of the root
			if data is greater it will lie on the right side of the root
 */
	
	public static Node insert(Node root, int data)
	{
//		if tree does not have any node, Tree is empty 
		if (root == null)
		{
//			create a new node with the data and send it back as root
			root = new Node(data);
			return root;
		}
		
//		if root already exists
//		it will compare the data with current root data and than decide which side to traverse
		
		if(data < root.data)
		{
			root.left = insert(root.left, data);
		}
		
		else
		{
			root.right = insert(root.right, data);
		}
		
		return root;
	}
	
//	BST is traversed with inOrder, where output will always be sorted in increasing order
	public static void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static boolean search(Node root, int key)
	{
		if(root == null)
		{
			return false;
		}

		if(root.data == key)
		{
			return true;
		}
		
		
		if(key < root.data)
		{
			return search (root.left, key);
		}
		else
		{
			return search (root.right, key);
		}
		
	}
	
//	delete a specific Node in the BST
	public static Node delete(Node root, int data)
	{
		if(data < root.data)
		{
			 root.left = delete(root.left, data);
		}
		else if(data > root.data)
		{
			root.right = delete(root.right, data);
		}
		else
		{
//			data == root.data
			
//			when root is leaf node
			if(root.left == null && root.right == null)
			{
				return null;
			}
			
//			when root having only one child
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			
//			when root having both left and right child. 
//			in this case we can remove this node by replacing it with next node in inOrder succession
			
//			inOrder successor : leftMost node in the Right subtree
			
			Node successor = successor(root.right);
			
			root.data = successor.data;
			root.right = delete(root.right, successor.data);	
		}
		return root;
		 
	}
	
	public static Node successor(Node root)
	{
		while(root.left != null)
		{
			root = root.left;
		}
		
		return root;
	}
	
	public static void printInRange(Node root, int from , int to)
	{
		if(root == null)
		{
			return;
		}
		if(from <= root.data && root.data <= to)
		{
			printInRange(root.left, from, to);
			System.out.print(root.data + " ");
			printInRange(root.right, from, to);
		}
		else if(to < root.data)
		{
			printInRange(root.left, from, to);
		}
		else if(from > root.data)
		{
			printInRange(root.right, from, to);
		}
	}
	
//		path from root to leaf Node
	public static void printPath(Node root, ArrayList<Integer> path)
	{
		if(root == null)
		{
			return;
		}

		path.add(root.data);
		
		if(root.left == null && root.right == null)
		{
			System.out.println(path );
			System.out.println();
		}
		else
		{
			printPath(root.left, path);
			printPath(root.right, path);			
		}
		
		path.remove(path.size() - 1);
	}
	
	public static void main(String[] args) 
	{
		int[] data = {5, 1, 3, 6, 4, 2, 7};
		
		Node root = null;
		
		for (int i : data)
		{
			root = insert(root, i);
		}
		
		
//		System.out.println(root.data);
//		inOrder(root);
		
//		System.out.println(search(root, 10));
		
//		Node root1 = delete(root, 3);
//		inOrder(root1);
		
//		printInRange(root, 3, 6);
		
		printPath(root, new ArrayList<Integer>());
	}
}
