class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        if(n==1)return matrix[0][0];
        int low=matrix[0][0],high=matrix[n-1][n-1];

        // for(int i=0;i<n;i++){
        //     low=Math.min(low,matrix[i][0]);
        //     high=Math.max(high,matrix[i][n-1]);
        // }


        while(low<high){
            int mid=low+(high-low)/2;
            int count=countLess(matrix,mid);
            if(count<k)low=mid+1;
            else high=mid;
        }
        return low;
    }

    static int countLess(int matrix[][],int target){
        int count=0;
        int n=matrix.length;
        

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]<=target)count++;
            }
        }

        return count;
    }
}