class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int count = 1;
        
        while(left<=right){
            //write out top row
            for (int i = left; i <= right; i++){
                result[top][i] = count++;
            }
            top++;
            
            //write out right column
            for (int j = top; j <= bottom; j++){
                result[j][right] = count++;
            }
            right--;
            
            //write out bottom row
            for (int k = right; k>=left; k--){
                result[bottom][k] = count++;
            }
            bottom--;
            
            //write out left column
            for(int l = bottom; l>=top; l--){
                result[l][left] = count++;
            }
            left++;
        }
        return result;
    }
}
