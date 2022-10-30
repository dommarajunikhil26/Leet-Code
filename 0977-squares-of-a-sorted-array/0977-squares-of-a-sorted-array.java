class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int a=0;
        int b=n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[a])>Math.abs(nums[b])){
                arr[i]=nums[a]*nums[a];
                a++;
            }
            else{
                arr[i]=nums[b]*nums[b];
                b--;
            }
        }
        return arr;
    }
}