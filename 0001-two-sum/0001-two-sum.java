class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            if(m.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=m.get(target-nums[i]);
                return arr;
            }
            m.put(nums[i],i);
        }
        return arr;

    }
}