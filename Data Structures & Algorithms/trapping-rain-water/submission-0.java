class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int curLeftMax = 0, curRightMax = 0;
        for(int i=0;i<height.length;i++){
            prefix[i] = curLeftMax;
            curLeftMax = Math.max(curLeftMax,height[i]);
        }
        for(int i=height.length-1;i>=0;i--){
            suffix[i] = curRightMax;
            curRightMax = Math.max(curRightMax,height[i]);
        }
        int res = 0;
        for(int i=0;i<height.length;i++){
            int val = Math.min(prefix[i],suffix[i])-height[i];
            if(val>0){
                res+=val;
            }
        }
        return res;
    }
}
