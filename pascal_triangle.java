//Author: Ricky Franco
//30 Jan 2025
//pascal_triangle.java: Allow the user to enter an integer input determining the size of a Pascal Triangle

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Print out a Pascal Triangle with the height of the user's input
 */
public class pascal_triangle {

    public static void main(String[] args) {

        //Ask for user to input how high the triangle will be
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows to create Pascal's triangle: ");

        //Grab the number of rows from the user
        int numRows = input.nextInt();
        System.out.println();

        // create the triangle, then print the result
        List<List<Integer>> triangle = createPascalsTriangle(numRows);
        printPascalsTriangle(triangle);
    }

    /**
     * Create Pascals' Triangle based on the size of numRows
     * @param numRows  The height of the triangle
     * @return A 2D Array with the completed triangle
     */
    public static List<List<Integer>> createPascalsTriangle(int numRows) {

        //Code to create Pascal's Triangle
        List<List<Integer>> res = new ArrayList<>();

        // To create the triangle with the height of numRows
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(temp);
        }

        return res;

    }

    /**
     * Print the triangle to standard output
     * @param triangle The 2D Array that contains Pascals' Triangle
     */
    public static void printPascalsTriangle(List<List<Integer>> triangle) {
        int numRows = triangle.size();

        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print numbers in the row
            for (int num : triangle.get(i)) {
                System.out.print(num + "   "); // Extra spaces for better alignment
            }

            System.out.println();
        }
    }
}