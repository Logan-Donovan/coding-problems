//Problem: https://leetcode.com/problems/island-perimeter/tabs/description

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighboors = 0;
        for (int i = 0; i<grid.length;i++){
            for (int j = 0; j<grid[i].length;j++){
                if (grid[i][j] == 1){ 
                    islands++;
                    if (i < grid.length - 1 && grid[i+1][j] == 1) neighboors++;
                    if (j < grid[i].length - 1 && grid[i][j+1] == 1) neighboors++;
                                    }
            }
        }
    return islands*4 - neighboors*2;
    }
}
