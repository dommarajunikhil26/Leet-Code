class Solution {
    public int maxArea(int[] height) {
        //brute force solution
        // int area=0;
        // int maxArea=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         area=(j-i)*Math.min(height[i],height[j]);
        //     }
        //     if(area>maxArea){
        //         maxArea=area;
        //     }
        // }
        // return maxArea;
        //optimal solution
        int l=0,area=0,maxArea=0;
        int r=height.length-1;
        while(l<r){
            area=(r-l)*Math.min(height[l],height[r]);
            maxArea=Math.max(area,maxArea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}