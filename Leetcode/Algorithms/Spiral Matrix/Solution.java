class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //result matrix
        List<Integer> result = new ArrayList<Integer>();
        
        if(matrix.length == 0){
            return result;
        }
        
        int columns = matrix[0].length;
        int rows = matrix.length;
                 
        int top = 0;
        int left = 0;
        int right = columns-1;
        int bottom = rows-1; 
        
        while(top<=bottom && left<=right){
            //add top row
            for (int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            //add right column
            for (int j = top; j<= bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;
            
            if(bottom>=top){
                
            //add bottom row
            for (int k = right; k>= left; k--){
                result.add(matrix[bottom][k]);
            }
            bottom--;
            }
            
            if(left <= right){
            //add left column
            for (int l = bottom; l>= top; l--){
                result.add(matrix[l][left]);
            }
            left++;
            }
            
        }
        return result;
    }
}
