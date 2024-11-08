package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private TreeNode root;

    private class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int data;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
    }

    public void level_Order_traversal(){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.createBinaryTree();
        System.out.println("Level Order Traversal: ");
        l.level_Order_traversal();
        
    }
}
