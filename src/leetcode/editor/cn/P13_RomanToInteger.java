//<p>Roman numerals are represented by seven different symbols:&nbsp;<code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.</p>
//
//<pre>
//<strong>Symbol</strong>       <strong>Value</strong>
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000</pre>
//
//<p>For example,&nbsp;<code>2</code> is written as <code>II</code>&nbsp;in Roman numeral, just two ones added together. <code>12</code> is written as&nbsp;<code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.</p>
//
//<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>
//
//<ul> 
// <li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.&nbsp;</li> 
// <li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.&nbsp;</li> 
// <li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li> 
//</ul>
//
//<p>Given a roman numeral, convert it to an integer.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "III"
//<strong>Output:</strong> 3
//<strong>Explanation:</strong> III = 3.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "LVIII"
//<strong>Output:</strong> 58
//<strong>Explanation:</strong> L = 50, V= 5, III = 3.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "MCMXCIV"
//<strong>Output:</strong> 1994
//<strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>1 &lt;= s.length &lt;= 15</code></li> 
// <li><code>s</code> contains only&nbsp;the characters <code>('I', 'V', 'X', 'L', 'C', 'D', 'M')</code>.</li> 
// <li>It is <strong>guaranteed</strong>&nbsp;that <code>s</code> is a valid roman numeral in the range <code>[1, 3999]</code>.</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>哈希表</li><li>数学</li><li>字符串</li></div></div><br><div><li>👍 2296</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 * @author zhangjunhui1999
 */
public class P13_RomanToInteger{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P13_RomanToInteger().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int currentDigit, nextDigit,sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			currentDigit = map.get(s.charAt(i));
			nextDigit = map.get(s.charAt(i+1));
			if (nextDigit > currentDigit) {
				sum += nextDigit - currentDigit;
				i++;
			} else {
				sum += currentDigit;
			}
		}
		if (s.length() == 1) {
			return map.get(s.charAt(0));
		} else {
			currentDigit = map.get(s.charAt(s.length()-2));
			nextDigit = map.get(s.charAt(s.length()-1));
			if (currentDigit >= nextDigit) {
				sum += nextDigit;
			}
		}
		return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
