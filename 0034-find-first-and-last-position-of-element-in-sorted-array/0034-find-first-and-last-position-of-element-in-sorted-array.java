class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=0,last=nums.length-1;
        int ans[]={-1,-1};
        while(first<=last){
            int mid=first+(last-first)/2;
            if(nums[mid]<target){
                first=mid+1;
            }
            else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                first=mid-1;last=mid+1;
                while(first>=0 && nums[first]==target){
                    first--;
                }
                while(last<nums.length && nums[last]==target){
                    last++;
                }
                ans[0]=first+1;
                ans[1]=last-1;
                return ans;
            }
        }
        return ans;
    }
}