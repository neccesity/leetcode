//<p>给你两个正整数 <code>n</code> 和 <code>target</code> 。</p>
//
//<p>如果某个整数每一位上的数字相加小于或等于 <code>target</code> ，则认为这个整数是一个 <strong>美丽整数</strong> 。</p>
//
//<p>找出并返回满足 <code>n + x</code> 是 <strong>美丽整数</strong> 的最小非负整数 <code>x</code> 。生成的输入保证总可以使 <code>n</code> 变成一个美丽整数。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre><strong>输入：</strong>n = 16, target = 6
//<strong>输出：</strong>4
//<strong>解释：</strong>最初，n 是 16 ，且其每一位数字的和是 1 + 6 = 7 。在加 4 之后，n 变为 20 且每一位数字的和变成 2 + 0 = 2 。可以证明无法加上一个小于 4 的非负整数使 n 变成一个美丽整数。
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre><strong>输入：</strong>n = 467, target = 6
//<strong>输出：</strong>33
//<strong>解释：</strong>最初，n 是 467 ，且其每一位数字的和是 4 + 6 + 7 = 17 。在加 33 之后，n 变为 500 且每一位数字的和变成 5 + 0 + 0 = 5 。可以证明无法加上一个小于 33 的非负整数使 n 变成一个美丽整数。</pre>
//
//<p><strong>示例 3：</strong></p>
//
//<pre><strong>输入：</strong>n = 1, target = 1
//<strong>输出：</strong>0
//<strong>解释：</strong>最初，n 是 1 ，且其每一位数字的和是 1 ，已经小于等于 target 。
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 10<sup>12</sup></code></li> 
// <li><code>1 &lt;= target &lt;= 150</code></li> 
// <li>生成的输入保证总可以使 <code>n</code> 变成一个美丽整数。</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>贪心</li><li>数学</li></div></div><br><div><li>👍 19</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * 美丽整数的最小增量
 * @author zhangjunhui1999
 */
public class P2457_MinimumAdditionToMakeIntegerBeautiful{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2457_MinimumAdditionToMakeIntegerBeautiful().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long makeIntegerBeautiful(long n, int target) {
		long digits[] = new long[15];
		int num = 0, sum = 0;
		while (n>0) {
			digits[num++] = n%10;
			n /= 10;
			sum += digits[num];
		}
		int x = 0;
		if (sum == target) return 0;
		for (int i = 0; i < num; i++) {
			if (sum<target) {
				if (target-sum < 10-digits[i]) {
					x += target - digits[i];
				} else {
					x += 10-digits[i];
					sum -= (10-digits[i]);
					for (int j = i+1; j < num; j++) {
						sum
					}
				}
			} else {
				if (sum-target <= digits[i]) {
					x += sum-target;
					break;
				} else {
					sum -= digits[i];
					x += digits[i];
				}
			}
		}
    	return x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
