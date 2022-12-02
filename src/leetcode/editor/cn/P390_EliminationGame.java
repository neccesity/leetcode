//<p>列表 <code>arr</code> 由在范围 <code>[1, n]</code> 中的所有整数组成，并按严格递增排序。请你对 <code>arr</code> 应用下述算法：</p>
//
//<div class="original__bRMd"> 
// <div> 
//  <ul> 
//   <li>从左到右，删除第一个数字，然后每隔一个数字删除一个，直到到达列表末尾。</li> 
//   <li>重复上面的步骤，但这次是从右到左。也就是，删除最右侧的数字，然后剩下的数字每隔一个删除一个。</li> 
//   <li>不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。</li> 
//  </ul> 
// </div>
//</div>
//
//<p>给你整数 <code>n</code> ，返回 <code>arr</code> 最后剩下的数字。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 9
//<strong>输出：</strong>6
//<strong>解释：</strong>
//arr = [<strong><em>1</em></strong>, 2, <em><strong>3</strong></em>, 4, <em><strong>5</strong></em>, 6, <em><strong>7</strong></em>, 8, <em><strong>9</strong></em>]
//arr = [2, <em><strong>4</strong></em>, 6, <em><strong>8</strong></em>]
//arr = [<em><strong>2</strong></em>, 6]
//arr = [6]
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 1
//<strong>输出：</strong>1
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 10<sup>9</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>递归</li><li>数学</li></div></div><br><div><li>👍 297</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * 消除游戏
 * @author zhangjunhui1999
 */
public class P390_EliminationGame{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P390_EliminationGame().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastRemaining(int n) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
