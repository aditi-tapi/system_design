package Tree;

import java.util.*;

public class VerticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeNode root= new TreeNode(8262);
			
			TreeNode t1= new TreeNode(-1);
			TreeNode t2= new TreeNode(411);
			TreeNode t3= new TreeNode(-1);
			TreeNode t4= new TreeNode(-1);
			root.left=t1;
			root.right=t2;
			t2.left=t3;
			t2.right=t4;
		
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        
	        LinkedList<TreeNode> node = new LinkedList<TreeNode>();
	        LinkedList<Integer> level = new LinkedList<Integer>();
	        
	        int minLevel=0, maxLevel=0;
	        node.add(root);
	        level.add(0);
	        
	        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
	        while(!node.isEmpty())
	        {
	            TreeNode temp = node.poll();
	            int l = level.poll();
	            
	            minLevel= Math.min(minLevel,l);
	            maxLevel=Math.max(maxLevel,l);
	            
	            
	            if(map.containsKey(l))
	            map.get(l).add(temp.val);
	            else
	            {
	                ArrayList<Integer> list = new ArrayList<Integer>();
	                list.add(temp.val);
	                map.put(l,list);
	            }
	            if(root.left!=null)
	            {
	                node.add(root.left);
	                level.add(l-1);
	            }
	            if(root.right!=null)
	            {
	                node.add(root.right);
	                level.add(l+1);
	            }
	            
	            
	        }
	        
	        for(int i=minLevel;i<=maxLevel;i++)
	        {
	            if(map.containsKey(i))
	            result.add(map.get(i));
	        }
	        
	        System.out.println(result);
	        
	        


	}

}


 // Definition for binary tree
  class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
