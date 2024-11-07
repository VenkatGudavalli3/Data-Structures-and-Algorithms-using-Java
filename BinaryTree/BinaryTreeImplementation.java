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
        TreeNode sixth = new TreeNode(6);


        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
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

    //InOrder Traversal
    
    public void InOrder_Recursive(TreeNode root){
        if(root == null){
            return;
        }
        InOrder_Recursive(root.left);
        System.out.print(root.data+" ");
        InOrder_Recursive(root.right);
    }

    public void InOrder_Iterative(){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp!=null ){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data+" ");

                temp = temp.right;
            }
        }

    }
    public static void main(String[] args) {
        BinaryTreeImplementation b = new BinaryTreeImplementation();

        b.createBinaryTree();
        b.preOrderTraversal_Recursive(b.root);
        System.out.println();
        b.preOrderTraversal_Iterative();
        System.out.println();

        b.InOrder_Recursive(b.root);
        System.out.println();
        b.InOrder_Iterative();
        
    }
}
