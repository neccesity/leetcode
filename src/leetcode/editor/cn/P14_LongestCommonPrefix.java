//<p>编写一个函数来查找字符串数组中的最长公共前缀。</p>
//
//<p>如果不存在公共前缀，返回空字符串&nbsp;<code>""</code>。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>strs = ["flower","flow","flight"]
//<strong>输出：</strong>"fl"
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>strs = ["dog","racecar","car"]
//<strong>输出：</strong>""
//<strong>解释：</strong>输入不存在公共前缀。</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= strs.length &lt;= 200</code></li> 
// <li><code>0 &lt;= strs[i].length &lt;= 200</code></li> 
// <li><code>strs[i]</code> 仅由小写英文字母组成</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 2571</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * 最长公共前缀
 * @author zhangjunhui1999
 */
public class P14_LongestCommonPrefix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P14_LongestCommonPrefix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) return strs[0];
    	String s = strs[0], longestPrefix = "";
    	for (int i = 0; i < strs[0].length(); i++) {
    		for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() < i+1) {
					return longestPrefix;
				}
    			if (strs[j].charAt(i) != s.charAt(i)) {
    				return longestPrefix;
				}
			}
    		longestPrefix += s.charAt(i);
		}
    	return longestPrefix;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
