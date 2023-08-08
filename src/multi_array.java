public class multi_array {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{22, 32, 44,},
                {11, 43, 12}};
        int result;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                result = mat1[i][j] + mat2[i][j];
                System.out.println(result);
            }

        }
    }
}
