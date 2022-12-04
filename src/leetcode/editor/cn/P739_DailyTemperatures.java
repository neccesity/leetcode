//<p>给定一个整数数组&nbsp;<code>temperatures</code>&nbsp;，表示每天的温度，返回一个数组&nbsp;<code>answer</code>&nbsp;，其中&nbsp;<code>answer[i]</code>&nbsp;是指对于第 <code>i</code> 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用&nbsp;<code>0</code> 来代替。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1:</strong></p>
//
//<pre>
//<strong>输入:</strong> <span><code>temperatures</code></span> = [73,74,75,71,69,72,76,73]
//<strong>输出:</strong>&nbsp;[1,1,4,2,1,1,0,0]
//</pre>
//
//<p><strong>示例 2:</strong></p>
//
//<pre>
//<strong>输入:</strong> temperatures = [30,40,50,60]
//<strong>输出:</strong>&nbsp;[1,1,1,0]
//</pre>
//
//<p><strong>示例 3:</strong></p>
//
//<pre>
//<strong>输入:</strong> temperatures = [30,60,90]
//<strong>输出: </strong>[1,1,0]</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;=&nbsp;temperatures.length &lt;= 10<sup>5</sup></code></li> 
// <li><code>30 &lt;=&nbsp;temperatures[i]&nbsp;&lt;= 100</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>数组</li><li>单调栈</li></div></div><br><div><li>👍 1356</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Stack;

/**
 * 每日温度
 * @author zhangjunhui1999
 */
public class P739_DailyTemperatures{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P739_DailyTemperatures().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	/*public int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int ans[] = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
				ans[stack.peek()] = i - stack.pop();
			}
			stack.push(i);
		}
		return ans;
	}*/
	public int[] dailyTemperatures(int[] temperatures) {
		int stack[] = new int[100005];
		int ans[] = new int[temperatures.length], cnt = 0;
		for (int i = 0; i < temperatures.length; i++) {
			while (cnt>0 && temperatures[i]>temperatures[stack[cnt]]) {
				ans[stack[cnt]] = i - stack[cnt--];
			}
			stack[++cnt] = i;
		}
		return ans;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
