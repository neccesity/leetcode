//<p>Given two strings <code>s</code> and <code>t</code> of lengths <code>m</code> and <code>n</code> respectively, return <em>the <strong>minimum window</strong></em> <span data-keyword="substring-nonempty"><strong><em>substring</em></strong></span><em> of </em><code>s</code><em> such that every character in </em><code>t</code><em> (<strong>including duplicates</strong>) is included in the window</em>. If there is no such substring, return <em>the empty string </em><code>""</code>.</p>
//
//<p>The testcases will be generated such that the answer is <strong>unique</strong>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "ADOBECODEBANC", t = "ABC"
//<strong>Output:</strong> "BANC"
//<strong>Explanation:</strong> The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "a", t = "a"
//<strong>Output:</strong> "a"
//<strong>Explanation:</strong> The entire string s is the minimum window.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = "a", t = "aa"
//<strong>Output:</strong> ""
//<strong>Explanation:</strong> Both 'a's from t must be included in the window.
//Since the largest window of s only has one 'a', return empty string.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>m == s.length</code></li> 
// <li><code>n == t.length</code></li> 
// <li><code>1 &lt;= m, n &lt;= 10<sup>5</sup></code></li> 
// <li><code>s</code> and <code>t</code> consist of uppercase and lowercase English letters.</li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong>Follow up:</strong> Could you find an algorithm that runs in <code>O(m + n)</code> time?</p>
//
//<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 2459</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Minimum Window Substring
 * @author zhangjunhui1999
 */
public class P76_MinimumWindowSubstring{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P76_MinimumWindowSubstring().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
    	//if(s.equals(t))return t;
		int m=s.length(), n=t.length();
		int cnt[] = new int[55],total = 0,flag=0;
		int vis[] = new int[55];
		char c;
		int number=0;
		for(int i=0;i<n;i++) {
			c = t.charAt(i);
			if(c>='a'&&c<='z') {
				if(cnt[c-'a']==0)number++;
				cnt[c-'a']++;
			}
			else {
				if(cnt[c-'A'+26]==0)number++;
				cnt[c-'A'+26]++;
			}
		}
		int l=0, r=0,index;
		int currentCount[] = new int[55];
		String minWindow = new String(s);
		while(r<m) {
			c=s.charAt(r);
			if(c>='a'&&c<='z') {
				index=c-'a';
			} else {
				index=c-'A'+26;
			}
			currentCount[index]++;
			if(cnt[index]!=0&&currentCount[index]>=cnt[index]&&vis[index]==0) {
				total++;
				vis[index]=1;
			}
			if(total>=number) {
				if(minWindow.length()>=(r-l+1)) {
					minWindow=s.substring(l,r+1);
					flag=1;
					//return s.substring(l,r+1);
				}
			}
			//if(l==1) return s.substring(l+1,r+1);
			while(l<r&&total>=number) {
				//if(l<r) return s.substring(l+2,r+1);
				//return s.substring(l,r+1);
				c=s.charAt(l);
				if(c>='a'&&c<='z') {
					index=c-'a';
				} else {
					index=c-'A'+26;
				}
				l++;
				currentCount[index]--;
				if((vis[index]==1&&currentCount[index]>=cnt[index])||cnt[index]==0) {
					if(minWindow.length()>=(r-l+1)) {
						minWindow=s.substring(l,r+1);
						flag=1;
					}
				}
				if(vis[index]==1&&currentCount[index]<cnt[index]) {
					total--;
					vis[index]=0;
				}
				if(total<number) break;
			}
			r++;
		}
		if(flag==0) return "";//s.substring(l,r);
		return minWindow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
