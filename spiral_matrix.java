//Author: Ricky Franco
//30 Jan 2025
//spiral_matrix.java: Given a 2D Integer array, return the order of the integers in a spiral traversal

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {

    /**
     * create a new list that returns the spiral order of matrix
     * @param matrix The matrix that will be processed
     * @return A list container the elements from matrix in spiral order
     */
    public static List<Integer> spiralOrder(List<List<Integer>> matrix) {
        List<Integer> res = new ArrayList<>();

        // Ensure that the array is not empty
        if (matrix == null || matrix.isEmpty() || matrix.get(0).isEmpty()) {
            return res;
        }

        //Pointers to keep track of traversal
        int left = 0;
        int right = matrix.get(0).size();
        int top = 0;
        int bottom = matrix.size();

        //Traverse as long as there are still elements that have not been added to the result array
        while (left < right && top < bottom) {
            // Traverse top row
            for (int i = left; i < right; i++) {
                res.add(matrix.get(top).get(i));
            }
            top++;

            // Traverse right column
            for (int i = top; i < bottom; i++) {
                res.add(matrix.get(i).get(right - 1));
            }
            right--;

            // Check if more rows/columns need processing
            if (left >= right || top >= bottom) break;

            // Traverse bottom row
            for (int i = right - 1; i >= left; i--) {
                res.add(matrix.get(bottom - 1).get(i));
            }
            bottom--;

            // Traverse left column
            for (int i = bottom - 1; i >= top; i--) {
                res.add(matrix.get(i).get(left));
            }
            left++;
        }

        return res;
    }

    public static void main(String[] args) {

        //Example of the spiral matrix
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1, 2, 3)));
        matrix.add(new ArrayList<>(List.of(4,5,6)));
        matrix.add(new ArrayList<>(List.of(7,8,9)));

        //Call the spiral order function
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
