/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<Integer>();
        if(root==null){
            return arr;
        }
        return inorder(arr,root);
    }
    public List<Integer> inorder(List<Integer> arr, TreeNode root){
        if(root!=null){
            inorder(arr,root.left);
            arr.add(root.val);
            inorder(arr,root.right);
            return arr;
        }
        return arr;
    }
}