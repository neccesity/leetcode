//<p>设计一个算法收集某些股票的每日报价，并返回该股票当日价格的 <strong>跨度</strong> 。</p>
//
//<p>当日股票价格的 <strong>跨度</strong> 被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。</p>
//
//<ul> 
// <li> <p>例如，如果未来 7 天股票的价格是 <code>[100,80,60,70,60,75,85]</code>，那么股票跨度将是 <code>[1,1,1,2,1,4,6]</code> 。</p> </li> 
//</ul>
//
//<p>实现 <code>StockSpanner</code> 类：</p>
//
//<ul> 
// <li><code>StockSpanner()</code> 初始化类对象。</li> 
// <li><code>int next(int price)</code> 给出今天的股价 <code>price</code> ，返回该股票当日价格的 <strong>跨度</strong> 。</li> 
//</ul>
//
//<p>&nbsp;</p>
//
//<p><strong class="example">示例：</strong></p>
//
//<pre>
//<strong>输入</strong>：
//["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
//[[], [100], [80], [60], [70], [60], [75], [85]]
//<strong>输出</strong>：
//[null, 1, 1, 1, 2, 1, 4, 6]
//
//<strong>解释：</strong>
//StockSpanner stockSpanner = new StockSpanner();
//stockSpanner.next(100); // 返回 1
//stockSpanner.next(80);  // 返回 1
//stockSpanner.next(60);  // 返回 1
//stockSpanner.next(70);  // 返回 2
//stockSpanner.next(60);  // 返回 1
//stockSpanner.next(75);  // 返回 4 ，因为截至今天的最后 4 个股价 (包括今天的股价 75) 都小于或等于今天的股价。
//stockSpanner.next(85);  // 返回 6
//</pre>
//
//&nbsp;
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= price &lt;= 10<sup>5</sup></code></li> 
// <li>最多调用 <code>next</code> 方法 <code>10<sup>4</sup></code> 次</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>设计</li><li>数据流</li><li>单调栈</li></div></div><br><div><li>👍 302</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.Stack;

/**
 * 股票价格跨度
 * @author zhangjunhui1999
 */
public class P901_OnlineStockSpan{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P901_OnlineStockSpan().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class StockSpanner {
    Stack<Integer> stack;
    int num;
    int span[];
    int prices[];
    public StockSpanner() {
        stack = new Stack<>();
        num = 0;
        span = new int[10005];
        prices = new int[10005];
    }
    
    public int next(int price) {
        span[num] = 1;
        prices[num] = price;
        while (!stack.isEmpty() && price >= prices[stack.peek()]) {
            span[num] += span[stack.pop()];
        }
        stack.push(num);
        return span[num++];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
