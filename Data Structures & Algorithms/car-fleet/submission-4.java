class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<position.length;i++){
            list.add(new int[]{position[i],speed[i]});
        }
        list.sort((a,b)->b[0]-a[0]);
        int fleets = 1;
        double prevTime = (double)(target-list.get(0)[0])/list.get(0)[1];
        for(int i=1;i<list.size();i++){
            double curTime = (double)(target-list.get(i)[0])/list.get(i)[1];
            if(curTime>prevTime){
                fleets++;
                prevTime=curTime;
            }
        }
        return fleets;
    }
}
