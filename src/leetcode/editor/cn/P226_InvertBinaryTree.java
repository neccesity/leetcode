//<p>Given the <code>root</code> of a binary tree, invert the tree, and return <em>its root</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg" style="width: 500px; height: 165px;" /> 
//<pre>
//<strong>Input:</strong> root = [4,2,7,1,3,6,9]
//<strong>Output:</strong> [4,7,2,9,6,3,1]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg" style="width: 500px; height: 120px;" /> 
//<pre>
//<strong>Input:</strong> root = [2,1,3]
//<strong>Output:</strong> [2,3,1]
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> root = []
//<strong>Output:</strong> []
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li> 
// <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1545</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Invert Binary Tree
 * @author zhangjunhui1999
 */
public class P226_InvertBinaryTree{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P226_InvertBinaryTree().new Solution();
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
    public TreeNode invertTree(TreeNode root) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
