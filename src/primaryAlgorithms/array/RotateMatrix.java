package primaryAlgorithms.array;


/**48. ��תͼ��
 * <div><p>����һ�� <em>n&nbsp;</em>��&nbsp;<em>n</em> �Ķ�ά�����ʾһ��ͼ��</p>

<p>��ͼ��˳ʱ����ת 90 �ȡ�</p>

<p><strong>˵����</strong></p>

<p>�������<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">ԭ��</a></strong>��תͼ������ζ������Ҫֱ���޸�����Ķ�ά����<strong>�벻Ҫ</strong>ʹ����һ����������תͼ��</p>

<p><strong>ʾ�� 1:</strong></p>

<pre>���� <strong>matrix</strong> = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

<strong>ԭ��</strong>��ת�������ʹ���Ϊ:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre>���� <strong>matrix</strong> =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

<strong>ԭ��</strong>��ת�������ʹ���Ϊ:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
</pre>
</div>

 * @author lbr19
 *
 */
class RotateMatrixSolution {
	  /** (x,y) ��������ת������Ϊ (y, n - 1 -x)
    ����һ��˳����ת�ĸ����ϵ����ﵽ��ת��Ŀ��   
    nΪż��ʱ��������һ��2x2����
    nΪ����ʱ��������һ��������ת������
    */
    
    public void rotate(int[][] matrix) {
        for(int i = matrix.length; i > 1; i-=2){
            rotateEdge(matrix, i);
        }
    }
    
    private void rotateEdge(int[][] mat, int size){
        int n = mat.length;
        int Adj = (n - size) / 2; 
        for(int i = 0 ; i < size - 1; ++i){
        	int[] coordinate;
            int x1 = 0;
            int y1 = i;
            coordinate = getCoordinate(x1, y1, size);
            
            int x2 = coordinate[0];
            int y2 = coordinate[1];
            coordinate = getCoordinate(x2, y2, size);
            
            int x3 = coordinate[0];
            int y3 = coordinate[1];
            coordinate = getCoordinate(x3, y3, size);
            
            int x4 = coordinate[0];
            int y4 = coordinate[1];
            int t = mat[x2 + Adj][y2 + Adj];
            
            mat[x2 + Adj][y2 + Adj] = mat[x1 + Adj][y1 + Adj];
            mat[x1 + Adj][y1 + Adj] = mat[x4 + Adj][y4 + Adj];
            mat[x4 + Adj][y4 + Adj] = mat[x3 + Adj][y3 + Adj]; 
            mat[x3 + Adj][y3 + Adj] = t;
            
        }
    }
    
    private int[] getCoordinate(int x, int y, int size){
        int[] coordinate = new int[2];
        coordinate[0] = y;
        coordinate[1] = size - 1 - x;
        return coordinate;
    }
    

}

public class RotateMatrix{
    public static void main(String[] args) {
    	int[][] matrix= 
    			{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    	RotateMatrixSolution solution = new RotateMatrixSolution();
    	solution.rotate(matrix);
    }
}
