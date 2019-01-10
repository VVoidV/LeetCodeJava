package primaryAlgorithms.array;
import java.util.*;
/**
 * <div><p>�ж�һ��&nbsp;9x9 �������Ƿ���Ч��ֻ��Ҫ<strong>�������¹���</strong>����֤�Ѿ�����������Ƿ���Ч���ɡ�</p>

<ol>
	<li>����&nbsp;<code>1-9</code>&nbsp;��ÿһ��ֻ�ܳ���һ�Ρ�</li>
	<li>����&nbsp;<code>1-9</code>&nbsp;��ÿһ��ֻ�ܳ���һ�Ρ�</li>
	<li>����&nbsp;<code>1-9</code>&nbsp;��ÿһ���Դ�ʵ�߷ָ���&nbsp;<code>3x3</code>&nbsp;����ֻ�ܳ���һ�Ρ�</li>
</ol>

<p><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height: 250px; width: 250px;"></p>

<p><small>��ͼ��һ������������Ч��������</small></p>

<p>�������ֿո��������������֣��հ׸���&nbsp;<code>'.'</code>&nbsp;��ʾ��</p>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����:</strong>
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
<strong>���:</strong> true
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����:</strong>
[
&nbsp; ["8","3",".",".","7",".",".",".","."],
&nbsp; ["6",".",".","1","9","5",".",".","."],
&nbsp; [".","9","8",".",".",".",".","6","."],
&nbsp; ["8",".",".",".","6",".",".",".","3"],
&nbsp; ["4",".",".","8",".","3",".",".","1"],
&nbsp; ["7",".",".",".","2",".",".",".","6"],
&nbsp; [".","6",".",".",".",".","2","8","."],
&nbsp; [".",".",".","4","1","9",".",".","5"],
&nbsp; [".",".",".",".","8",".",".","7","9"]
]
<strong>���:</strong> false
<strong>����:</strong> ���˵�һ�еĵ�һ�����ִ�<strong> 5</strong> ��Ϊ <strong>8 </strong>���⣬�ո����������־��� ʾ��1 ��ͬ��
     ������λ�����Ͻǵ� 3x3 ���������� 8 ����, ��������������Ч�ġ�</pre>

<p><strong>˵��:</strong></p>

<ul>
	<li>һ����Ч�������������ѱ���䣩��һ���ǿɽ�ġ�</li>
	<li>ֻ��Ҫ�������Ϲ�����֤�Ѿ�����������Ƿ���Ч���ɡ�</li>
	<li>������������ֻ��������&nbsp;<code>1-9</code>&nbsp;���ַ�&nbsp;<code>'.'</code>&nbsp;��</li>
	<li>����������Զ��&nbsp;<code>9x9</code>&nbsp;��ʽ�ġ�</li>
</ul>
</div>


 * @author lbr19
 *
 */
public class IsValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!checkRow(board, i))
                return false;
        }
        
        for(int i = 0; i < 9; i++){
            if(!checkCol(board, i))
                return false;
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                if(!checkSquare(board, i, j))
                    return false;
        }
        return true;
    }
    
    private boolean checkRow(char[][] board, int row){
        char[] nums = board[row];
        return checkNumber(nums);
    }
    
    private boolean checkCol(char[][] board, int col){
        char[] nums = new char[9];
        for(int i = 0; i <9; i++){
            nums[i] = board[i][col];
        }
        return checkNumber(nums);
    }
    
    private boolean checkSquare(char[][] board, int row, int col){
        char[] nums = new char[9];
        int index = 0;
        
        for(int i = 3 * row; i < 3 * (row + 1); i++){
            for(int j = 3 * col; j < 3 * (col + 1); j++){
                nums[index++] = board[i][j];
            }
        }
        
        return checkNumber(nums);
    }
    
    private boolean checkNumber(char[] numbers){
    	// ����1-9�� 0�Ų���
        boolean[] check = new boolean[10];
        Arrays.fill(check, true);
        for(char c : numbers){
            if(c=='.') continue;
            
            int index = c - '0';
            if( true == check[index] ){
                check[index] = false;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
