public class Solution {
	// &&两侧的表达式结果必须为boolean型，
	// 所有&&右侧要用一个无关变量a判断是否与result相等，
	// 让右侧的表达式返回boolean型。不管返回的是true还是false，
	// 我们的目的仅仅是让&&右侧的表达式执行。
	// &&连接的表达式，必须要将最终的boolean结果赋给变量，否则编译报错！
	public int Sum_Solution(int n) {
		int result = 0;
		int temp = 0;
		// 借用&&的短路功能
		boolean flag = (n > 0) && temp == (result += Sum_Solution(n - 1));
		// return ((int) Math.pow(n, 2) + n) >> 1;
		return result;
	}
}