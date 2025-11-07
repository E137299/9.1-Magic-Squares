import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main{
  public static void main(String[] args){
      Scanner scan = new Scanner(new File("magicData.txt"));
      int count = 1; // Counter for square number
      int size = scan.nextInt(); // Read size of the first square

      while (size != -1) {
          Square square = new Square(size); // Create new Square
          square.readSquare(scan); // Read values into the square

          System.out.println("\n******** Square " + count + " ********");
          square.printSquare();

          // Print sums of rows, columns, and diagonals


          // Check and print if the square is magic
      }
  }
}


