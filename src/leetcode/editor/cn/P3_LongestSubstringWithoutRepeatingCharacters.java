//<p>给定一个字符串 <code>s</code> ，请你找出其中不含有重复字符的&nbsp;<strong>最长子串&nbsp;</strong>的长度。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例&nbsp;1:</strong></p>
//
//<pre>
//<strong>输入: </strong>s = "abcabcbb"
//<strong>输出: </strong>3 
//<strong>解释:</strong> 因为无重复字符的最长子串是 <span><code>"abc"，所以其</code></span>长度为 3。
//</pre>
//
//<p><strong>示例 2:</strong></p>
//
//<pre>
//<strong>输入: </strong>s = "bbbbb"
//<strong>输出: </strong>1
//<strong>解释: </strong>因为无重复字符的最长子串是 <span><code>"b"</code></span>，所以其长度为 1。
//</pre>
//
//<p><strong>示例 3:</strong></p>
//
//<pre>
//<strong>输入: </strong>s = "pwwkew"
//<strong>输出: </strong>3
//<strong>解释: </strong>因为无重复字符的最长子串是&nbsp;<span><code>"wke"</code></span>，所以其长度为 3。
//&nbsp;    请注意，你的答案必须是 <strong>子串 </strong>的长度，<span><code>"pwke"</code></span>&nbsp;是一个<em>子序列，</em>不是子串。
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li> 
// <li><code>s</code>&nbsp;由英文字母、数字、符号和空格组成</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 8463</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * @author zhangjunhui1999
 */
public class P3_LongestSubstringWithoutRepeatingCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if (s.length() == 0) return 0;
    	int len = 0, left = 0, ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				for (int j = left; j < map.get(s.charAt(i)); j++) {
					map.remove(s.charAt(j)-'a');
				}
				len = Math.min(i-map.get(s.charAt(i)), i-left+1);
				left = Math.max(map.get(s.charAt(i))+1, left);
				ans = Math.max(len, ans);
			} else {
				ans = Math.max(++len, ans);
				map.put(s.charAt(i), i);
			}
			map.replace(s.charAt(i), i);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
