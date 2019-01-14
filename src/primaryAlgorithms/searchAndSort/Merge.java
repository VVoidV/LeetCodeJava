package primaryAlgorithms.searchAndSort;

/**
 * <div><p>��������������������&nbsp;<em>nums1 </em>�� <em>nums2</em>���� <em>nums2 </em>�ϲ���&nbsp;<em>nums1&nbsp;</em>��<em>��</em>ʹ��&nbsp;<em>num1 </em>��Ϊһ���������顣</p>

<p><strong>˵��:</strong></p>

<ul>
	<li>��ʼ��&nbsp;<em>nums1</em> �� <em>nums2</em> ��Ԫ�������ֱ�Ϊ&nbsp;<em>m</em> �� <em>n</em>��</li>
	<li>����Լ���&nbsp;<em>nums1&nbsp;</em>���㹻�Ŀռ䣨�ռ��С���ڻ����&nbsp;<em>m + n</em>�������� <em>nums2</em> �е�Ԫ�ء�</li>
</ul>

<p><strong>ʾ��:</strong></p>

<pre><strong>����:</strong>
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

<strong>���:</strong>&nbsp;[1,2,2,3,5,6]</pre>
</div>

 * @author lbr19
 *
 */
public class Merge {
	/**
	 * 3ms 100%
	 * �Ӻ���ǰɨ�裬���ν��ϴ����������ȷ��λ���ϡ�
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;
        
        while( m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[index--] = nums1[m--];
            }
            else{
                nums1[index--] = nums2[n--];
            }
        }
        while(n > 0 ){
            nums1[index--] = nums2[n--];
        }
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1,2,3,0,0,0};
    	int[] nums2 = {2,5,6};
    	int m = 3;
    	int n = 3;
    	merge(nums1, m, nums2, n);
    }
}
