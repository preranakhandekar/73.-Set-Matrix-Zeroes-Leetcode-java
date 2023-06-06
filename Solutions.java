class Solution {
    public void setZeroes(int[][] matrix) {
        int row= matrix.length;
        int column=matrix[0].length;
        int[] roww=new int[row];
        int[] columnn=new int[column];
        Arrays.fill(roww,0);
        Arrays.fill(columnn,0);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    roww[i]=1;
                    columnn[j]=1;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(roww[i]==1 || columnn[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
