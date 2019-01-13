package primaryAlgorithms.string;


/**
 * <div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="显示英文" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>给定两个字符串 <em>s</em> 和 <em>t</em> ，编写一个函数来判断 <em>t</em> 是否是 <em>s</em> 的一个字母异位词。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入:</strong> <em>s</em> = "anagram", <em>t</em> = "nagaram"
<strong>输出:</strong> true
</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:</strong> <em>s</em> = "rat", <em>t</em> = "car"
<strong>输出: </strong>false</pre>

<p><strong>说明:</strong><br>
你可以假设字符串只包含小写字母。</p>

<p><strong>进阶:</strong><br>
如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？</p>
</div></div>

 * @author lbr19
 *
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
    	// 长度不一样肯定不符合要求
    	if(s.length() != t.length())
    		return false;
    	
        int[] map = new int[26];
        // Arrays.fill(map, 0);
        
        for(char c : s.toCharArray()) {
        	map[c - 'a']++;
        }
        
        for(char c : t.toCharArray()) {
        	map[c - 'a']--;
        }
        
        for(int num : map) {
        	if(num != 0)
        		return false;
        }
        return true;
    }

}
