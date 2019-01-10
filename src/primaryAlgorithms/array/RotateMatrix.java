package primaryAlgorithms.array;


/**48. 旋转图像
 * <div><p>给定一个 <em>n&nbsp;</em>×&nbsp;<em>n</em> 的二维矩阵表示一个图像。</p>

<p>将图像顺时针旋转 90 度。</p>

<p><strong>说明：</strong></p>

<p>你必须在<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>旋转图像，这意味着你需要直接修改输入的二维矩阵。<strong>请不要</strong>使用另一个矩阵来旋转图像。</p>

<p><strong>示例 1:</strong></p>

<pre>给定 <strong>matrix</strong> = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

<strong>原地</strong>旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
</pre>

<p><strong>示例 2:</strong></p>

<pre>给定 <strong>matrix</strong> =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

<strong>原地</strong>旋转输入矩阵，使其变为:
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
	  /** (x,y) 的数字旋转后坐标为 (y, n - 1 -x)
    可以一次顺次旋转四个角上的数达到旋转的目的   
    n为偶数时，中心是一个2x2矩阵
    n为奇数时，中心是一个不用旋转的数字
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
