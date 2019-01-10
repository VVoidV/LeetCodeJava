package primaryAlgorithms.array;
import java.util.*;
/**
 * <div class="content__eAC7"><div><p>����һ����<strong>����</strong>��ɵ�<strong>�ǿ�</strong>��������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��</p>

<p>���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�</p>

<p>����Լ���������� 0 ֮�⣬��������������㿪ͷ��</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����:</strong> [1,2,3]
<strong>���:</strong> [1,2,4]
<strong>����:</strong> ���������ʾ���� 123��
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����:</strong> [4,3,2,1]
<strong>���:</strong> [4,3,2,2]
<strong>����:</strong> ���������ʾ���� 4321��
</pre>
</div></div>

 * @author lbr19
 *
 */
public class PlusOne {

	/**
	 * �����һλ��ʼ���ؾصļ�һ��
	 * @param digits
	 * @return
	 */
    public int[] plusOne0(int[] digits) {
        int extra = 1;
        int[] res = new int[digits.length + 1];
        int temp = 0;
        for(int i = digits.length - 1; i >= 0; --i){
            // ����ÿһλ�ĺ�,extra��ʾ��λ
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
     * �����һλ��ʼ�ӣ��ӵ�����λ���˳�ѭ�������λҪ��λ�Ļ������´���һ����һλ�����飬���λ��1
     * @param digits
     * @return
     */
    public int[] plusOne1(int[] digits) {
        int extra = 1;

        int temp = 0;
        for(int i = digits.length - 1; i >= 0; --i){
            // ����ÿһλ�ĺ�,extra��ʾ��λ
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
     * ������ǰ��0ms�� ���ڳ��������ֻ�Ǽ�1�����������ֻ����λ��9������Ż��λ���ҷ�����λ�󣬵�ǰλһ����0
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
