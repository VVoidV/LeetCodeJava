package primaryAlgorithms.string;

/**
 * <div><p>给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入:</strong> 123
<strong>输出:</strong> 321
</pre>

<p><strong>&nbsp;示例 2:</strong></p>

<pre><strong>输入:</strong> -123
<strong>输出:</strong> -321
</pre>

<p><strong>示例 3:</strong></p>

<pre><strong>输入:</strong> 120
<strong>输出:</strong> 21
</pre>

<p><strong>注意:</strong></p>

<p>假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为&nbsp;[−2<sup>31</sup>,&nbsp; 2<sup>31&nbsp;</sup>− 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。</p>
</div>

 * @author lbr19
 *
 */
public class Reverse {
	
	/**
	 * 先转换成字符串，翻转后再转换回数字，较慢
	 * @param x
	 * @return
	 */
    public static int reverse(int x) {
    	boolean isNegtive = false;
    	int result;
        if(x < 0) {
        	x = -x;
        	isNegtive = true;
        }
 
        String str = Integer.toString(x);       
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
        	char tmp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = tmp;
        	++i;
        	--j;
        }
        
        String resStr = new String(arr);
        try {
            result = Integer.valueOf(resStr);
        }
        catch( NumberFormatException e) {
        	return 0;
        }

        if(isNegtive) {
        	return -result;
        }
        else {
            return result;
        }

    }
    
    /**
     * 通过模10运算，将x的最后一位取出，加到结果中，结果每次乘10使所有数位左移一位，
     * 判断是否溢出只需要判断下一次乘10之后是否会溢出,不会存在加上个位后才溢出的情况, 因为范围是  -2147483648 - 2147483647
     * @param x
     * @return
     */
    public static int reverse1(int x) {
    	int result = 0;
    	while( x != 0) {
    		if(result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
    			return 0;
    		}
    		result = result * 10 + x % 10;
    		x /= 10;
    	}
    	return result;
    }
    
    public static void main(String args[]) {
    	System.out.println( reverse(-Integer.MIN_VALUE + 1) );
    	System.out.println( reverse1(0) );
    }
}
