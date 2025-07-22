class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        boolean FirstRowZero=false;
        boolean FirstColZero=false;

        for(int c=0;c<m;c++){
            if(matrix[0][c]==0){
                FirstRowZero=true;
                break;
            }
        }

        for(int r=0;r<n;r++){
            if(matrix[r][0]==0){
                FirstColZero=true;
                break;
            }
        }


        for(int r=1;r<n;r++){
            for(int c=1;c<m;c++){
                if(matrix[r][c]==0){
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                }
            }
        }

        for(int r=1;r<n;r++){
            if(matrix[r][0]==0){
                for(int c=1;c<m;c++){
                    matrix[r][c]=0;
                }
            }
        }

        for(int c=1;c<m;c++){
            if(matrix[0][c]==0){
                for(int r=1;r<n;r++){
                    matrix[r][c]=0;
                }
            }
        }

        if(FirstRowZero){
            for(int c=0;c<m;c++){
                matrix[0][c]=0;
            }
        }

        if(FirstColZero){
            for(int r=0;r<n;r++){
                matrix[r][0]=0;
            }
        }

    }
}