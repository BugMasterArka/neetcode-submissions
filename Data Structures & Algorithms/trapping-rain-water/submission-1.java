class Solution {
    public int trap(int[] height) {
        if(height.length==0)
            return 0;
        int left = 0, right = height.length-1;
        int maxLeft = height[left],maxRight=height[right];
        int res = 0;
        while(left<=right){
            if(maxLeft<=maxRight){
                if(height[left]<maxLeft)
                    res+=maxLeft-height[left];
                maxLeft = Math.max(maxLeft,height[left]);
                left++;
            }else{
                if(height[right]<maxRight)
                    res+=maxRight-height[right];
                maxRight = Math.max(maxRight,height[right]);
                right--;
            }
        }
        return res;
    }
}
