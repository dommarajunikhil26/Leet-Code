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
    public TreeNode heightBalanced(int arr[],int l,int r){
        if(l>r){
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=heightBalanced(arr,l,mid-1);
        root.right=heightBalanced(arr,mid+1,r);
        
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return heightBalanced(nums,0,nums.length-1);
    }
}