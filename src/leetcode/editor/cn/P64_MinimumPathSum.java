//<p>Given a <code>m x n</code> <code>grid</code> filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.</p>
//
//<p><strong>Note:</strong> You can only move either down or right at any point in time.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" style="width: 242px; height: 242px;" /> 
//<pre>
//<strong>Input:</strong> grid = [[1,3,1],[1,5,1],[4,2,1]]
//<strong>Output:</strong> 7
//<strong>Explanation:</strong> Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> grid = [[1,2,3],[4,5,6]]
//<strong>Output:</strong> 12
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>m == grid.length</code></li> 
// <li><code>n == grid[i].length</code></li> 
// <li><code>1 &lt;= m, n &lt;= 200</code></li> 
// <li><code>0 &lt;= grid[i][j] &lt;= 100</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>数组</li><li>动态规划</li><li>矩阵</li></div></div><br><div><li>👍 1481</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Minimum Path Sum
 * @author zhangjunhui1999
 */
public class P64_MinimumPathSum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P64_MinimumPathSum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
		int f[][] = new int[205][205];
		int m = grid.length, n = grid[0].length;
		for(int i=0;i<=m;i++) f[i][0]=60000;
		for(int i=0;i<=n;i++) f[0][i]=60000;
		f[0][0]=f[0][1]=f[1][0]=0;
		for (int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				f[i][j]=Math.min(f[i-1][j]+grid[i-1][j-1], f[i][j-1]+grid[i-1][j-1]);
			}
		}
		return f[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
