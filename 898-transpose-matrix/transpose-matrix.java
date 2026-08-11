class Solution {
    public int[][] transpose(int[][] matrix) {
                int row= 0;
        int m = matrix.length ;
        int n = matrix[row].length;

        int[][] arr =  new int[n][m];
        for( row= 0;row < n ; row++){
            for(int col = 0; col< m;col++){
                arr[row][col] = matrix[col][row];
            }
        }

return arr;

    }
}