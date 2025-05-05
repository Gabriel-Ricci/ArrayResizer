public class ArrayResizer {
    
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        
        for (int c = 0; c < array2D[r].length; c++) {
            if (array2D[r][c] == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        for (int r = 0; r < array2D.length; r++) {
            if (isNonZeroRow(array2D, r)) {
                count++;
            }
        }
        return count;
    }

    
    public static int[][] resize(int[][] array2D) {
        
        int numRows = numNonZeroRows(array2D);
        int numCols = array2D[0].length;
        
        int[][] result = new int[numRows][numCols];
        
        int resultRow = 0;
        for (int r = 0; r < array2D.length; r++) {
            if (isNonZeroRow(array2D, r)) {
                for (int c = 0; c < numCols; c++) {
                    result[resultRow][c] = array2D[r][c];
                }
                resultRow++;
            }
        }
        
        return result;
    }
}