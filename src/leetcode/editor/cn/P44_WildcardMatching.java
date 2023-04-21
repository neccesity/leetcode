//<p>Given an input string (<code>s</code>) and a pattern (<code>p</code>), implement wildcard pattern matching with support for <code>'?'</code> and <code>'*'</code> where:</p>
//
//<ul> 
// <li><code>'?'</code> Matches any single character.</li> 
// <li><code>'*'</code> Matches any sequence of characters (including the empty sequence).</li> 
//</ul>
//
//<p>The matching should cover the <strong>entire</strong> input string (not partial).</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "aa", p = "a"
//<strong>Output:</strong> false
//<strong>Explanation:</strong> "a" does not match the entire string "aa".
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "aa", p = "*"
//<strong>Output:</strong> true
//<strong>Explanation:</strong>&nbsp;'*' matches any sequence.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "cb", p = "?a"
//<strong>Output:</strong> false
//<strong>Explanation:</strong>&nbsp;'?' matches 'c', but the second letter is 'a', which does not match 'b'.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>0 &lt;= s.length, p.length &lt;= 2000</code></li> 
// <li><code>s</code> contains only lowercase English letters.</li> 
// <li><code>p</code> contains only lowercase English letters, <code>'?'</code> or <code>'*'</code>.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>贪心</li><li>递归</li><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 1034</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Wildcard Matching
 * @author zhangjunhui1999
 */
public class P44_WildcardMatching{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P44_WildcardMatching().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMatch(String s, String p) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
