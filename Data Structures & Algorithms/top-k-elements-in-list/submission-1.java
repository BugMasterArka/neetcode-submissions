class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) map.put(i,map.getOrDefault(i,0)+1);

        HashMap<Integer,List<Integer>> buckets = new HashMap<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            buckets.putIfAbsent(e.getValue(),new ArrayList<>());
            buckets.get(e.getValue()).add(e.getKey());
        }

        int[] result = new int[k];
        int index=0;
        for(int i=nums.length;i>=0;i--){
            if(buckets.containsKey(i)){
                for(int el: buckets.get(i))
                    result[index++]=el;
                if(index==k)
                    break;
            }
        }

        return result;
    }
}
