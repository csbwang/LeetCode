public class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[] isColVaild = new char[10];
        char[] isRowVaild = new char[10];
        char[] isGridVaild = new char[10];
        int i, j, k, m, n;
        int num;
        for(i = 0; i < 9; i++)
        {
            for(k = 0; k < 10; k++)
            {
                isColVaild[k] = 'n';
                isRowVaild[k] = 'n';
            }
            for(j = 0; j < 9; j++)
            {
                if(board[i][j] != '.')
                {
                    num = board[i][j] - '0';
                    if(isColVaild[num] == 'y')
                    {
                        return false;
                    }
                    else
                    {
                        isColVaild[num] = 'y';
                    }
                }
                if(board[j][i] != '.')
                {
                    num = board[j][i] - '0';
                    if(isRowVaild[num] == 'y')
                    {
                        return false;
                    }
                    else
                    {
                        isRowVaild[num] = 'y';
                    }
                }
            }
        }
        for(i = 0; i < 9; i += 3)
        {
            for(j = 0; j < 9; j += 3)
            {
                for( k = 0; k < 10 ; k++)
            	{
            		isGridVaild[k] = 'n';
            	}
                for(m = i; m < i + 3; m++)
                {
                    for(n = j; n < j + 3; n++)
                    {
                        if(board[m][n] != '.')
                        {
                            num = board[m][n] - '0';
                            if(isGridVaild[num] == 'y')
                            {
                                return false;
                            }
                            else
                            {
                                isGridVaild[num] = 'y';
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
