class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        RemainingDistanceSpeedPair[] pair=new RemainingDistanceSpeedPair[n];
        for(int i=0;i<n;i++){
            pair[i]=new RemainingDistanceSpeedPair(target-position[i], speed[i]);
        }
        Arrays.sort(pair, (a,b)->Integer.compare(a.remainingDistance,b.remainingDistance));
        Deque<Double> stack=new ArrayDeque<>();
        int result=0;
        for(int i=0;i<n;i++){
            double time=(double)pair[i].remainingDistance/pair[i].speed;
            if(stack.isEmpty() || stack.peek() < time){
                stack.push(time);
                result++;
            }
        }
        return result;
        
    }
    public static class RemainingDistanceSpeedPair{
        int remainingDistance;
        int speed;
        RemainingDistanceSpeedPair(int remainingDistance, int speed){
            this.remainingDistance=remainingDistance;
            this.speed=speed;
        }

    }
}
