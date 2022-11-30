//<p>给定一个只包括 <code>'('</code>，<code>')'</code>，<code>'{'</code>，<code>'}'</code>，<code>'['</code>，<code>']'</code>&nbsp;的字符串 <code>s</code> ，判断字符串是否有效。</p>
//
//<p>有效字符串需满足：</p>
//
//<ol> 
// <li>左括号必须用相同类型的右括号闭合。</li> 
// <li>左括号必须以正确的顺序闭合。</li> 
// <li>每个右括号都有一个对应的相同类型的左括号。</li> 
//</ol>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>s = "()"
//<strong>输出：</strong>true
//</pre>
//
//<p><strong>示例&nbsp;2：</strong></p>
//
//<pre>
//<strong>输入：</strong>s = "()[]{}"
//<strong>输出：</strong>true
//</pre>
//
//<p><strong>示例&nbsp;3：</strong></p>
//
//<pre>
//<strong>输入：</strong>s = "(]"
//<strong>输出：</strong>false
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li> 
// <li><code>s</code> 仅由括号 <code>'()[]{}'</code> 组成</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>字符串</li></div></div><br><div><li>👍 3629</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Scanner;
import java.util.Stack;

/**
 * 有效的括号
 * @author zhangjunhui1999
 */
public class P20_ValidParentheses{
	 public static void main(String[] args) {
		 //测试代码
		 Solution solution = new P20_ValidParentheses().new Solution();
		 Scanner sc = new Scanner(System.in);
		 while (true) {
			 String s = sc.next();
			 System.out.println(solution.isValid(s));
		 }
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public boolean isMatched(char left, char right) {
		if (left == '(' && right == ')') return true;
		if (left == '[' && right == ']') return true;
		if (left == '{' && right == '}') return true;
		return false;
	}
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				if (isMatched(stack.peek(), s.charAt(i))) {
					stack.pop();
				} else {
					stack.add(s.charAt(i));
				}
			}
		}
		if (stack.isEmpty()) return true;
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
