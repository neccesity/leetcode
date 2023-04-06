//<p>Given two integer arrays <code>preorder</code> and <code>inorder</code> where <code>preorder</code> is the preorder traversal of a binary tree and <code>inorder</code> is the inorder traversal of the same tree, construct and return <em>the binary tree</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree.jpg" style="width: 277px; height: 302px;" /> 
//<pre>
//<strong>Input:</strong> preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//<strong>Output:</strong> [3,9,20,null,null,15,7]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> preorder = [-1], inorder = [-1]
//<strong>Output:</strong> [-1]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= preorder.length &lt;= 3000</code></li> 
// <li><code>inorder.length == preorder.length</code></li> 
// <li><code>-3000 &lt;= preorder[i], inorder[i] &lt;= 3000</code></li> 
// <li><code>preorder</code> and <code>inorder</code> consist of <strong>unique</strong> values.</li> 
// <li>Each value of <code>inorder</code> also appears in <code>preorder</code>.</li> 
// <li><code>preorder</code> is <strong>guaranteed</strong> to be the preorder traversal of the tree.</li> 
// <li><code>inorder</code> is <strong>guaranteed</strong> to be the inorder traversal of the tree.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>数组</li><li>哈希表</li><li>分治</li><li>二叉树</li></div></div><br><div><li>👍 1902</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal
 * @author zhangjunhui1999
 */
public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder.length == 1) return new TreeNode(preorder[0]);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
