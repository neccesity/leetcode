//<p>Given an integer array <code>nums</code>, find the <span data-keyword="subarray-nonempty">subarray</span> with the largest sum, and return <em>its sum</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4]
//<strong>Output:</strong> 6
//<strong>Explanation:</strong> The subarray [4,-1,2,1] has the largest sum 6.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1]
//<strong>Output:</strong> 1
//<strong>Explanation:</strong> The subarray [1] has the largest sum 1.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [5,4,-1,7,8]
//<strong>Output:</strong> 23
//<strong>Explanation:</strong> The subarray [5,4,-1,7,8] has the largest sum 23.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> 
// <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution using the <strong>divide and conquer</strong> approach, which is more subtle.</p>
//
//<div><div>Related Topics</div><div><li>数组</li><li>分治</li><li>动态规划</li></div></div><br><div><li>👍 6013</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Maximum Subarray
 * @author zhangjunhui1999
 */
public class P53_MaximumSubarray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P53_MaximumSubarray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
		int n=nums.length,maxSum=nums[0];
		int f[] = new int[100005];
    	for(int i=1;i<=n;i++) f[i]=Math.max(f[i-1]+nums[i-1],nums[i-1]);
    	for(int i=1;i<=n;i++) maxSum=Math.max(f[i],maxSum);
    	return maxSum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
