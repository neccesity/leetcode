//<p>Given an <code>m x n</code> integers <code>matrix</code>, return <em>the length of the longest increasing path in </em><code>matrix</code>.</p>
//
//<p>From each cell, you can either move in four directions: left, right, up, or down. You <strong>may not</strong> move <strong>diagonally</strong> or move <strong>outside the boundary</strong> (i.e., wrap-around is not allowed).</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/05/grid1.jpg" style="width: 242px; height: 242px;" /> 
//<pre>
//<strong>Input:</strong> matrix = [[9,9,4],[6,6,8],[2,1,1]]
//<strong>Output:</strong> 4
//<strong>Explanation:</strong> The longest increasing path is <span><code>[1, 2, 6, 9]</code></span>.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/27/tmp-grid.jpg" style="width: 253px; height: 253px;" /> 
//<pre>
//<strong>Input:</strong> matrix = [[3,4,5],[3,2,6],[2,2,1]]
//<strong>Output:</strong> 4
//<strong>Explanation: </strong>The longest increasing path is <span><code>[3, 4, 5, 6]</code></span>. Moving diagonally is not allowed.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> matrix = [[1]]
//<strong>Output:</strong> 1
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>m == matrix.length</code></li> 
// <li><code>n == matrix[i].length</code></li> 
// <li><code>1 &lt;= m, n &lt;= 200</code></li> 
// <li><code>0 &lt;= matrix[i][j] &lt;= 2<sup>31</sup> - 1</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>深度优先搜索</li><li>广度优先搜索</li><li>图</li><li>拓扑排序</li><li>记忆化搜索</li><li>数组</li><li>动态规划</li><li>矩阵</li></div></div><br><div><li>👍 752</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Longest Increasing Path in a Matrix
 * @author zhangjunhui1999
 */
public class P329_LongestIncreasingPathInAMatrix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P329_LongestIncreasingPathInAMatrix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
		int m=matrix.length,n=matrix[0].length,ans=1;
		int cnt = 0;
		int vis[][] = new int[matrix.length][matrix[0].length];
		int v[][] = new int[matrix.length][matrix[0].length];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				ans = Math.max(ans,dfs(i,j,v,m,n,matrix,1,vis));
			}
		}
		return ans;
    }
    public boolean isValid(int x,int y,int m,int n,int matrix[][],int p,int q,int vis[][]) {
    	if(x>=0&&x<m&&y>=0&&y<n&&vis[x][y]==0&&matrix[x][y]>matrix[p][q]) return true;
    	return false;
	}
    public int dfs(int x,int y,int v[][],int m,int n,int matrix[][],int cnt,int vis[][]) {
    	if(v[x][y]!=0) return v[x][y];
    	vis[x][y]=1;
		if(isValid(x,y+1,m,n,matrix,x,y,vis)) v[x][y]=Math.max(v[x][y],cnt+dfs(x,y+1,v,m,n,matrix,cnt,vis));
		if(isValid(x,y-1,m,n,matrix,x,y,vis)) v[x][y]=Math.max(v[x][y],cnt+dfs(x,y-1,v,m,n,matrix,cnt,vis));
		if(isValid(x-1,y,m,n,matrix,x,y,vis)) v[x][y]=Math.max(v[x][y],cnt+dfs(x-1,y,v,m,n,matrix,cnt,vis));
		if(isValid(x+1,y,m,n,matrix,x,y,vis)) v[x][y]=Math.max(v[x][y],cnt+dfs(x+1,y,v,m,n,matrix,cnt,vis));
		vis[x][y]=0;
		v[x][y]=Math.max(v[x][y],cnt);
		return v[x][y];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
