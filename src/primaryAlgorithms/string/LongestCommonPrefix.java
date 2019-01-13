package primaryAlgorithms.string;

/**
 * <div><p>��дһ�������������ַ��������е������ǰ׺��</p>

<p>��������ڹ���ǰ׺�����ؿ��ַ���&nbsp;<code>""</code>��</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����: </strong>["flower","flow","flight"]
<strong>���:</strong> "fl"
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����: </strong>["dog","racecar","car"]
<strong>���:</strong> ""
<strong>����:</strong> ���벻���ڹ���ǰ׺��
</pre>

<p><strong>˵��:</strong></p>

<p>��������ֻ����Сд��ĸ&nbsp;<code>a-z</code>&nbsp;��</p>
</div>

 * @author lbr19
 *
 */
public class LongestCommonPrefix {
	/**
	 * һ��һ�бȽ�
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
 * ���η� �ο��ٷ����
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