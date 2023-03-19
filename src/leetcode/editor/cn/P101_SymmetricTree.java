//<p>Given the <code>root</code> of a binary tree, <em>check whether it is a mirror of itself</em> (i.e., symmetric around its center).</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/symtree1.jpg" style="width: 354px; height: 291px;" /> 
//<pre>
//<strong>Input:</strong> root = [1,2,2,3,4,4,3]
//<strong>Output:</strong> true
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/symtree2.jpg" style="width: 308px; height: 258px;" /> 
//<pre>
//<strong>Input:</strong> root = [1,2,2,null,3,null,3]
//<strong>Output:</strong> false
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li> 
// <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
//</ul>
//
//<p>&nbsp;</p> 
//<strong>Follow up:</strong> Could you solve it both recursively and iteratively?
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 2326</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;

/**
 * Symmetric Tree
 * @author zhangjunhui1999
 */
public class P101_SymmetricTree{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P101_SymmetricTree().new Solution();
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
    public boolean isSymmetric(TreeNode root) {
		if (root.left==null && root.right!=null) return false;
		if (root.left==null && root.right==null) return true;
		if (root.left!=null && root.right==null) return false;
		if (isSymmetricTree(root.left, root.right)) return true;
		return false;
    }

    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
    	if (p.val != q.val) return false;
		if (p.left==null && q.right!=null) return false;
		if (p.left==null && q.right==null && p.right==null && q.left==null) return true;
		if (p.left!=null && q.right==null) return false;
		if (p.right==null && q.left!=null) return false;
		if (p.right!=null && q.left==null) return false;
		if (p.left!=null && q.right!=null && p.right!=null && q.left!=null) return isSymmetricTree(p.left, q.right) & isSymmetricTree(p.right, q.left);
		if (p.left!=null && q.right!=null) return isSymmetricTree(p.left, q.right);
		if (p.right!=null && q.left!=null) return isSymmetricTree(p.right, q.left);
		return false;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
