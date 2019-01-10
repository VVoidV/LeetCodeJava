package primaryAlgorithms.array;

import java.util.*;

/**
 * <div><p>����һ���������� <code>nums</code>&nbsp;��һ��Ŀ��ֵ <code>target</code>�������ڸ��������ҳ���ΪĿ��ֵ����&nbsp;<strong>����</strong>&nbsp;���������������ǵ������±ꡣ</p>

<p>����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�</p>

<p><strong>ʾ��:</strong></p>

<pre>���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[<strong>0</strong>] + nums[<strong>1</strong>] = 2 + 7 = 9
���Է��� [<strong>0, 1</strong>]
</pre>
</div>

 * @author lbr19
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length ; i++) {
        	int num = nums[i];
        	int expect = target - num;
        	if( map.containsKey(expect) ) {
        		return new int[] {map.get(expect), i};
        	}
        	else {
        		map.putIfAbsent(num, i);
        	}  	       	
        }
        throw new IllegalArgumentException ("û�к��ʵĴ�");
    }
}
