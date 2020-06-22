class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
 //入栈操作
    public void push(int x) {
       s1.push(x);
    }
    
//出栈操作
    public int pop() {
        if(s2.empty()) {
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
//得到栈顶元素
    public int peek() {
         if(s2.empty()) {
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
//判断栈是否为空
    public boolean empty() {
        if(s1.empty()&&s2.empty()) {
            return true;
        }
        return false;
    }
}