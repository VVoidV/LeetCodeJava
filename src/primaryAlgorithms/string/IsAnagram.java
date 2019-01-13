package primaryAlgorithms.string;


/**
 * <div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>���������ַ��� <em>s</em> �� <em>t</em> ����дһ���������ж� <em>t</em> �Ƿ��� <em>s</em> ��һ����ĸ��λ�ʡ�</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����:</strong> <em>s</em> = "anagram", <em>t</em> = "nagaram"
<strong>���:</strong> true
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����:</strong> <em>s</em> = "rat", <em>t</em> = "car"
<strong>���: </strong>false</pre>

<p><strong>˵��:</strong><br>
����Լ����ַ���ֻ����Сд��ĸ��</p>

<p><strong>����:</strong><br>
��������ַ������� unicode �ַ���ô�죿���ܷ������Ľⷨ��Ӧ�����������</p>
</div></div>

 * @author lbr19
 *
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
    	// ���Ȳ�һ���϶�������Ҫ��
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
