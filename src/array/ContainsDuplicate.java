package array;

import java.util.*;

/**
 * <div><p>给定一个整数数组，判断是否存在重复元素。</p>

<p>如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入:</strong> [1,2,3,1]
<strong>输出:</strong> true</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入: </strong>[1,2,3,4]
<strong>输出:</strong> false</pre>

<p><strong>示例&nbsp;3:</strong></p>

<pre><strong>输入: </strong>[1,1,1,3,3,4,3,2,4,2]
<strong>输出:</strong> true</pre>
</div>

 * @author lbr19
 *
 */
class Solution {

	/**
	 * 先排序再扫描，相邻的相等就重复了
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
	 * 利用集合查重
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
