/*
Determine Whether Matrix Can Be Obtained By Rotation - Easy

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Example 1:
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.

Example 3:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

Constraints:
    n == mat.length == target.length
    n == mat[i].length == target[i].length
    1 <= n <= 10
    mat[i][j] and target[i][j] are either 0 or 1.
*/

class Solution {
    
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            int rotate[][] = rotate(mat);
            if (isEquals(rotate, target))
                return true;
            mat = rotate;
        }
        return false;
    }

    public int[][] rotate(int mat[][]) {
        int rows = mat.length, cols = mat[0].length;
        int result[][] = new int[rows][cols];
        for (int row = 0, i = 0; row < rows; ++row, ++i) {
            for (int col = cols - 1, j = 0; col >= 0; --col, ++j) {
                result[i][j] = mat[col][row];
            }
        }
        return result;
    }

    public boolean isEquals(int mat1[][], int mat2[][]) {
        for (int row = 0; row < mat1.length; ++row) {
            for (int col = 0; col < mat1.length; ++col) {
                if (mat1[row][col] != mat2[row][col]) return false;
            }
        }
        return true;
    }
}
