package primaryAlgorithms.string;

/**
 * <div><p>����������һ���������У��������е�������˳����б������õ���һ��������ǰ�������£�</p>

<pre>1.     1
2.     11
3.     21
4.     1211
5.     111221
</pre>

<p><code>1</code>&nbsp;������&nbsp;&nbsp;<code>"one 1"</code>&nbsp;&nbsp;(<code>"һ��һ"</code>) , ��&nbsp;<code>11</code>��<br>
<code>11</code> ������&nbsp;<code>"two 1s"</code>&nbsp;(<code>"����һ"</code>��, ��&nbsp;<code>21</code>��<br>
<code>21</code> ������&nbsp;<code>"one 2"</code>, &nbsp;"<code>one 1"</code>&nbsp;��<code>"һ����"</code>&nbsp;,&nbsp;&nbsp;<code>"һ��һ"</code>)&nbsp;, ��&nbsp;<code>1211</code>��</p>

<p>����һ�������� <em>n</em>��1 ��&nbsp;<em>n</em>&nbsp;�� 30��������������еĵ� <em>n</em> �</p>

<p>ע�⣺����˳�򽫱�ʾΪһ���ַ�����</p>

<p>&nbsp;</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����:</strong> 1
<strong>���:</strong> "1"
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����:</strong> 4
<strong>���:</strong> "1211"
</pre>
</div>

 * @author lbr19
 *
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String str = "1";
        if(n == 1){
            return str;
        }
        while(n > 1){
            str = count(str);
            n--;
        }
        return str;
    }
    
    private String count(String s){
        StringBuilder next = new StringBuilder();
        int i = 0;
        
        while(i < s.length()){
            char c = s.charAt(i);
            int count = 1;
            int j = i+1;
            for(; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            next.append(Integer.toString(count) + c);
            i = j;
        }
        return next.toString();
    }
}



