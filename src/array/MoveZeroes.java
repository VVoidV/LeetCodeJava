package array;

/**
 * <div class="content__eAC7"><div><p>����һ������ <code>nums</code>����дһ������������ <code>0</code> �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��</p>

<p><strong>ʾ��:</strong></p>

<pre><strong>����:</strong> <code>[0,1,0,3,12]</code>
<strong>���:</strong> <code>[1,3,12,0,0]</code></pre>

<p><strong>˵��</strong>:</p>

<ol>
	<li>������ԭ�����ϲ��������ܿ�����������顣</li>
	<li>�������ٲ���������</li>
</ol>
</div></div>

 * @author lbr19
 *
 */
public class MoveZeroes {
	/**
	 * ����ð���������Ƶ�˼�룬��0ð�����ȥ��ʷʫ����Ч�� 4900ms+,TAT
	 * @param nums
	 */
    public void moveZeroes0(int[] nums) {
        int zeroZoneIndex = nums.length;
        // ÿ��ɨ���ȫ�����򣬽�һ��0����ȫ0��
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
     * ������ɨ�裬����0��0֮��������ƶ���0��λ�ã�ͬʱ��¼0���������������ĩβ0��ͳһ��0
     * 2ms
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
    	int currentPos = 0; // ��¼ɨ���з�������ĩβ��λ��
    	
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != 0 ) {// ������0�����֣�������ڷ�0����ĩβλ�ã�����˵���λ��
    			if( currentPos < i) {
        			nums[currentPos] = nums[i];        			
    			}
    			++currentPos; // ������0�����֣���0������1
    		}
    	}
    	// ����ĩβ��0
        while(currentPos < nums.length){
            nums[currentPos++] = 0;
        }

    }
}
