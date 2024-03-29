//<p>In the "100 game" two players take turns adding, to a running total, any integer from <code>1</code> to <code>10</code>. The player who first causes the running total to <strong>reach or exceed</strong> 100 wins.</p>
//
//<p>What if we change the game so that players <strong>cannot</strong> re-use integers?</p>
//
//<p>For example, two players might take turns drawing from a common pool of numbers from 1 to 15 without replacement until they reach a total &gt;= 100.</p>
//
//<p>Given two integers <code>maxChoosableInteger</code> and <code>desiredTotal</code>, return <code>true</code> if the first player to move can force a win, otherwise, return <code>false</code>. Assume both players play <strong>optimally</strong>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 11
//<strong>Output:</strong> false
//<strong>Explanation:</strong>
//No matter which integer the first player choose, the first player will lose.
//The first player can choose an integer from 1 up to 10.
//If the first player choose 1, the second player can only choose integers from 2 up to 10.
//The second player will win by choosing 10 and get a total = 11, which is &gt;= desiredTotal.
//Same with other integers chosen by the first player, the second player will always win.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 0
//<strong>Output:</strong> true
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 1
//<strong>Output:</strong> true
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= maxChoosableInteger &lt;= 20</code></li> 
// <li><code>0 &lt;= desiredTotal &lt;= 300</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>位运算</li><li>记忆化搜索</li><li>数学</li><li>动态规划</li><li>状态压缩</li><li>博弈</li></div></div><br><div><li>👍 502</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Can I Win
 * @author zhangjunhui1999
 */
public class P464_CanIWin{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P464_CanIWin().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
