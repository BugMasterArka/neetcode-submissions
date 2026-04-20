class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int curPrefix = 1, curSuffix = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i] = curPrefix;
            curPrefix*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            suffix[j] = curSuffix;
            curSuffix*=nums[j];
        }
        for(int k=0;k<result.length;k++){
            result[k]=prefix[k]*suffix[k];
        }
        return result;
    }
}  
