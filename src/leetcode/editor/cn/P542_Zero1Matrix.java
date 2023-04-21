//<p>Given an <code>m x n</code> binary matrix <code>mat</code>, return <em>the distance of the nearest </em><code>0</code><em> for each cell</em>.</p>
//
//<p>The distance between two adjacent cells is <code>1</code>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/01-1-grid.jpg" style="width: 253px; height: 253px;" /> 
//<pre>
//<strong>Input:</strong> mat = [[0,0,0],[0,1,0],[0,0,0]]
//<strong>Output:</strong> [[0,0,0],[0,1,0],[0,0,0]]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/01-2-grid.jpg" style="width: 253px; height: 253px;" /> 
//<pre>
//<strong>Input:</strong> mat = [[0,0,0],[0,1,0],[1,1,1]]
//<strong>Output:</strong> [[0,0,0],[0,1,0],[1,2,1]]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>m == mat.length</code></li> 
// <li><code>n == mat[i].length</code></li> 
// <li><code>1 &lt;= m, n &lt;= 10<sup>4</sup></code></li> 
// <li><code>1 &lt;= m * n &lt;= 10<sup>4</sup></code></li> 
// <li><code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.</li> 
// <li>There is at least one <code>0</code> in <code>mat</code>.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>广度优先搜索</li><li>数组</li><li>动态规划</li><li>矩阵</li></div></div><br><div><li>👍 853</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * 01 Matrix
 * @author zhangjunhui1999
 */
public class P542_Zero1Matrix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P542_Zero1Matrix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] updateMatrix(int[][] mat) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
