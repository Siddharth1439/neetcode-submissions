class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int n = matrix.length;
     int m = matrix[0].length;

     int left = 0;
     int right = n*m - 1;
     while( left <= right){
        int mid = (right - left)/2 + left;

        int col = mid % m;    // 1
        int row = mid / m;   //  1
        if(matrix[row][col] == target) return true;

        if(matrix[row][col] < target){
            left = mid + 1;
        } else right = mid-1;}
        return false;

     }
}
