package BinarySearch.arrayBinary2D;

public class searchIn2DPattern2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int row = 0;
        int col = colSize - 1;

        while (row < rowSize && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                row++; // move down
            } else {
                col--; // move left
            }
        }

        return false;
    }

    public static void main(String[] args) {
        searchIn2DPattern2 obj = new searchIn2DPattern2();

        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 5;

        boolean found = obj.searchMatrix(matrix, target);

        System.out.println("Target found? " + found);
    }
}
