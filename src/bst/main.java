package bst;

import java.util.Random;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<Integer> bst = new BST<>();
//		Random random = new Random();
//		int n = 1000;
//		
//		for(int i = 0; i < n; i++)
//			bst.add(random.nextInt(10000));
//		
//		ArrayList<Integer> nums = new ArrayList<>();
//		while(!bst.isEmpty())
//			nums.add(bst.removeMin());
//		
//		System.out.println(nums);
//		
//		for(int i = 1; i < nums.size(); i++)
//			if(nums.get(i-1) > nums.get(i))
//				throw new IllegalArgumentException("Error");
//		System.out.println("removeMin test completed.");
//		
//		for(int i = 0; i < n; i++)
//			bst.add(random.nextInt(10000));
//		
//		nums = new ArrayList<>();
//		while(!bst.isEmpty())
//			nums.add(bst.removeMax());
//		
//		System.out.println(nums);
//		
//		for(int i = 1; i < nums.size(); i++)
//			if(nums.get(i-1) < nums.get(i))
//				throw new IllegalArgumentException("Error!");
//		System.out.println("removeMax test completed.");
		
		int[] nums = {5, 3, 6, 8, 4, 2};
		for(int num: nums)
			bst.add(num);
		bst.remove(4);
		System.out.println(bst);
		
//		bst.preOrder();
//		System.out.println();
		
//		bst.inOrder();
//		System.out.println();
//		
//		bst.postOrder();
//		System.out.println();
		
//		bst.preOrderNR();
		
//		bst.levelOrder();
//		System.out.println();
	}
}
