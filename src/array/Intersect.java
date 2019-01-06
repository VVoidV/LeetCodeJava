package array;
import java.util.*;
/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="显示英文" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>给定两个数组，编写一个函数来计算它们的交集。</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入: </strong>nums1 = [1,2,2,1], nums2 = [2,2]
<strong>输出: </strong>[2,2]
</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入: </strong>nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>输出: </strong>[4,9]</pre>

<p><strong>说明：</strong></p>

<ul>
	<li>输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。</li>
	<li>我们可以不考虑输出结果的顺序。</li>
</ul>

<p><strong><strong>进阶:</strong></strong></p>

<ul>
	<li>如果给定的数组已经排好序呢？你将如何优化你的算法？</li>
	<li>如果&nbsp;<em>nums1&nbsp;</em>的大小比&nbsp;<em>nums2&nbsp;</em>小很多，哪种方法更优？</li>
	<li>如果&nbsp;<em>nums2&nbsp;</em>的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？</li>
</ul>
</div></div></div>
 * @author lbr19
 *
 */

public class Intersect {
	/**
	 * 使用一个map来记录数字出现的次数，最后组装数组输出
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
