class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(int i: nums){
            int count = 1;
            int curElement = i;
            while(visited.contains(--curElement))
                count++;
            curElement = i;
            while(visited.contains(++curElement))
                count++;
            maxLength= Math.max(count, maxLength);
            visited.add(i);
        }
        return maxLength;
    }
}
