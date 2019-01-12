package primaryAlgorithms.string;

import java.util.*;


/**
 * <div class="content__eAC7"><div><p>给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。</p>

<p><strong>案例:</strong></p>

<pre>s = "leetcode"
返回 0.

s = "loveleetcode",
返回 2.
</pre>

<p>&nbsp;</p>

<p><strong>注意事项：</strong>您可以假定该字符串只包含小写字母。</p>
</div></div>

 * @author lbr19
 *
 */
public class FirstUniqChar {
	/**
	 * 扫描一遍，用一个数组存储每个字母的出现情况
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
     * 利用string提供的方法，反而更快
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
