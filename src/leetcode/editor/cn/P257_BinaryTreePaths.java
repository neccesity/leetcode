//<p>Given the <code>root</code> of a binary tree, return <em>all root-to-leaf paths in <strong>any order</strong></em>.</p>
//
//<p>A <strong>leaf</strong> is a node with no children.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg" style="width: 207px; height: 293px;" /> 
//<pre>
//<strong>Input:</strong> root = [1,2,3,null,5]
//<strong>Output:</strong> ["1-&gt;2-&gt;5","1-&gt;3"]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> root = [1]
//<strong>Output:</strong> ["1"]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the tree is in the range <code>[1, 100]</code>.</li> 
// <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>字符串</li><li>回溯</li><li>二叉树</li></div></div><br><div><li>👍 923</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Paths
 * @author zhangjunhui1999
 */
public class P257_BinaryTreePaths{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P257_BinaryTreePaths().new Solution();
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
	public List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
		String path = String.valueOf(root.val);
    	dfs(root,root,path);
		return paths;
    }
    public void dfs(TreeNode root,TreeNode currentNode,String path) {
    	if (root!=currentNode) {
			path += "->";
			path += String.valueOf(currentNode.val);
		}
    	if (currentNode.left==null&&currentNode.right==null) {
    		paths.add(new String(path));
		}
    	if (currentNode.left!=null)dfs(root,currentNode.left,path);
    	if (currentNode.right!=null)dfs(root,currentNode.right,path);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
