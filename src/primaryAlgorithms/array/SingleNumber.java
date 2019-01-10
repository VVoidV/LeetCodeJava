package primaryAlgorithms.array;

import java.util.*;

/**
 * 136. ֻ����һ�ε�����
 * <div class="content__eAC7"><div><p>����һ��<strong>�ǿ�</strong>�������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�</p>

<p><strong>˵����</strong></p>

<p>����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����</p>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����:</strong> [2,2,1]
<strong>���:</strong> 1
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����:</strong> [4,1,2,1,2]
<strong>���:</strong> 4</pre>
</div></div>
 * @author lbr19
 *
 */


public class SingleNumber {
	/**
	 * ����hashset�ҵ��ظ������ݣ����������Ӧ����O(n)ʱ�临�Ӷ�
	 * @param nums
	 * @return
	 */
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
         for(int num : nums){
             if(hashset.contains(num))
                 hashset.remove(num);
             else
                 hashset.add(num);
         }
         return hashset.iterator().next();
     }
    
    /**
     * ������жϣ�����������ʱ��Ҫ��
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums){
    	Arrays.sort(nums);
    	int len = nums.length;
    	for(int i = 1; i < len; i+=2) {
    		if(nums[i - 1] != nums[i])
    			return nums[i - 1];
    	}
    	return nums[len - 1];
    }
    
    /**
     * ����������㣬��������˳����Σ��ظ�������������Ϊȫ0�����ʣ�µľ��ǵ���������
     * @param nums
     * @return
     */
    public int singleNumber3(int[] nums){
    	for(int i = 1 ; i < nums.length; i++) {
    		nums[0] ^= nums[i];
    	}
    	return nums[0];
    }
}
