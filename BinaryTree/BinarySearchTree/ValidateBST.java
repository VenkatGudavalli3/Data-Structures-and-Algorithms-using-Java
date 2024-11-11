package BinaryTree.BinarySearchTree;

public class ValidateBST {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int data){
            root = insert(root,data);
    }

    public TreeNode insert(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    public void inorder(){
        inorder(root);
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Validation

    public boolean isValid(TreeNode root, int min, int max){

        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }

        boolean left = isValid(root.left, min, root.data);

        if(left){
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {


        ValidateBST bst = new ValidateBST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
        
        bst.inorder();


        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;


        if(bst.isValid(bst.root,min,max)){
            System.out.println();
            System.out.println("Valid BST!");
        }else{
            System.out.println("invalid BST!");
        }
        
    }
}
