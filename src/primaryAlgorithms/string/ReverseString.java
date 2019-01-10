package primaryAlgorithms.string;

/**
 * <div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="显示英文" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>编写一个函数，其作用是将输入的字符串反转过来。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入: </strong>"hello"
<strong>输出: </strong>"olleh"
</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入: </strong>"A man, a plan, a canal: Panama"
<strong>输出: </strong>"amanaP :lanac a ,nalp a ,nam A"</pre>
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
