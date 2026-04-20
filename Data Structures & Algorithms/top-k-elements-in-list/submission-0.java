class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(e.getValue());
            pair.add(e.getKey());
            list.add(pair);
        }

        list.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(0).compareTo(o1.get(0));
            }
        });

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = list.get(i).get(1);
        }

        return result;
    }
}
