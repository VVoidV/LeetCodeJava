package primaryAlgorithms.array;
import java.util.*;
/**
 * <div class="content__eAC7"><div><p>给定一个由<strong>整数</strong>组成的<strong>非空</strong>数组所表示的非负整数，在该数的基础上加一。</p>

<p>最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。</p>

<p>你可以假设除了整数 0 之外，这个整数不会以零开头。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入:</strong> [1,2,3]
<strong>输出:</strong> [1,2,4]
<strong>解释:</strong> 输入数组表示数字 123。
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入:</strong> [4,3,2,1]
<strong>输出:</strong> [4,3,2,2]
<strong>解释:</strong> 输入数组表示数字 4321。
</pre>
</div></div>

 * @author lbr19
 *
 */
public class PlusOne {

	/**
	 * 从最后一位开始规规矩矩的加一遍
	 * @param digits
	 * @return
	 */
    public int[] plusOne0(int[] digits) {
        int extra = 1;
        int[] res = new int[digits.length + 1];
        int temp = 0;
        for(int i = digits.length - 1; i >= 0; --i){
            // 计算每一位的和,extra表示进位
            temp = extra + digits[i];
            if(temp > 9){
                extra = 1;
            }
            else{
                extra = 0;
            }
            res[i] = temp % 10;
        }
        if(extra == 1){
            res[0] = 1;
            return res;
        }
        else{
            return Arrays.copyOfRange(res, 0, res.length - 1);
        }
    }
    
    /**
     * 从最后一位开始加，加到不进位就退出循环，最高位要进位的话则重新创建一个多一位的数组，最高位置1
     * @param digits
     * @return
     */
    public int[] plusOne1(int[] digits) {
        int extra = 1;

        int temp = 0;
        for(int i = digits.length - 1; i >= 0; --i){
            // 计算每一位的和,extra表示进位
            temp = extra + digits[i];
            if(temp > 9){
                extra = 1;
                digits[i] = temp % 10;
            }
            else{
                extra = 0;
                digits[i] = temp;
                break;
            }
            
        }
        if(extra == 1){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        else{
            return digits;
        }
    }
    
    /**
     * 排名靠前的0ms， 快在充分利用了只是加1的条件，因此只有数位是9的情况才会进位，且发生进位后，当前位一定是0
     * @param digits
     * @return
     */
    public int[] plusOne3(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                }
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
