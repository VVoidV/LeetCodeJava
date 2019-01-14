package primaryAlgorithms.searchAndSort;

/**
 * <div><p>给定两个有序整数数组&nbsp;<em>nums1 </em>和 <em>nums2</em>，将 <em>nums2 </em>合并到&nbsp;<em>nums1&nbsp;</em>中<em>，</em>使得&nbsp;<em>num1 </em>成为一个有序数组。</p>

<p><strong>说明:</strong></p>

<ul>
	<li>初始化&nbsp;<em>nums1</em> 和 <em>nums2</em> 的元素数量分别为&nbsp;<em>m</em> 和 <em>n</em>。</li>
	<li>你可以假设&nbsp;<em>nums1&nbsp;</em>有足够的空间（空间大小大于或等于&nbsp;<em>m + n</em>）来保存 <em>nums2</em> 中的元素。</li>
</ul>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong>
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

<strong>输出:</strong>&nbsp;[1,2,2,3,5,6]</pre>
</div>

 * @author lbr19
 *
 */
public class Merge {
	/**
	 * 3ms 100%
	 * 从后往前扫描，依次将较大的数放在正确的位置上。
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;
        
        while( m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[index--] = nums1[m--];
            }
            else{
                nums1[index--] = nums2[n--];
            }
        }
        while(n > 0 ){
            nums1[index--] = nums2[n--];
        }
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1,2,3,0,0,0};
    	int[] nums2 = {2,5,6};
    	int m = 3;
    	int n = 3;
    	merge(nums1, m, nums2, n);
    }
}
