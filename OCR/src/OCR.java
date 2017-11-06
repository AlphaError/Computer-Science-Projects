import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 */

/**
 * @author stewv
 *
 */
public class OCR { //optical character recognition program

	static int[][] letterA = { // 1 is ink, -1 is no ink
			{-1,-1,-1,-1,-1,-1,-1,1,1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,-1,1,1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,1,1,1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}
	};
	static int[][] letterB = {
			{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,1,1,-1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,1,1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,1,1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,1,1,-1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,1,1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,-1,1,1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1},
			{-1,-1,-1,-1,1,1,1,1,-1,-1,-1,-1,-1,-1,-1,-1}
	};
	static int[][][] letterCheck = new int[2][12][16];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		letterCheck[0] = letterA;
		letterCheck[1] = letterB;
		
		int[][] originalImage = loadImage("Image1.pgm", 24,20);
		int[][] checkedImage = new int[findVertPosition(loadImage("Image1.pgm", 24,20),16)]
				[findHorzPosition(loadImage("Image1.pgm", 24,20), 0, 12, 16)];
		
		for(int[] row: originalImage) {
			
		}

		System.out.println(ocr(checkedImage));
		*/
		OCR test = new OCR();
		for(int k = 1; k <= 6; k++) {
			String fileName = "Image" + k + ".pgm";
			int[][] image = test.loadImage(fileName, 24, 20);
			System.out.println(fileName + ": " + test.ocr(image));
		}
		
	}

	private static int findVertPosition(int[][] image, int h) {
		//find horizontal band of height h
		int rows = image.length,cols=image[0].length;
		int[] sums = new int[rows];
		for(int r = 0; r < rows; r++) {
			int s = 0;
			for(int light: image[r]) {
				s += light;
			}
			sums[r] = s;
		}
		int minSum = -1, minRow = -1;
		for(int r = 0; r <= rows-h; r++) {
			int s = 0;
			for(int k = r; k < r+h; k++) {
				s += sums[k];
				if(minSum == -1 || s < minSum) {
					minSum = s;
					minRow = r;
				}
			}
		}
		return minRow;
	}
	private static int findHorzPosition(int[][] image, int row0, int h, int w) {
		//find horizontal band of height h
		int rows = image.length,cols=image[0].length;
		int[] sums = new int[cols];
		for(int c = 0; c < cols; c++) {
			int s = 0;
			for(int r = row0; r < row0+h; r++) {
				s+= image[r][c];
			}
			sums[c] = s;
		}
		int minSum = -1, minCol = -1;
		for(int c = 0; c <= cols-w; c++) {
			int s = 0;
			for(int k = c; k < c+h; k++) {
				s += sums[k];
				if(minSum == -1 || s < minSum) {
					minSum = s;
					minCol = c;
				}
			}
		}
		return minCol;
	}
	private static double match(int[][] image, int[][] template, int row, int col) {  //important return
		//Correlation between x[i] and y[i] is defined as covariance(x, y) / ((sigma(x) * sigma(y)))
		//Covariance = sum(x[i] - avg(x))*(y[i] - avg(y)) / n
		//sigma(x) = sqrt(sum(x[i] - avg(x))^2 / n)
		//sigma(y) = sqrt(sum(y[i] - avg(y))^2 / n)
		// n is rows * cols
		int rows = template.length, cols = template[0].length;
		double n = template.length * template[0].length;
		double imageAvg = 0.0;
		double templAvg = 0.0;
		
		double newImgAvg = 0;
		double newTemplAvg = 0;
		double sigX = Math.sqrt(Math.pow((newImgAvg), 2)) / n;
		double sigY = Math.sqrt(Math.pow((newTemplAvg), 2)) / n;
		
		double cov = sigX * sigY / n;
		
		for(int i = 0; i < template.length; i++) {
			for(int j = 0; j < template[0].length; j++) {
				imageAvg += image[i + row][j + col];
				templAvg += template[i][j];
			}
		}
		imageAvg /= n;
		templAvg /= n;
		
		for(int r = row; r < template.length; r++) {
			for(int c = col; c < template[0].length; c++) {
				newImgAvg += image[r + row][c + col] - imageAvg;
				newTemplAvg += template[r][c] - templAvg;
			} //returns the sum of each value minus the average
		}
		return -cov / (sigX * sigY); //whichever output is the highest, is the most alike
	}
	
	public static char ocr(int[][] image) {
		int h = letterCheck[0].length;
		int w = letterCheck[0][0].length;
		int row0 = findVertPosition(image, h);
		int col0 = findHorzPosition(image, row0, h, w);
		/*
		double bestLetter = match(image, letterCheck[0], row0, col0);
		int letterIndex = 0;
		for(int letter = 1; letter < letterCheck.length; letter++) { //works for more letters as long as you input it into the array
			double matchIndex = match(image, letterCheck[letter], row0, col0);
			if(bestLetter < matchIndex) {
				bestLetter = matchIndex;
				letterIndex = letter;
			}
		}
		*/
		double matchA = match(image, letterA, row0, col0);
		double matchB = match(image, letterB, row0, col0);
		if(matchA > matchB) {
			return 'A';
		}
		else if(matchB > matchA) {
			return 'B';
		}
		else if(matchB == matchA) {
			return 'E';
		}
		else {
			return 'R'; //E for error
		}
	}
	
	private static int[][] loadImage(String fileName, int rows, int cols) {
		File file = new File(fileName);
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex) {
			System.out.println("*** Can't open " + fileName + " ***");
			System.exit(1);
		}
		
		int[][] image = new int[rows][cols];
		
		//Skip header lines:
		input.nextLine();
		input.nextLine();
		input.nextLine();
		
		//Read pixel data:
		int r = 0, c = 0;
		while(input.hasNextInt()) {
			if (r >= rows) {
				System.out.println("*** Too many numbers in the image file " + fileName + " ***");
				input.close();
				System.exit(1);
			}
			image[r][c] = input.nextInt();
			c++;
			if (c == cols) {
				c = 0;
				r++;
			}
		}
		if (c != 0 || r != rows) {
			System.out.println("*** Too many numbers in the image file " + fileName + " ***");
			input.close();
			System.exit(1);
		}
		
		input.close();
		return image;
	}
}
