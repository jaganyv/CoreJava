package CoreConcepts;

public class _2DArrays {


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},{4,5,6}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        String[] favFoods = {"Idly", "Dosa", "Pizza"};

        for (String food : favFoods) {
            System.out.println("I love " + food);
        }

//        System.out.println(matrix[1][2]);
    }

//    Looping throguh 2dArray

}
