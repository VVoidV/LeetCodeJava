package primaryAlgorithms.searchAndSort;
/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>���ǲ�Ʒ����Ŀǰ���ڴ���һ���Ŷӿ����µĲ�Ʒ�����ҵ��ǣ���Ĳ�Ʒ�����°汾û��ͨ��������⡣����ÿ���汾���ǻ���֮ǰ�İ汾�����ģ����Դ���İ汾֮������а汾���Ǵ�ġ�</p>

<p>�������� <code>n</code> ���汾 <code>[1, 2, ..., n]</code>�������ҳ�����֮�����а汾����ĵ�һ������İ汾��</p>

<p>�����ͨ������&nbsp;<code>bool isBadVersion(version)</code>&nbsp;�ӿ����жϰ汾�� <code>version</code> �Ƿ��ڵ�Ԫ�����г���ʵ��һ�����������ҵ�һ������İ汾����Ӧ�þ������ٶԵ��� API �Ĵ�����</p>

<p><strong>ʾ��:</strong></p>

<pre>���� n = 5������ version = 4 �ǵ�һ������İ汾��

<code>���� isBadVersion(3) -&gt; false
���� isBadVersion(5)&nbsp;-&gt; true
���� isBadVersion(4)&nbsp;-&gt; true

���ԣ�4 �ǵ�һ������İ汾��&nbsp;</code></pre>
</div></div></div>

 * @author lbr19
 *
 */

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
public class FirstBadVersion extends VersionControl{
    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;

        while(min < max){
            int mid = min + ((max - min) >> 1);
            boolean isBad = isBadVersion(mid);
            if(isBad){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }
}

class VersionControl{
	int badVersion = 4;
	boolean isBadVersion(int n) {
		if(n >= badVersion) {
			return true;
		}else {
			return false;
		}
	}
}
