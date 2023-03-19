//<p>Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return <em>all <strong>root-to-leaf</strong> paths where the sum of the node values in the path equals </em><code>targetSum</code><em>. Each path should be returned as a list of the node <strong>values</strong>, not node references</em>.</p>
//
//<p>A <strong>root-to-leaf</strong> path is a path starting from the root and ending at any leaf node. A <strong>leaf</strong> is a node with no children.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsumii1.jpg" style="width: 500px; height: 356px;" /> 
//<pre>
//<strong>Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//<strong>Output:</strong> [[5,4,11,2],[5,8,4,5]]
//<strong>Explanation:</strong> There are two paths whose sum equals targetSum:
//5 + 4 + 11 + 2 = 22
//5 + 8 + 4 + 5 = 22
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" style="width: 212px; height: 181px;" /> 
//<pre>
//<strong>Input:</strong> root = [1,2,3], targetSum = 5
//<strong>Output:</strong> []
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> root = [1,2], targetSum = 0
//<strong>Output:</strong> []
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li> 
// <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li> 
// <li><code>-1000 &lt;= targetSum &lt;= 1000</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>回溯</li><li>二叉树</li></div></div><br><div><li>👍 927</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Path Sum II
 * @author zhangjunhui1999
 */
public class P113_PathSumIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P113_PathSumIi().new Solution();
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
	public List<List<Integer>> pathList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if(root==null) return pathList;
		int sum = 0;
		List<Integer> path = new ArrayList<>();
		path.add(root.val);
		dfs(root,targetSum,root.val,path);
		return pathList;
    }
	public void dfs(TreeNode currentNode, int targetSum, int sum,List<Integer> path) {
		if (currentNode.left == null && currentNode.right == null) {
			if (sum == targetSum) {
				List<Integer> newPath = new ArrayList<>(path);
				pathList.add(newPath);
				/*
				 Must create a new List to store into the answer to be returned
				 because the parameter List is updating all the time while the function processing
				 */
			}
			//if(path.size()>0)path.remove(path.size()-1);
			return;
		}
		if (currentNode.left != null) {
			path.add(currentNode.left.val);
			dfs(currentNode.left, targetSum, sum + currentNode.left.val,path);
			path.remove(path.size()-1);
		}
		if (currentNode.right != null) {
			path.add(currentNode.right.val);
			dfs(currentNode.right, targetSum, sum + currentNode.right.val,path);
			path.remove(path.size()-1);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
