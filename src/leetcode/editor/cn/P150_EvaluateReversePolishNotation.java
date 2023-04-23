//<p>You are given an array of strings <code>tokens</code> that represents an arithmetic expression in a <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation" target="_blank">Reverse Polish Notation</a>.</p>
//
//<p>Evaluate the expression. Return <em>an integer that represents the value of the expression</em>.</p>
//
//<p><strong>Note</strong> that:</p>
//
//<ul> 
// <li>The valid operators are <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, and <code>'/'</code>.</li> 
// <li>Each operand may be an integer or another expression.</li> 
// <li>The division between two integers always <strong>truncates toward zero</strong>.</li> 
// <li>There will not be any division by zero.</li> 
// <li>The input represents a valid arithmetic expression in a reverse polish notation.</li> 
// <li>The answer and all the intermediate calculations can be represented in a <strong>32-bit</strong> integer.</li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> tokens = ["2","1","+","3","*"]
//<strong>Output:</strong> 9
//<strong>Explanation:</strong> ((2 + 1) * 3) = 9
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> tokens = ["4","13","5","/","+"]
//<strong>Output:</strong> 6
//<strong>Explanation:</strong> (4 + (13 / 5)) = 6
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//<strong>Output:</strong> 22
//<strong>Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= tokens.length &lt;= 10<sup>4</sup></code></li> 
// <li><code>tokens[i]</code> is either an operator: <code>"+"</code>, <code>"-"</code>, <code>"*"</code>, or <code>"/"</code>, or an integer in the range <code>[-200, 200]</code>.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>数组</li><li>数学</li></div></div><br><div><li>👍 723</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Evaluate Reverse Polish Notation
 * @author zhangjunhui1999
 */
public class P150_EvaluateReversePolishNotation{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P150_EvaluateReversePolishNotation().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
		Deque<Integer> stack = new ArrayDeque<>();
		for (String s : tokens) {
			if ("+".equals(s)) {        // leetcode 内置jdk的问题，不能使用==判断字符串是否相等
				stack.push(stack.pop() + stack.pop());      // 注意 - 和/ 需要特殊处理
			} else if ("-".equals(s)) {
				stack.push(-stack.pop() + stack.pop());
			} else if ("*".equals(s)) {
				stack.push(stack.pop() * stack.pop());
			} else if ("/".equals(s)) {
				int temp1 = stack.pop();
				int temp2 = stack.pop();
				stack.push(temp2 / temp1);
			} else {
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
