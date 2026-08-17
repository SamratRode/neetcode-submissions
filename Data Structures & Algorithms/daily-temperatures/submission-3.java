class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] output=new int[n];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                output[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return output;
    }
}
