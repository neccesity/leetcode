//<p>实现&nbsp;<a href="https://www.cplusplus.com/reference/valarray/pow/" target="_blank">pow(<em>x</em>, <em>n</em>)</a>&nbsp;，即计算 <code>x</code> 的整数&nbsp;<code>n</code> 次幂函数（即，<code>x<sup>n</sup></code><sup><span style="font-size:10.8333px"> </span></sup>）。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>x = 2.00000, n = 10
//<strong>输出：</strong>1024.00000
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>x = 2.10000, n = 3
//<strong>输出：</strong>9.26100
//</pre>
//
//<p><strong>示例 3：</strong></p>
//
//<pre>
//<strong>输入：</strong>x = 2.00000, n = -2
//<strong>输出：</strong>0.25000
//<strong>解释：</strong>2<sup>-2</sup> = 1/2<sup>2</sup> = 1/4 = 0.25
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>-100.0 &lt; x &lt; 100.0</code></li> 
// <li><code>-2<sup>31</sup> &lt;= n &lt;= 2<sup>31</sup>-1</code></li> 
// <li><code>-10<sup>4</sup> &lt;= x<sup>n</sup> &lt;= 10<sup>4</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>递归</li><li>数学</li></div></div><br><div><li>👍 1080</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Pow(x, n)
 * @author zhangjunhui1999
 */
public class P50_PowxN{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P50_PowxN().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public double myPow(double x, int n) {
		double ans = 1.0;
		int flag = 0;
		long num = n;
		if (num < 0) {
			num *= (-1.0);
			flag = 1;
		}
		while (num > 0) {
			if ((num & 1) == 1) {
				ans *= x;
			}
			x *= x;
			num >>= 1;
		}
		return flag==0?ans:(1.0/ans);
	}
}
//leetcode submit region end(Prohibit modification and deletion)


}
