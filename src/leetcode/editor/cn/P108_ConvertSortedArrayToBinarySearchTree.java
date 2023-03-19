//<p>Given an integer array <code>nums</code> where the elements are sorted in <strong>ascending order</strong>, convert <em>it to a </em><span data-keyword="height-balanced"><strong><em>height-balanced</em></strong></span> <em>binary search tree</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree1.jpg" style="width: 302px; height: 222px;" /> 
//<pre>
//<strong>Input:</strong> nums = [-10,-3,0,5,9]
//<strong>Output:</strong> [0,-3,9,-10,null,5]
//<strong>Explanation:</strong> [0,-10,5,null,-3,null,9] is also accepted:
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg" style="width: 302px; height: 222px;" />
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree.jpg" style="width: 342px; height: 142px;" /> 
//<pre>
//<strong>Input:</strong> nums = [1,3]
//<strong>Output:</strong> [3,1]
//<strong>Explanation:</strong> [1,null,3] and [3,1] are both height-balanced BSTs.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
// <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
// <li><code>nums</code> is sorted in a <strong>strictly increasing</strong> order.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>树</li><li>二叉搜索树</li><li>数组</li><li>分治</li><li>二叉树</li></div></div><br><div><li>👍 1258</li><li>👎 0</li></div>

package leetcode.editor.cn;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree
 * @author zhangjunhui1999
 */
public class P108_ConvertSortedArrayToBinarySearchTree{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P108_ConvertSortedArrayToBinarySearchTree().new Solution();
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
    public TreeNode sortedArrayToBST(int[] nums) {
		int n = nums.length;
		if (n==0) return null;
		if (n==1)return new TreeNode(nums[0]);
		TreeNode root = new TreeNode(nums[n/2]);
		constructLeftTree(0,n/2-1, root, nums);
		constructRightTree(n/2+1,n-1,root,nums);
    	return root;
    }
    public void constructLeftTree(int left, int right, TreeNode parentNode, int[] nums) {
		if (left>right) return;
    	if(left==right) {
			TreeNode newNode = new TreeNode(nums[left]);
			parentNode.left = newNode;
			return;
		}
    	int mid = left + (right-left)/2;
		TreeNode newNode = new TreeNode(nums[mid]);
		parentNode.left = newNode;
    	constructLeftTree(left,mid-1,newNode,nums);
		constructRightTree(mid+1,right,newNode,nums);
    }
    public void constructRightTree(int left,int right,TreeNode parentNode, int nums[]) {
		if (left>right) return;
    	if(left==right) {
			TreeNode newNode = new TreeNode(nums[left]);
			parentNode.right = newNode;
			return;
		}
    	int mid = left+ (right-left)/2;
    	TreeNode newNode = new TreeNode(nums[mid]);
		parentNode.right = newNode;
    	constructLeftTree(left,mid-1,newNode,nums);
		constructRightTree(mid+1,right,newNode,nums);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
