//<p>A game is played by a cat and a mouse named Cat and Mouse.</p>
//
//<p>The environment is represented by a <code>grid</code> of size <code>rows x cols</code>, where each element is a wall, floor, player (Cat, Mouse), or food.</p>
//
//<ul> 
// <li>Players are represented by the characters <code>'C'</code>(Cat)<code>,'M'</code>(Mouse).</li> 
// <li>Floors are represented by the character <code>'.'</code> and can be walked on.</li> 
// <li>Walls are represented by the character <code>'#'</code> and cannot be walked on.</li> 
// <li>Food is represented by the character <code>'F'</code> and can be walked on.</li> 
// <li>There is only one of each character <code>'C'</code>, <code>'M'</code>, and <code>'F'</code> in <code>grid</code>.</li> 
//</ul>
//
//<p>Mouse and Cat play according to the following rules:</p>
//
//<ul> 
// <li>Mouse <strong>moves first</strong>, then they take turns to move.</li> 
// <li>During each turn, Cat and Mouse can jump in one of the four directions (left, right, up, down). They cannot jump over the wall nor outside of the <code>grid</code>.</li> 
// <li><code>catJump, mouseJump</code> are the maximum lengths Cat and Mouse can jump at a time, respectively. Cat and Mouse can jump less than the maximum length.</li> 
// <li>Staying in the same position is allowed.</li> 
// <li>Mouse can jump over Cat.</li> 
//</ul>
//
//<p>The game can end in 4 ways:</p>
//
//<ul> 
// <li>If Cat occupies the same position as Mouse, Cat wins.</li> 
// <li>If Cat reaches the food first, Cat wins.</li> 
// <li>If Mouse reaches the food first, Mouse wins.</li> 
// <li>If Mouse cannot get to the food within 1000 turns, Cat wins.</li> 
//</ul>
//
//<p>Given a <code>rows x cols</code> matrix <code>grid</code> and two integers <code>catJump</code> and <code>mouseJump</code>, return <code>true</code><em> if Mouse can win the game if both Cat and Mouse play optimally, otherwise return </em><code>false</code>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/09/12/sample_111_1955.png" style="width: 580px; height: 239px;" /> 
//<pre>
//<strong>Input:</strong> grid = ["####F","#C...","M...."], catJump = 1, mouseJump = 2
//<strong>Output:</strong> true
//<strong>Explanation:</strong> Cat cannot catch Mouse on its turn nor can it get the food before Mouse.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/09/12/sample_2_1955.png" style="width: 580px; height: 175px;" /> 
//<pre>
//<strong>Input:</strong> grid = ["M.C...F"], catJump = 1, mouseJump = 4
//<strong>Output:</strong> true
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> grid = ["M.C...F"], catJump = 1, mouseJump = 3
//<strong>Output:</strong> false
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>rows == grid.length</code></li> 
// <li><code>cols = grid[i].length</code></li> 
// <li><code>1 &lt;= rows, cols &lt;= 8</code></li> 
// <li><code>grid[i][j]</code> consist only of characters <code>'C'</code>, <code>'M'</code>, <code>'F'</code>, <code>'.'</code>, and <code>'#'</code>.</li> 
// <li>There is only one of each character <code>'C'</code>, <code>'M'</code>, and <code>'F'</code> in <code>grid</code>.</li> 
// <li><code>1 &lt;= catJump, mouseJump &lt;= 8</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>图</li><li>拓扑排序</li><li>记忆化搜索</li><li>数组</li><li>数学</li><li>动态规划</li><li>博弈</li><li>矩阵</li></div></div><br><div><li>👍 164</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Cat and Mouse II
 * @author zhangjunhui1999
 */
public class P1728_CatAndMouseIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1728_CatAndMouseIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
