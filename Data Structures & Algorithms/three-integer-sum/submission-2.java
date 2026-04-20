class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int j=i+1,k=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int prevJ = Integer.MIN_VALUE,prevK = Integer.MIN_VALUE;
            while(j<k){
                while(prevJ==nums[j])
                    j++;
                while(prevK==nums[k])
                    k--;
                if(j>=k)
                    continue;
                int val = nums[i]+nums[j]+nums[k];
                if(val==0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    prevJ=nums[j];
                    prevK=nums[k];
                    j++;
                    k--;
                }
                else if(val<0)
                    j++;
                else
                    k--;
            }
        }
        return res;
    }
}
