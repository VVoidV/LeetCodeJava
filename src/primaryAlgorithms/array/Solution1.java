package primaryAlgorithms.array;

/**
 * 
 *  给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

*  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author lbr19
 *
 *

 */
public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;
            
        int current = nums[0];
        int len=1;
        for(int i=1; i < nums.length; i++) {
        	if(i != len - 1 && nums[i] != current) {
        		nums[len++] = nums[i];
        		current = nums[i];
        	}
        }
        
        return len;
    }

}
