# 9.1-Magic-Squares

### Magic Squares Assignment  

#### Objective  
Create a program to determine whether a square matrix is a *magic square*. A *magic square* is a square matrix where the sum of every row, column, and both diagonals is the same.

---

#### Instructions  

1. **Files to Work With**:  
   - `Square.java`: Implements the `Square` class with methods to handle square matrices.
   - `SquareTest.java`: A test program to verify the magic square functionality.

2. **Requirements**:  
   - In `Square.java`, write the following methods:
     - `int sumRow(int row)`: Returns the sum of a specific row.
     - `int sumCol(int col)`: Returns the sum of a specific column.
     - `int sumMainDiag()`: Returns the sum of the main diagonal.
     - `int sumOtherDiag()`: Returns the sum of the secondary diagonal.
     - `boolean magic()`: Returns `true` if the square is magic.
     - `void printSquare()`: Prints the contents of the square, formatted neatly.

   - Complete `SquareTest.java` to:
     - Read input from the file `magicData`.
     - Use the `Square` class to check whether the matrices in the file are magic squares.
     - Print the sums of rows, columns, and diagonals for each matrix.
     - Determine if the square is magic and print the result.

3. **Input**:  
   The file `magicData` contains multiple square matrices. The first value in the file specifies the size of the square (e.g., `3` for a 3x3 matrix). A `-1` marks the end of the file.  
   Example:  
   ```  
   3  
   8 1 6  
   3 5 7  
   4 9 2  
   -1  
   ```

4. **Expected Output**:  
   For each square:
   - Print the matrix.
   - Print the sums of all rows, columns, and diagonals.
   - Indicate whether it is a magic square.

---

#### File Details  

**`Square.java`**  
The `Square` class should include:  
- A 2D array `square` to represent the matrix.  
- Methods to calculate sums and determine if the square is magic.  

**Skeleton Code**:  
```java
import java.util.Scanner;

public class Square {
    int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    public int sumRow(int row) {
        // Implement logic to calculate the sum of a row
    }

    public int sumCol(int col) {
        // Implement logic to calculate the sum of a column
    }

    public int sumMainDiag() {
        // Implement logic to calculate the sum of the main diagonal
    }

    public int sumOtherDiag() {
        // Implement logic to calculate the sum of the secondary diagonal
    }

    public boolean magic() {
        // Implement logic to check if the square is magic
    }

    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    public void printSquare() {
        // Implement logic to print the matrix
    }
}
```

---

**`SquareTest.java`**  
The `SquareTest` class should:
- Read the size of a square from `magicData`.
- Create a new `Square` object and populate it using the `readSquare` method.
- Print the matrix and check if it’s a magic square.  

**Skeleton Code**:  
```java
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SquareTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; // Counter for square number
        int size = scan.nextInt(); // Read size of the first square

        while (size != -1) {
            Square square = new Square(size); // Create new Square
            square.readSquare(scan); // Read values into the square

            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();

            // Print sums of rows, columns, and diagonals
            for (int i = 0; i < size; i++) {
                System.out.println("Sum of row " + i + ": " + square.sumRow(i));
                System.out.println("Sum of column " + i + ": " + square.sumCol(i));
            }
            System.out.println("Sum of main diagonal: " + square.sumMainDiag());
            System.out.println("Sum of other diagonal: " + square.sumOtherDiag());

            // Check and print if the square is magic
            System.out.println("Is magic? " + square.magic());

            // Move to the next square
            size = scan.nextInt();
            count++;
        }
    }
}
```

---

#### Example Run  

**Input (`magicData`)**:  
```  
3  
8 1 6  
3 5 7  
4 9 2  
-1  
```  

**Output**:  
```  
******** Square 1 ********  
8 1 6  
3 5 7  
4 9 2  
Sum of row 0: 15  
Sum of row 1: 15  
Sum of row 2: 15  
Sum of column 0: 15  
Sum of column 1: 15  
Sum of column 2: 15  
Sum of main diagonal: 15  
Sum of other diagonal: 15  
Is magic? true  
```
