//<p>Given the <code>root</code> of a binary tree, return <em>the zigzag level order traversal of its nodes' values</em>. (i.e., from left to right, then right to left for the next level and alternate between).</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" /> 
//<pre>
//<strong>Input:</strong> root = [3,9,20,null,null,15,7]
//<strong>Output:</strong> [[3],[20,9],[15,7]]
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
// <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 750</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Binary Tree Zigzag Level Order Traversal
 * @author zhangjunhui1999
 */
public class P103_BinaryTreeZigzagLevelOrderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P103_BinaryTreeZigzagLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	if (root == null) return new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode currentNode = null;
		List<List<Integer>> zigZagOrder = new ArrayList<>();
		int levelSize, level = 0;
		queue.offer(root);
		while (!queue.isEmpty()) {
			levelSize = queue.size();
			List<Integer> subArrayList = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) {
				currentNode = queue.poll();
				if (currentNode.left!=null) queue.offer(currentNode.left);
				if (currentNode.right!=null) queue.offer(currentNode.right);
				subArrayList.add(currentNode.val);
			}
			if ((level&1) == 1) {
				Collections.reverse(subArrayList);
				zigZagOrder.add(subArrayList);
			} else {
				zigZagOrder.add(subArrayList);
			}
			level++;
		}
		return zigZagOrder;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
