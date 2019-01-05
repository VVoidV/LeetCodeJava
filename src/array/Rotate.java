package array;
import java.util.*;

/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="显示英文" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>给定一个数组，将数组中的元素向右移动&nbsp;<em>k&nbsp;</em>个位置，其中&nbsp;<em>k&nbsp;</em>是非负数。</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入:</strong> <code>[1,2,3,4,5,6,7]</code> 和 <em>k</em> = 3
<strong>输出:</strong> <code>[5,6,7,1,2,3,4]</code>
<strong>解释:</strong>
向右旋转 1 步: <code>[7,1,2,3,4,5,6]</code>
向右旋转 2 步: <code>[6,7,1,2,3,4,5]
</code>向右旋转 3 步: <code>[5,6,7,1,2,3,4]</code>
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入:</strong> <code>[-1,-100,3,99]</code> 和 <em>k</em> = 2
<strong>输出:</strong> [3,99,-1,-100]
<strong>解释:</strong> 
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]</pre>

<p><strong>说明:</strong></p>

<ul>
	<li>尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。</li>
	<li>要求使用空间复杂度为&nbsp;O(1) 的原地算法。</li>
</ul>
</div></div></div>
 
 * 
 * @author lbr19
 *
 */
class RotateSolution {
    public void rotate(int[] nums, int k) {
    	// 可能移动的量超过数组的长度
    	k = k % nums.length;
    	// 输入数组的长度为 0,1时不用做任何操作， 移动的量为0时也不用操作
    	if(nums.length < 2 || k < 1 || k == nums.length) return;
    	
    	// 采用数组逆序三次的办法解决
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
