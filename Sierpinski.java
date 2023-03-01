/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: at1321, Arjun Tomar, arjun.tomar@rutgers.edu
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        double height = length * Math.pow(3.0, 0.5)/2;
        return height;
	
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

        double secondX = x - (length/2);
        double thirdX = x + (length/2);
        double[] fullX = {x, secondX, thirdX};
        
        double secondY = y + (height(length));
        double thirdY = y + (height(length));
        double[] fullY = {y, secondY, thirdY};
        
        StdDraw.filledPolygon(fullX, fullY);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	    filledTriangle(x, y, length);
        if (n == 1)
        {
            return;
        }
        sierpinski(n - 1, x - (length / 2), y, (length / 2));
        sierpinski(n - 1, x + (length / 2), y, (length / 2));
        sierpinski(n - 1, x, y + (height(length)), (length/2));
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        double length = 0.5;
        int l = 1;
        int n = Integer.parseInt(args[0]);
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, height(l));
        StdDraw.line(0.5, height(l), 0.0, 0.0);

        double x = 0.5;
        double y = 0;

        sierpinski(n, x, y, length);
    }
}
