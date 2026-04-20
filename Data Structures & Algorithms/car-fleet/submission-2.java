class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<position.length;i++){
            list.add(new int[]{position[i],speed[i]});
        }
        list.sort((a,b)->b[0]-a[0]);
        Stack<Double> stack = new Stack<>();
        for(int[] i: list){
            double time = (double)(target-i[0])/i[1];
            if(!stack.isEmpty() && time>stack.peek())
                stack.push(time);
            else if(stack.isEmpty())
                stack.push(time);
        }
        return stack.size();
    }
}
