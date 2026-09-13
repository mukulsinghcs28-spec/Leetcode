class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int c2 = mat2[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <r1; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0 ; j< c2 ; j++){
                int sum = 0;
                for(int k =0 ; k< c1;k++){
                    sum += mat1[i][k]*mat2[k][j];
                }
                row.add(sum);
            }
            ans.add(row);
        }
        return ans;
        
    }
}