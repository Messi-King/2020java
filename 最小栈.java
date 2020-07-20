public class Solution {
    /*
    思路:需要一个辅助栈空间，对应保存当前数据栈的最小值
    */
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack = new Stack<>(); //辅助栈
    public void push(int node) {
        stack.push(node);
        if(minStack.empty())  //将当前最小值存入辅助栈
            minStack.push(node);
        else
            minStack.push(node > minStack.peek() ? minStack.peek(): node);
    }
    
    public void pop() { //两个都出栈
        if(!stack.empty()){
            stack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}