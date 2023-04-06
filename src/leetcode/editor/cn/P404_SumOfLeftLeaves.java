//<p>Given the <code>root</code> of a binary tree, return <em>the sum of all left leaves.</em></p>
//
//<p>A <strong>leaf</strong> is a node with no children. A <strong>left leaf</strong> is a leaf that is the left child of another node.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/leftsum-tree.jpg" style="width: 277px; height: 302px;" /> 
//<pre>
//<strong>Input:</strong> root = [3,9,20,null,null,15,7]
//<strong>Output:</strong> 24
//<strong>Explanation:</strong> There are two left leaves in the binary tree, with values 9 and 15 respectively.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> root = [1]
//<strong>Output:</strong> 0
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li> 
// <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 580</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;

/**
 * Sum of Left Leaves
 * @author zhangjunhui1999
 */
public class P404_SumOfLeftLeaves{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P404_SumOfLeftLeaves().new Solution();
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
	public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
    	dfs(root,2);
    	return sum;
    }
    public void dfs(TreeNode currentNode,int side) {
    	if (currentNode.left==null&&currentNode.right==null) {
    		if (side==0) sum+=currentNode.val;
			return;
    	}
    	if(currentNode.left!=null)dfs(currentNode.left,0);
    	if(currentNode.right!=null)dfs(currentNode.right,1);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
