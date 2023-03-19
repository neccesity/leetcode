//<p>Given an integer <code>n</code>, return <em>all the structurally unique <strong>BST'</strong>s (binary search trees), which has exactly </em><code>n</code><em> nodes of unique values from</em> <code>1</code> <em>to</em> <code>n</code>. Return the answer in <strong>any order</strong>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/uniquebstn3.jpg" style="width: 600px; height: 148px;" /> 
//<pre>
//<strong>Input:</strong> n = 3
//<strong>Output:</strong> [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> n = 1
//<strong>Output:</strong> [[1]]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 8</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>二叉搜索树</li><li>动态规划</li><li>回溯</li><li>二叉树</li></div></div><br><div><li>👍 1395</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Unique Binary Search Trees II
 * @author zhangjunhui1999
 */
public class P95_UniqueBinarySearchTreesIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P95_UniqueBinarySearchTreesIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public List<TreeNode> roots = new ArrayList<>();
	public List<List<Integer>> BSTs = new ArrayList<>();
	public int[] vis = new int[10];
    public List<TreeNode> generateTrees(int n) {
    	if (n==0) return null;
    	int number = 0;
		for (int i = 1; i <= n; i++) {
			TreeNode root = new TreeNode(i);
			vis[i]=1;
			dfs(root, root,i,vis, number+1, n);
			vis[i]=0;
		}
		return BSTs;
    }

    public void dfs(TreeNode root,TreeNode currentNode, int x,int vis[], int number,int n) {
		if (number==n) {
			BSTs.add(BST);
			return;
		}
		if(currentNode.left==null) {
			for (int i = 1; i < x; i++) {
				if (vis[i]==1) continue;
				else {
					TreeNode newNode = new TreeNode(i);
					currentNode.left = newNode;
					vis[i]=1;
					dfs(root,currentNode,i,vis,number+1,n);
					vis[i]=0;
					currentNode.left=null;
				}
			}
		}
		if (currentNode.right==null) {
			for (int i = x+1; i <=n; i++) {
				if (vis[i] == 1) continue;
				else {
					TreeNode newNode = new TreeNode(i);
					currentNode.right = newNode;
					vis[i] = 1;
					dfs(root, currentNode,i,vis,number+1,n);
					vis[i] = 0;
					currentNode.right = null;
				}
			}
		}


		//currentNode.left = currentNode.right = null;

		return;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
