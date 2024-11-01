package BinaryTree;

import java.util.Stack;

public class BinaryTreeImplementation {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        
        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    // pre order traversal
    public void preOrderTraversal_Recursive(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal_Recursive(root.left);
        preOrderTraversal_Recursive(root.right);
    }

    public void preOrderTraversal_Iterative(){
        if(root == null){
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            System.out.print(temp.data+" ");

            if(temp.right!=null){
                s.push(temp.right);
            }
            
            if(temp.left!=null){
                s.push(temp.left);
            }
        }

    }
    
    public static void main(String[] args) {
        BinaryTreeImplementation b = new BinaryTreeImplementation();

        b.createBinaryTree();
        //b.preOrderTraversal_Recursive(b.root);
        b.preOrderTraversal_Iterative();
        
    }
}
