public class Main {
    public static void main(String[] args) {
        
        int[][] arr = {
            {2, 1, 0},
            {1, 3, 2},
            {0, 0, 0},
            {4, 5, 6}
        };
        
        
        System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
        
        
        int[][] smaller = ArrayResizer.resize(arr);
        
        
        System.out.print("{{");
        for (int i = 0; i < smaller.length; i++) {
            for (int j = 0; j < smaller[i].length; j++) {
                System.out.print(smaller[i][j]);
                if (j < smaller[i].length - 1) {
                    System.out.print(", ");
                }
            }
            if (i < smaller.length - 1) {
                System.out.print("}, {");
            }
        }
        System.out.println("}}");
    }
}