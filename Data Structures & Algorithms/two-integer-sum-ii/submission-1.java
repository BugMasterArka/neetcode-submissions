class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        int[] res = new int[2];
        while(j>i){
            if(numbers[i]+numbers[j]==target){
                res[0]=i+1;
                res[1]=j+1;
            }
            if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
        }
        return res;
    }
}
