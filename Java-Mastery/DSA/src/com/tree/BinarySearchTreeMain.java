package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import com.tree.BinarySearchTree.Node;

class BinarySearchTree {
	static class Node {
		// Node fields
		private int data;
		private Node left; // it data type Node
		private Node right;

		// Node method
		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

	}

	// tree fields
	private Node root;

	// tree method
	public BinarySearchTree() {
		root = null;
	}

	// add node
	public void add(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
		} else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left != null) {
						trav = trav.left;
					} else {// no child in left
						trav.left = newNode;
						break;
					}
				} else {// if(value > trav.data)

					if (trav.right != null) {
						trav = trav.right;
					} else {
						trav.right = newNode;
						break;
					}

				}
			}

		}

	}

	// PreOrder (using recursion)
	private void preOrder(Node trav) {
		if (trav == null) {
			return;
		}
		System.out.print(trav.data + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}// wrapper for PreOrder

	public void preOrder() {
		System.out.print("PRE  : ");
		preOrder(root);
		System.out.println();
	}

	// inOrder (using recursion)
	private void inOrder(Node trav) {
		if (trav == null) {
			return;
		}
		inOrder(trav.left);
		System.out.print(trav.data + " ");
		inOrder(trav.right);
	}// wrapper for inOrder

	public void inOrder() {
		System.out.print("IN   : ");
		inOrder(root);
		System.out.println();
	}

	// PostOrder (using recursion)
	private void postOrder(Node trav) {
		if (trav == null) {
			return;
		}
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + " ");
	}// wrapper for postOrder

	public void postOrder() {
		System.out.print("post : ");
		postOrder(root);
		System.out.println();
	}

	private void deleteAll(Node trav) {
		if (trav == null) {
			return;
		}
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;

	}

	public void deleteAll() {
		deleteAll(root);
		root = null;
	}

	// height
	public int height(Node trav) {
		// base
		if (trav == null) {
			return -1;
		}
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = hl > hr ? hl : hr;
		return max + 1;
	}

	// height wrapper
	public int height() {
		return height(root);

	}

	public void preOrderNonRecursive() {
		System.out.print("PRE  : ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while (trav != null || !s.isEmpty()) {
			while (trav != null) {
				System.out.print(trav.data + " ");
				if (trav.right != null) {
					s.push(trav.right);
				}
				trav = trav.left;
			}
			if (!s.isEmpty()) {
				trav = s.pop();
			}

		}
		System.out.println("");
	}

	public void inOrderNonRecursive() {
		System.out.print("IN Non : ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while (trav != null || !s.isEmpty()) {
			while (trav != null) {
				s.push(trav);
				trav = trav.left;
			}
			if (!s.isEmpty()) {
				trav = s.pop();
				System.out.print(trav.data + ",");
				trav = trav.right;
			}

		}
		System.out.println("");
	}

	public Node breadthFirstSearch(int key) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			Node trav = q.poll();
			if (key == trav.data) {
				return trav;
			}
			if (trav.left != null) {
				q.offer(trav.left);
			}
			if (trav.right != null) {
				q.offer(trav.right);
			}
		}
		return null;

	}

	// depthFirstSearch
	public Node depthFirstSearch(int key) { // only chanhe comapre to bfs it use stack
		Stack<Node> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			Node trav = s.pop();
			if (key == trav.data) {
				return trav;
			}
			if (trav.right != null) {
				s.push(trav.right);
			}
			if (trav.left != null) {
				s.push(trav.left);
			}

		}
		return null;

	}

	// BINARY SEARCH
	public Node binarySearch(int key) {
		Node trav = root;
		while (trav != null) {

			if (key == trav.data) {
				return trav;
			}
			if (key < trav.data) {
				trav = trav.left;
			} else {// key > trav.data
				trav = trav.right;
			}
		}
		return null;
	}

	// REQUIREMENT OF PARENT AND ITS TRAV
	public Node[] binarySearchWithParent(int key) {
		Node trav = root, parent = null;
		while (trav != null) {

			if (key == trav.data) {
				return new Node[] { trav, parent };
			}
			parent = trav;
			if (key < trav.data) {
				trav = trav.left;
			} else {// key > trav.data
				trav = trav.right;
			}
		}
		return new Node[] { null, null };
	}

	public void delete(int value) {
		Node trav, parent;
		// find the node to be deleted along with its parent
		Node[] arr = binarySearchWithParent(value);
		trav = arr[0];
		parent = arr[1];
		// if node is not found.throw the exception
		if (trav == null) {
			throw new RuntimeException("Node not found");
		}

		// if node has left as well as right child
		if (trav.left != null && trav.right != null) {
			// find it successor with its parent
			parent = trav;
			Node succ = trav.right;
			while (succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			// override data of node with successor data
			trav.data = succ.data;
			// mark successor node to be deleted
			trav = succ;
		}

		// if node has right child (or node doesn't have left child)
		if (trav.left == null) {
			if (trav == root) {
				root = trav.right;
			} else if (trav == parent.right) {
				parent.right = trav.right;
			} else {
				parent.left = trav.right;
			}
		}
		// if node has left child (or node doesn't have right child)
		else if (trav.right == null) {
			if (trav == root) {
				root = trav.left;
			} else if (trav == parent.left) {
				parent.left = trav.left;
			} else {
				parent.right = trav.left;
			}
		}

	}
}

public class BinarySearchTreeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(100);
		bst.add(40);
		bst.add(70);
		bst.add(80);
		bst.add(60);
		bst.add(20);

		bst.preOrder();
		bst.preOrderNonRecursive();
		bst.inOrder();
		bst.inOrderNonRecursive();
		bst.postOrder();

		System.out.println("HEIGHT : " + bst.height());

		System.out.println("enter element to find : ");
		int val = sc.nextInt();
		Node temp = bst.breadthFirstSearch(val);
		if (temp == null) {
			System.out.println("BFS not found");
		} else {
			System.out.println("BFS found " + temp.getData());
		}

		temp = bst.depthFirstSearch(val);
		if (temp == null) {
			System.out.println("DFS not found");
		} else {
			System.out.println("DFS found " + temp.getData());
		}

		temp = bst.binarySearch(val);
		if (temp == null) {
			System.out.println("BS not found");
		} else {
			System.out.println("BS found " + temp.getData());
		}

		// WITH PARENT
		Node[] arr = bst.binarySearchWithParent(val);
		if (arr[0] == null) {
			System.out.println("BS not found");
		} else if (arr[1] == null) {// root node not found
			System.out.println("BS found " + arr[0].getData() + " With parent " + arr[1]);
		} else {// node found with parent
			System.out.println("BS found " + arr[0].getData() + " With parent " + arr[1].getData());
		}

		bst.inOrderNonRecursive();
		try {
			System.out.println("Enter element to delete ");
			int value = sc.nextInt();
			bst.delete(value);
			bst.inOrderNonRecursive();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		bst.deleteAll();
		bst.inOrder();
		System.out.println("HEIGHT : " + bst.height());

	}
}