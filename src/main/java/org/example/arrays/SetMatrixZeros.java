package org.example.arrays;

public class SetMatrixZeros {
    private static void setZeros(int[][] matrix, int n, int m)
    {
        int answer[][] = new int[n][m];
        //set all elements of the array as 1
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                answer[i][j] = 1;
            }
        }
        //traversing over matrix row wise
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (matrix[i][j] == 0)
                {
                    // Set this row as zero in answer array
                    for (int k = 0; k < m; k++)
                    {
                        answer[i][k] = 0;
                    }
                    break;
                }
            }
        }
        //traversing over matrix column wise
        for (int j = 0; j < m; j++)
        {
            for (int i = 0; i < n; i++)
            {
                if (matrix[i][j] == 0)
                {
                    //set this column as 0 in answer array
                    for (int k = 0; k < n; k++)
                    {
                        answer[k][j] = 0;
                    }
                }
            }
        }
        // Updating the elements in matrix array
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (answer[i][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String args[])
    {
        //defining an array
        int[][] matrix = new int[][] {{0, 6, 3, 0}, {1, 8, 9, 3}, {6, 2, 0, 7}};
        //finds the length of the matrix
        int  n = matrix.length;
        int m = matrix[0].length;
        //function calling
        setZeros(matrix, n, m);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
