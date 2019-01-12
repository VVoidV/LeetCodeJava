package primaryAlgorithms.string;

// import java.util.*;
/**
 * <div class="content__eAC7"><div><p>给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。</p>

<p><strong>说明：</strong>本题中，我们将空字符串定义为有效的回文串。</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入:</strong> "A man, a plan, a canal: Panama"
<strong>输出:</strong> true
</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:</strong> "race a car"
<strong>输出:</strong> false
</pre>
</div></div>

 * @author lbr19
 *
 */
public class IsPalindrome {
	/**
	 * 常规方法，跳过不需要的字符，转换成小写； 排名在50%…………
	 * @param s
	 * @return
	 */
    public static boolean isPalindrome(String s) {
    	if(s.isEmpty()) return true;
    	
        char[] arr = s.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
        	char lc, rc;
        	
        	while(left < right && !isAcceptedChar(arr[left])) 
        		left++;
        	lc = arr[left];
        	while(left < right && !isAcceptedChar(arr[right]))
        		right--;
        	rc = arr[right];
        	if(rc != lc)
        		return false;
        	left++;
        	right--;
        }
        return true;
    }
    
    private static boolean isAcceptedChar(char c) {
    	return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
    
    public static void main(String args[]) {
    	String s ="0P";
    	System.out.print(isPalindrome(s));
    }
}
