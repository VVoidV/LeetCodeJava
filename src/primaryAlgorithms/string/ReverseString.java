package primaryAlgorithms.string;

/**
 * <div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>��дһ���������������ǽ�������ַ�����ת������</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����: </strong>"hello"
<strong>���: </strong>"olleh"
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����: </strong>"A man, a plan, a canal: Panama"
<strong>���: </strong>"amanaP :lanac a ,nalp a ,nam A"</pre>
</div></div>

 * @author lbr19
 *
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] charArr = s.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        while(i < j){
            char tmp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = tmp;
            ++i;
            --j;
        }
        return new String(charArr);
    }
}
