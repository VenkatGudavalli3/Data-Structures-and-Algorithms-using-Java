package BinaryTree;

public class FindMax {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(8);


        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public int findMax_recursive(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int max = root.data;

        int left = findMax_recursive(root.left);
        int right = findMax_recursive(root.right);

        if(left > max){
            max = left;
        }
        if(right > max){
            max = right;
        }
        return max;
    }



    
    public static void main(String[] args) {

        FindMax f = new FindMax();
        f.createBinaryTree();
        int res = f.findMax_recursive(f.root);
        System.out.println("The Maximum value is: "+ res);

        
    }
    
}
