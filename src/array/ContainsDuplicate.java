package array;

import java.util.*;

/**
 * <div><p>����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�</p>

<p>����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��</p>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����:</strong> [1,2,3,1]
<strong>���:</strong> true</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����: </strong>[1,2,3,4]
<strong>���:</strong> false</pre>

<p><strong>ʾ��&nbsp;3:</strong></p>

<pre><strong>����: </strong>[1,1,1,3,3,4,3,2,4,2]
<strong>���:</strong> true</pre>
</div>

 * @author lbr19
 *
 */
class Solution {

	/**
	 * ��������ɨ�裬���ڵ���Ⱦ��ظ���
	 * @param nums
	 * @return
	 */
    public boolean containsDuplicate(int[] nums) {
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length - 1; i++) {
    		if(nums[i] == nums[i + 1]) return true;
    	}
    	return false;
    }
    
	/**
	 * ���ü��ϲ���
	 * @param nums
	 * @return
	 */
    public boolean containsDuplicate2(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int num : nums) {
    		if(set.contains(num))
    			return true;
    		else
    			set.add(num);
    	}
    	return false;
    	
    }
    
}


public class ContainsDuplicate {
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) {
            int[] nums = {5,4,3,2,5};
            
            boolean ret = new Solution().containsDuplicate(nums);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        
    }
}
