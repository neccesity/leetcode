//<p>给你两棵二叉树的根节点 <code>p</code> 和 <code>q</code> ，编写一个函数来检验这两棵树是否相同。</p>
//
//<p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg" style="width: 622px; height: 182px;" /> 
//<pre>
//<strong>输入：</strong>p = [1,2,3], q = [1,2,3]
//<strong>输出：</strong>true
//</pre>
//
//<p><strong>示例 2：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg" style="width: 382px; height: 182px;" /> 
//<pre>
//<strong>输入：</strong>p = [1,2], q = [1,null,2]
//<strong>输出：</strong>false
//</pre>
//
//<p><strong>示例 3：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg" style="width: 622px; height: 182px;" /> 
//<pre>
//<strong>输入：</strong>p = [1,2,1], q = [1,1,2]
//<strong>输出：</strong>false
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li>两棵树上的节点数目都在范围 <code>[0, 100]</code> 内</li> 
// <li><code>-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 933</li><li>👎 0</li></div>

package leetcode.editor.cn;

import javax.swing.tree.TreeNode;

/**
 * 相同的树
 * @author zhangjunhui1999
 */
public class P100_SameTree{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P100_SameTree().new Solution();
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p==null && q==null) return true;
    	if (p==null && q!=null) return false;
    	if (p!=null && q==null) return false;
    	if (p.val !=q.val) return false;
    	if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
    	return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
