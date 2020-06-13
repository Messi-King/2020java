//变态跳台阶
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0 || target == 1) {
            return target;
        }
        int ret = 1;
        for(int i=2;i<=target;i++) {
            ret *= 2;
        }
        return ret;
    }
}