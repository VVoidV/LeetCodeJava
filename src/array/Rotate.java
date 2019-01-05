package array;
import java.util.*;

/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>����һ�����飬�������е�Ԫ�������ƶ�&nbsp;<em>k&nbsp;</em>��λ�ã�����&nbsp;<em>k&nbsp;</em>�ǷǸ�����</p>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����:</strong> <code>[1,2,3,4,5,6,7]</code> �� <em>k</em> = 3
<strong>���:</strong> <code>[5,6,7,1,2,3,4]</code>
<strong>����:</strong>
������ת 1 ��: <code>[7,1,2,3,4,5,6]</code>
������ת 2 ��: <code>[6,7,1,2,3,4,5]
</code>������ת 3 ��: <code>[5,6,7,1,2,3,4]</code>
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����:</strong> <code>[-1,-100,3,99]</code> �� <em>k</em> = 2
<strong>���:</strong> [3,99,-1,-100]
<strong>����:</strong> 
������ת 1 ��: [99,-1,-100,3]
������ת 2 ��: [3,99,-1,-100]</pre>

<p><strong>˵��:</strong></p>

<ul>
	<li>�������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣</li>
	<li>Ҫ��ʹ�ÿռ临�Ӷ�Ϊ&nbsp;O(1) ��ԭ���㷨��</li>
</ul>
</div></div></div>
 
 * 
 * @author lbr19
 *
 */
class RotateSolution {
    public void rotate(int[] nums, int k) {
    	// �����ƶ�������������ĳ���
    	k = k % nums.length;
    	// ��������ĳ���Ϊ 0,1ʱ�������κβ����� �ƶ�����Ϊ0ʱҲ���ò���
    	if(nums.length < 2 || k < 1 || k == nums.length) return;
    	
    	// ���������������εİ취���
        this.reverse(nums, 0, nums.length - 1);
        this.reverse(nums, k, nums.length - 1);
        this.reverse(nums, 0, k - 1);
        

    }
    
    public void reverse(int[] array, int begin, int end) {
    	int temp;
    	while(begin < end) {
    		temp = array[begin];
    		array[begin] = array[end];
    		array[end]  = temp;
    	}
    }
}

public class Rotate{
	public static void main(String[] args) {
		int[] arr = {1,2};
		System.out.println(Arrays.toString(arr));
//		RotateSolution solution = new RotateSolution();
//		solution.reverse(arr, 0, arr.length - 5);
//		System.out.println(Arrays.toString(arr));
		
		RotateSolution solution = new RotateSolution();
		solution.rotate(arr, 0);
		System.out.println(Arrays.toString(arr));
	}
}
