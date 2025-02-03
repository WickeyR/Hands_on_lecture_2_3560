***Pascals Triangle***

Steps to solving Pascals Triangle

1. Ask the user for the input (This determines the size of the triangle)
2. Create a for-loop to begin creating a triangle as tall as numRows
3. in the inner for-loop, have an if else case, that either calculates the left and right upper cells or places a 1
4. add the temp row with the calculated values into the resulting array
5. return the resulting array and optionally print the result to the user



***Spiral Matrix***

Steps to solving Spiral Matrix

1. Ensure that the matrix is not null before proceeding.
2. Keep track of four pointers (left: the left of the matrix, right: the right of the matrix, top: the top of the matrix, bottom: the bottom of the matrix)
3. Traverse as long as left is smaller than right, top is smaller than bottom, meaning as long as there are still elements to add.
4. create four for-loops, starting with traversing the top row, right, bottom and then left, all while adding those elements to the result array.
5. Return the result to the user