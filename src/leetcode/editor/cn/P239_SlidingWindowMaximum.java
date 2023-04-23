//<p>You are given an array of integers&nbsp;<code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>
//
//<p>Return <em>the max sliding window</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
//<strong>Output:</strong> [3,3,5,5,6,7]
//<strong>Explanation:</strong> 
//Window position                Max
//---------------               -----
//[1  3  -1] -3  5  3  6  7       <strong>3</strong>
// 1 [3  -1  -3] 5  3  6  7       <strong>3</strong>
// 1  3 [-1  -3  5] 3  6  7      <strong> 5</strong>
// 1  3  -1 [-3  5  3] 6  7       <strong>5</strong>
// 1  3  -1  -3 [5  3  6] 7       <strong>6</strong>
// 1  3  -1  -3  5 [3  6  7]      <strong>7</strong>
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1], k = 1
//<strong>Output:</strong> [1]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> 
// <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
// <li><code>1 &lt;= k &lt;= nums.length</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>队列</li><li>数组</li><li>滑动窗口</li><li>单调队列</li><li>堆（优先队列）</li></div></div><br><div><li>👍 2262</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Sliding Window Maximum
 * @author zhangjunhui1999
 */
public class P239_SlidingWindowMaximum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P239_SlidingWindowMaximum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
