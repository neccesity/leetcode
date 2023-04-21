//<p>Given a circular integer array <code>nums</code> (i.e., the next element of <code>nums[nums.length - 1]</code> is <code>nums[0]</code>), return <em>the <strong>next greater number</strong> for every element in</em> <code>nums</code>.</p>
//
//<p>The <strong>next greater number</strong> of a number <code>x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return <code>-1</code> for this number.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,1]
//<strong>Output:</strong> [2,-1,2]
//Explanation: The first 1's next greater number is 2; 
//The number 2 can't find next greater number. 
//The second 1's next greater number needs to search circularly, which is also 2.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,3,4,3]
//<strong>Output:</strong> [2,3,4,-1,4]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
// <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>数组</li><li>单调栈</li></div></div><br><div><li>👍 798</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Stack;

/**
 * Next Greater Element II
 * @author zhangjunhui1999
 */
public class P503_NextGreaterElementIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P503_NextGreaterElementIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int numbers[] = int[nums.length*2];
		for(int i=0;i<nums.length;i++) numbers[i]=nums[i];
		for(int i=nums.length;i<nums.length*2;i++) numbers[i]=nums[i- numbers.length];
    	for(int i=0;i<nums.length*2;i++) {
    		while(!stack.isEmpty()&&stack.peek()<=numbers[i]) {
    			stack.pop();
			}
    		stack.push(numbers[i]);
		}
    	return
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
