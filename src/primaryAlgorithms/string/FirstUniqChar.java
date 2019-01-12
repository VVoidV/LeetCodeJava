package primaryAlgorithms.string;

import java.util.*;


/**
 * <div class="content__eAC7"><div><p>����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��</p>

<p><strong>����:</strong></p>

<pre>s = "leetcode"
���� 0.

s = "loveleetcode",
���� 2.
</pre>

<p>&nbsp;</p>

<p><strong>ע�����</strong>�����Լٶ����ַ���ֻ����Сд��ĸ��</p>
</div></div>

 * @author lbr19
 *
 */
public class FirstUniqChar {
	/**
	 * ɨ��һ�飬��һ������洢ÿ����ĸ�ĳ������
	 * @param s
	 * @return
	 */
    public static int firstUniqChar0(String s) {
    	int[] map = new int[26];
    	char[] charArr = s.toCharArray();
    	Arrays.fill(map, -1);
    	
    	for(int i = 0; i < charArr.length; i++) {
    		int index = charArr[i] - 'a';
    		if(map[index] == -1) {
    			map[index] = i;
    		}
    		else if(map[index] == -2){
    			continue;
    		}
    		else {
    			map[index] = -2;
    		}
    	}
    	
    	int minIndex = Integer.MAX_VALUE;
    	boolean isValid = false;
    	for(int index : map) {
    		if(index >= 0) {
    			minIndex = minIndex < index ? minIndex : index;
    			isValid = true;
    		}
    	}
        return isValid ? minIndex : -1;
    }
    
    /**
     * ����string�ṩ�ķ�������������
     * @param s
     * @return
     */
    public int firstUniqChar1(String s) {
    int res = -1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                res = (res == -1 || res > index) ? index : res;
            }
        }
        return res;
    }
    
    public static void main(String args[]) {
    	firstUniqChar0("leetcode");
    }
}
