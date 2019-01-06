package array;
import java.util.*;
/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>�����������飬��дһ���������������ǵĽ�����</p>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����: </strong>nums1 = [1,2,2,1], nums2 = [2,2]
<strong>���: </strong>[2,2]
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����: </strong>nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>���: </strong>[4,9]</pre>

<p><strong>˵����</strong></p>

<ul>
	<li>��������ÿ��Ԫ�س��ֵĴ�����Ӧ��Ԫ�������������г��ֵĴ���һ�¡�</li>
	<li>���ǿ��Բ�������������˳��</li>
</ul>

<p><strong><strong>����:</strong></strong></p>

<ul>
	<li>��������������Ѿ��ź����أ��㽫����Ż�����㷨��</li>
	<li>���&nbsp;<em>nums1&nbsp;</em>�Ĵ�С��&nbsp;<em>nums2&nbsp;</em>С�ܶ࣬���ַ������ţ�</li>
	<li>���&nbsp;<em>nums2&nbsp;</em>��Ԫ�ش洢�ڴ����ϣ������ڴ������޵ģ������㲻��һ�μ������е�Ԫ�ص��ڴ��У������ô�죿</li>
</ul>
</div></div></div>
 * @author lbr19
 *
 */

public class Intersect {
	/**
	 * ʹ��һ��map����¼���ֳ��ֵĴ����������װ�������
	 * @param nums1
	 * @param nums2
	 * @return
	 */
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] smallArr;  
        int[] bigArr;
        
        if(nums1.length > nums2.length) {
        	smallArr = nums2;
        	bigArr = nums1;
        }
        else {
        	smallArr = nums1;
        	bigArr = nums2;
        }
        HashMap<Integer, Integer> map = new HashMap<>(smallArr.length);
        for(int num : smallArr) {
        	Integer value = map.putIfAbsent(num, 1);
        	if(value != null) {
        		map.replace(num, ++value);
        	}
        }
        
        ArrayList<Integer> result = new ArrayList<>();  
        for(int num : bigArr) {
        	if( map.containsKey(num) ) {
        		int value = map.get(num);
        		if(value > 0) {
            		map.replace(num, --value);
            		result.add(num);
        		}

        	}
        }
        int[] resultarr = new int[result.size()];
        for(int i= 0 ; i < result.size(); i++) {
        	resultarr[i] = result.get(i); 
        }
        return resultarr;
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {4, 9, 5};
    	int[] nums2 = {9, 4, 9, 8, 4};
    	
    	int[] result = intersect(nums1,nums2);
    	System.out.println(Arrays.toString(result));
    }

}
