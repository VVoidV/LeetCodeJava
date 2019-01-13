package primaryAlgorithms.string;

/**
 * <div><p>编写一个函数来查找字符串数组中的最长公共前缀。</p>

<p>如果不存在公共前缀，返回空字符串&nbsp;<code>""</code>。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入: </strong>["flower","flow","flight"]
<strong>输出:</strong> "fl"
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入: </strong>["dog","racecar","car"]
<strong>输出:</strong> ""
<strong>解释:</strong> 输入不存在公共前缀。
</pre>

<p><strong>说明:</strong></p>

<p>所有输入只包含小写字母&nbsp;<code>a-z</code>&nbsp;。</p>
</div>

 * @author lbr19
 *
 */
public class LongestCommonPrefix {
	/**
	 * 一列一列比较
	 * @param strs
	 * @return
	 *  
	 */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int i = 0;
        StringBuilder prefix = new StringBuilder();
Search:        
        while(true){
            char c;
            if(i < strs[0].length()){
                c = strs[0].charAt(i);
            }
            else{
                break Search;
            }
            
            for(int j = 1; j < strs.length; j++){
                String s = strs[j];
                if(i > s.length() - 1 || c != s.charAt(i)) break Search;
            }
            prefix.append(c);
            ++i;
        }
        
        return prefix.toString();
    }
    
}

/**
 * 分治法 参考官方解答。
 * @author lbr19
 *
 */
class Solution{
	
	public String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return "";    
	        return longestCommonPrefix(strs, 0 , strs.length - 1);
	}
	
	private String longestCommonPrefix(String[] strs, int l, int r) {
	    if (l == r) {
	        return strs[l];
	    }
	    else {
	        int mid = (l + r)/2;
	        String lcpLeft =   longestCommonPrefix(strs, l , mid);
	        String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
	        return commonPrefix(lcpLeft, lcpRight);
	   }
	}
	
	String commonPrefix(String left,String right) {
	    int min = Math.min(left.length(), right.length());       
	    for (int i = 0; i < min; i++) {
	        if ( left.charAt(i) != right.charAt(i) )
	            return left.substring(0, i);
	    }
	    return left.substring(0, min);
	}
}