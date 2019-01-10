package primaryAlgorithms.array;

import java.util.*;

/**
 * 136. 只出现一次的数字
 * <div class="content__eAC7"><div><p>给定一个<strong>非空</strong>整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。</p>

<p><strong>说明：</strong></p>

<p>你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入:</strong> [2,2,1]
<strong>输出:</strong> 1
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入:</strong> [4,1,2,1,2]
<strong>输出:</strong> 4</pre>
</div></div>
 * @author lbr19
 *
 */


public class SingleNumber {
	/**
	 * 利用hashset找到重复的数据，理想情况下应该是O(n)时间复杂度
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
     * 排序后判断，不符合线性时间要求
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
     * 利用异或运算，无论异或的顺序如何，重复的两个数异或后为全0，最后剩下的就是单独的数字
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
