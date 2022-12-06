//<p>给定 <em>n</em> 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。</p>
//
//<p>求在该柱状图中，能够勾勒出来的矩形的最大面积。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1:</strong></p>
//
//<p><img src="https://assets.leetcode.com/uploads/2021/01/04/histogram.jpg" /></p>
//
//<pre>
//<strong>输入：</strong>heights = [2,1,5,6,2,3]
//<strong>输出：</strong>10
//<strong>解释：</strong>最大的矩形为图中红色区域，面积为 10
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<p><img src="https://assets.leetcode.com/uploads/2021/01/04/histogram-1.jpg" /></p>
//
//<pre>
//<strong>输入：</strong> heights = [2,4]
//<b>输出：</b> 4</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= heights.length &lt;=10<sup>5</sup></code></li> 
// <li><code>0 &lt;= heights[i] &lt;= 10<sup>4</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>数组</li><li>单调栈</li></div></div><br><div><li>👍 2249</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Stack;

/**
 * 柱状图中最大的矩形
 * @author zhangjunhui1999
 */
public class P84_LargestRectangleInHistogram{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P84_LargestRectangleInHistogram().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestRectangleArea(int[] heights) {
		Stack<Integer> stack = new Stack<>();
		int l[] = new int[100005];
		int r[] = new int[100005];
		for (int i = 0; i < heights.length; i++) {
			l[i] = -1;
			r[i] = heights.length;
		}
		for (int i = 0; i < heights.length; i++) {
			while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
				r[stack.pop()] = i;
			}
			stack.push(i);
		}
		stack.clear();
		for (int i = heights.length-1; i >= 0; i--) {
			while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
				l[stack.pop()] = i;
			}
			stack.push(i);
		}
		int ans = 0;
		for (int i = 0; i < heights.length; i++) {
			ans = Math.max(ans, heights[i] * (r[i]-l[i]-1));
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
