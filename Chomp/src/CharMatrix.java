/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
 private char[][] newMatrix;
// private final char space = ' ';

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
	newMatrix = new char[rows][cols]; //initialize grid with dimensions row and cols
     for(int i = 0; i < newMatrix.length; i++) {
    	for(int j = 0; j < newMatrix[cols].length; j++) {
    		newMatrix[i][j] = ' '; 
    	} //can just use fillRect Method
    }
	//fillRect(0, 0, rows-1, cols-1, ' '); 
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
	  newMatrix = new char[rows][cols]; //fillRect!
	    for(int i = 0; i < rows; i++) {
	    	for(int j = 0; j < cols; j++) {
	    		newMatrix[i][j] = fill;
	    	}
	    }
	  //fillRect(0, 0, rows-1, cols-1, fill);
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return newMatrix.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return newMatrix[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return newMatrix[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    newMatrix[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
    if(newMatrix[row][col] == ' ') {
    	return true;
    }
    else {
    	return false;
    }
    //return charAt(row, col) == space
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
	  for(int i = row0; i <= row1; i++) {
	    	for(int j = col0; j <= col1; j++) {
	    		newMatrix[i][j] = fill;
	    		//setCharAt(r,c,fill);
	    	}
	   }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  for(int i = row0; i <= row1; i++) {
	    	for(int j = col0; j <= col1; j++) {
	    		newMatrix[i][j] = ' ';
	    	} //fillRect,row0,col0,row1,col1,space);
	   }
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
	  int spaceCount = 0; //fix
	  for(int i = 0; i < newMatrix[row].length; i++) {
		  if(newMatrix[row][i] != ' ') {
			  spaceCount++;
			  //potential use of numRows and other methods
		  }
	  }
	  return spaceCount;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
	  int spaceCount = 0; //fix
	  for(int i = 0; i < newMatrix.length; i++) {
		  if(newMatrix[i][col] == ' ') {
			  spaceCount++;
		  }
	  }
	  return spaceCount;
  }
}
