public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      /*思路：模拟压栈和出栈过程
      规律是：根据弹出序列，如果下一个弹出的元素正好是栈顶元素，则弹出；如果下一个弹出的数字不是栈顶元素，则将还未进栈的元素依次进栈，
      直到找到要弹出的那个数字；最终，如果所有数字都压入栈中还没有找到弹出元素，则说明不是一个弹出序列
      */
        if(pushA==null || popA==null)
            return false;
        Stack<Integer> stack=new Stack<>();  //辅助栈，用来模拟该过程
        int p=0; //进栈序列下标
        int len=pushA.length;
        for(int i=0;i<popA.length;i++){
            //当前需要弹出的是popA[i]
            if(!stack.empty()&& stack.peek()==popA[i]) //弹出的元素正好是栈顶元素
                stack.pop();
            else{ //下一个弹出的数字不是栈顶元素
                while(p<len && pushA[p]!=popA[i]){  //所有数字都压入栈中还没有找到弹出元素，则说明不是一个弹出序列
                    stack.push(pushA[p]);
                    p++;
                }
                p++;
            }
        }
        return stack.isEmpty();    
    }
}