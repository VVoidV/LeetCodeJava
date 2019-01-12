package primaryAlgorithms.string;

// import java.util.*;
/**
 * <div class="content__eAC7"><div><p>����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��</p>

<p><strong>˵����</strong>�����У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���</p>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����:</strong> "A man, a plan, a canal: Panama"
<strong>���:</strong> true
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����:</strong> "race a car"
<strong>���:</strong> false
</pre>
</div></div>

 * @author lbr19
 *
 */
public class IsPalindrome {
	/**
	 * ���淽������������Ҫ���ַ���ת����Сд�� ������50%��������
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
