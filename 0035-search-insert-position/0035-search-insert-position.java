class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length-1;
        int first=0;
        int last=n;
        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]<target){
                first=mid+1;
            }
            else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                return mid;
            }
        }
        return first;
    }
}