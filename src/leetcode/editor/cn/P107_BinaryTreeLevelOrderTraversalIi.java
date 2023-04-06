//<p>Given the <code>root</code> of a binary tree, return <em>the bottom-up level order traversal of its nodes' values</em>. (i.e., from left to right, level by level from leaf to root).</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" /> 
//<pre>
//<strong>Input:</strong> root = [3,9,20,null,null,15,7]
//<strong>Output:</strong> [[15,7],[9,20],[3]]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> root = [1]
//<strong>Output:</strong> [[1]]
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
// <li>The number of nodes in the tree is in the range <code>[0, 2000]</code>.</li> 
// <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 667</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Binary Tree Level Order Traversal II
 * @author zhangjunhui1999
 */
public class P107_BinaryTreeLevelOrderTraversalIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P107_BinaryTreeLevelOrderTraversalIi().new Solution();
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) return new ArrayList<>();
		TreeNode currentNode = null;
		List<List<Integer>> arrayList = new ArrayList<>();
		List<Integer> subArraylist = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		subArraylist.add(root.val);
		arrayList.add(subArraylist);
		int number;
		while (!queue.isEmpty()) {
			number = queue.size();
			subArraylist = new ArrayList<>();
			for (int i = 0; i < number; i++) {
				currentNode = queue.poll();
				if (currentNode.left!=null) {
					subArraylist.add(currentNode.left.val);
					queue.offer(currentNode.left);
				}
				if (currentNode.right!=null) {
					subArraylist.add(currentNode.right.val);
					queue.offer(currentNode.right);
				}
			}
			if (subArraylist.size()!=0) arrayList.add(subArraylist);
		}
		Collections.reverse(arrayList);
		return arrayList;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
