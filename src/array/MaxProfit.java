package array;
/**
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

*���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����

*ע�⣺�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����

*<p>ʾ�� 1:</p>

*<p>����: [7,1,5,3,6,4]</p>
*<p>���: 7</p>
*<p>����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 3 �죨��Ʊ�۸� = 5����ʱ������, ��ʽ������ܻ������ = 5-1 = 4 ��
     ����ڵ� 4 �죨��Ʊ�۸� = 3����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ������, ��ʽ������ܻ������ = 6-3 = 3 ��</p>
 * @author lbr19
 *
 */

public class MaxProfit {
    public int maxProfit(int[] prices) {
    	if(prices.length < 2) return 0;

        int maxProfit = 0;
        for(int i=0; i < prices.length - 1 ; i++) {
        	int profit = prices[i + 1] - prices[i];
        	if(profit > 0)
        		maxProfit += profit;
        }
        return maxProfit;
    }
}
