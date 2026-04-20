class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> combo = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(combo);
                    res.add(combo);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res.stream().toList());
    }
}
