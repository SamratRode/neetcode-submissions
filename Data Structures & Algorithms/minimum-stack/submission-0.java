class MinStack {
    public class Pair{
        int a;
        int b;
        Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
    }
    Deque<Pair> stack;

    public MinStack() {
        stack=new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Pair(val, val));
        }
        else if(val<stack.peek().b){
            stack.push(new Pair(val,val));
        }
        else if(val>=stack.peek().b){
            stack.push(new Pair(val, stack.peek().b));
        }
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().a;
    }
    
    public int getMin() {
        return stack.peek().b;
    }
}
