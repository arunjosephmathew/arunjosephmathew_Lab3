package com.greatlearning.main;
import java.util.*;

public class FindSumPair {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root  = null;
		FindSumPair findSP = new FindSumPair();
		
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);
		
		int sum = 130;   //  The sum that to be found with pairs
		findSP.findPairWithGivenSum(root, sum);

	}
	
	static class Node{
		int nodeData;
		Node leftNode,RightNode;
	}
	
	
	static Node newNode(int nodeData) {
		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null;
		temp.RightNode = null;
		
		return temp;
	}
	
	public Node insert(Node root, int key) {  
		if(root == null)
			return newNode(key);
		
		if(key < root.nodeData)
			root.leftNode = insert(root.leftNode,key);
		
		else
			root.RightNode = insert(root.RightNode,key);
		return root;
	}
	
	
	//Methods for finding sum with pair
	
	public void findPairWithGivenSum(Node root, int sum) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findPairUtil(root,sum,set))
			System.out.println("Nodes are not Found");
	}
	
	public boolean findPairUtil(Node root, int sum,HashSet<Integer> set) {
		
		if(root == null)
			return false;
		
		if(findPairUtil(root.leftNode,sum,set))
			return true;
		
		if(set.contains(sum - root.nodeData)) {
			System.out.println("Pair is (" + (sum - root.nodeData) + ", " + root.nodeData + ")");
			return true;
		}else {
			set.add(root.nodeData);
			
			return findPairUtil(root.RightNode, sum, set);
		}
	}
	
	

}
