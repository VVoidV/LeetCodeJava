package primaryAlgorithms.array;

/**
 * 
 *  ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

*  ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
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
