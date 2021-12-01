/*
Leetcode - Easy
Flipping an Image

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int lrow = image.length;
        int lcol = image[0].length;
        int[][] result = new int[lrow][lcol];
        
        for(int i = 0; i < lrow; i++) {
            for(int j = 0; j < lcol; j++) {
                result[i][j] = image[i][lcol-j-1];
            }
        }
        
        for(int i = 0; i < lrow; i++) {
            for(int j = 0; j < lcol; j++) {
                result[i][j] = result[i][j] == 1 ? 0 : 1;
            }
        }
        return result;
    }
}
