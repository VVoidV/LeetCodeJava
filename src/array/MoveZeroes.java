package array;

/**
 * <div class="content__eAC7"><div><p>给定一个数组 <code>nums</code>，编写一个函数将所有 <code>0</code> 移动到数组的末尾，同时保持非零元素的相对顺序。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> <code>[0,1,0,3,12]</code>
<strong>输出:</strong> <code>[1,3,12,0,0]</code></pre>

<p><strong>说明</strong>:</p>

<ol>
	<li>必须在原数组上操作，不能拷贝额外的数组。</li>
	<li>尽量减少操作次数。</li>
</ol>
</div></div>

 * @author lbr19
 *
 */
public class MoveZeroes {
	/**
	 * 借用冒泡排序类似的思想，把0冒到最后去，史诗级低效率 4900ms+,TAT
	 * @param nums
	 */
    public void moveZeroes0(int[] nums) {
        int zeroZoneIndex = nums.length;
        // 每次扫描非全零区域，将一个0放入全0区
        for(int k = 0; k < zeroZoneIndex; k++){
            boolean isPerformSwap = false;
            
            for(int i = 0 ; i < zeroZoneIndex; i++){
                if(nums[i] != 0) continue;
                for(int j = i + 1; j < nums.length; j++){
                    if(j >= zeroZoneIndex) break;

                    nums[j - 1] = nums[j];
                    nums[j] = 0;
                    isPerformSwap = true;
                }

                if(!isPerformSwap){
                    return;
                }
            }
        }

    }
    
    /**
     * 从左到右扫描，遇到0则将0之后的数字移动到0的位置，同时记录0的总数，最后将数组末尾0区统一置0
     * 2ms
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
    	int currentPos = 0; // 记录扫描中非零区域末尾的位置
    	
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != 0 ) {// 遇到非0的数字，如果不在非0区域末尾位置，则搬运到该位置
    			if( currentPos < i) {
        			nums[currentPos] = nums[i];        			
    			}
    			++currentPos; // 遇到非0的数字，非0区增长1
    		}
    	}
    	// 数组末尾置0
        while(currentPos < nums.length){
            nums[currentPos++] = 0;
        }

    }
}
