package ds.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	Node root;
	
	public static void main(String[] args) {
		int [] nodes = {5,1,2,-1,-1,4,3,-1,-1,6,-1,-1,7};
		BinaryTree mytree = BinaryTree.addAll(nodes);
		Node root = mytree.root;
//		mytree.preOrder(root);
//		System.out.println();
//		mytree.postOrder(root);
//		System.out.println();
		mytree.inOrder(root);
		System.out.println("  *****    ");
		
		BinaryTree t2 = new BinaryTree();
//		t2.root = t2.createTreeFromUser("tree-input.txt");
		t2.root = createTreeFromUser();
		t2.inOrder(t2.root);
		
		System.out.println("-- level order --");
		t2.levelOrderln(t2.root);
		

//		System.out.println(String.format("node count : %d", mytree.countNodes(root)));
//		
//		BinaryTree t2 = new BinaryTree();
//		t2.add(23);
//		t2.add(76);
//		System.out.println(t2.countNodes(t2.root));
//		t2.inOrder(t2.root);
//		
//		System.out.println();
//		System.out.println(String.format("tree height : %d", mytree.getHeight(root)));
//		System.out.println(t2.getHeight(t2.root));
//		
//		mytree.add(7);
//		mytree.add(8);
//		System.out.println(String.format("tree height : %d", mytree.getHeight(root)));
//		mytree.inOrder(root);
	}
	
	public void levelOrderln(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node current = q.poll();
			if(current ==null) {
				if(q.isEmpty())
					return;

				q.add(null);
				System.out.println();
				continue;
			}
			System.out.print(current.data+" ");
			if(current.left!=null)
				q.add(current.left);
			if(current.right!=null)
				q.add(current.right);
		}
	}
	
	public void levelOrder (Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node current = q.poll();
			System.out.print(current.data+" ");
			if(current.left!=null)
				q.add(current.left);
			if(current.right!=null)
				q.add(current.right);
		}
	}
	public Map levelOrderHm(Node n, int level ) {
		if(n==null)
			return null;
		Map<Integer,ArrayList<Integer>> levelMap = new HashMap<>();
		ArrayList<Integer> currlist = levelMap.get(level);
		currlist.add(n.data);
		levelMap.put(level, currlist);
		
		levelOrderHm(n.left, level+1);
		return levelOrderHm(n.right, level+1);
		
	}
	public int getHeight(Node root) {
		if(root == null)
			return 0;
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
	}
	public int countNodes(Node root) {
		if(root==null)
			return 0;
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	public void preOrder(Node root) {
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
					
	}
	public void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public void postOrder(Node root) {
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	static Scanner sc;
	public static Node createTreeFromUser() {
		Node root=null;
		sc = new Scanner(System.in);
		
		System.out.print("Enter node data: ");
		int data = sc.nextInt();
		
		if(data ==-1)
			return null;
		
		root = new Node(data);
		
		System.out.println("enter left for "+data+": ");
		root.left = createTreeFromUser();
		System.out.println("enter right for "+data+": ");
		root.right =  createTreeFromUser();
		
		return root;
	}
	public  Node createTreeFromUser(String filename) {
		Node root=null;
		InputStream is = this.getClass().getResourceAsStream("/"+filename);
		sc = new Scanner(is);
		
		System.out.print("Enter node data: ");
		int data = sc.nextInt();
		
		if(data ==-1)
			return null;
		
		root = new Node(data);
		
		System.out.println("enter left for "+data+": ");
		root.left = createTreeFromUser();
		System.out.println("enter right for "+data+": ");
		root.right =  createTreeFromUser();
		
		return root;
	}
	
	public void buildTree(int[] nodes) {
		
	}
	
	public static BinaryTree addAll(int[] nodes) {
		BinaryTree bt = new BinaryTree();
		for(int i=0;i<nodes.length;i++) {
			bt.add(nodes[i]);
		}
		return bt;
	}
	
	public void add(int value) {
		this.root = addRecursive(root,value);
	}
	private Node addRecursive(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		if (current.left == null)
			current.left = addRecursive(current.left, value);
		else
			current.right = addRecursive(current.right, value);

		return current;
	}

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
//			this.left = null;
//			this.right = null;
		}
	}
}