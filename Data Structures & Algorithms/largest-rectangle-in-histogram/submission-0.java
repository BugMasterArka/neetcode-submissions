class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<heights.length;i++){
            int expandableIndex = i;
            while(!stack.isEmpty() && heights[i]<stack.peek()[1]){
                int[] cur = stack.pop();
                expandableIndex = cur[0];
                maxArea = Math.max(maxArea,cur[1]*(i-cur[0]));
            }
            stack.push(new int[]{expandableIndex,heights[i]});
        }
        while(!stack.isEmpty()){
            int[] cur = stack.pop();
            maxArea = Math.max(maxArea,cur[1]*(heights.length-cur[0]));
        }
        return maxArea;
    }
    
}
