//<p>You are given a string <code>s</code> consisting of lowercase English letters. A <strong>duplicate removal</strong> consists of choosing two <strong>adjacent</strong> and <strong>equal</strong> letters and removing them.</p>
//
//<p>We repeatedly make <strong>duplicate removals</strong> on <code>s</code> until we no longer can.</p>
//
//<p>Return <em>the final string after all such duplicate removals have been made</em>. It can be proven that the answer is <strong>unique</strong>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "abbaca"
//<strong>Output:</strong> "ca"
//<strong>Explanation:</strong> 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "azxxzy"
//<strong>Output:</strong> "ay"
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li> 
// <li><code>s</code> consists of lowercase English letters.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>字符串</li></div></div><br><div><li>👍 519</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Stack;

/**
 * Remove All Adjacent Duplicates In String
 * @author zhangjunhui1999
 */
public class P1047_RemoveAllAdjacentDuplicatesInString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1047_RemoveAllAdjacentDuplicatesInString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i=0;i<s.length();i++) {
			if(!stack.isEmpty()) {
				if(stack.peek()==s.charAt(i)) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			} else {
				stack.push(s.charAt(i));
			}
		}
		StringBuilder str = new StringBuilder();
    	while(!stack.isEmpty()) {
    		str.append(stack.pop());
		}
    	str.reverse();
    	return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
