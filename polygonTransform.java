/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Arjun Tomar, at1321, at1321@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) 
    {
        double arrNew[] = new double[array.length];
        for(int i = 0; i < array.length; i++)
        {
            arrNew[i] = array[i];
        }
        return arrNew;
	
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {
        for(int i = 0; i < x.length; i++)
        {
            x[i] *= alpha;
            y[i] *= alpha;
        }
	
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {
        for(int i = 0; i < x.length; i++)
        {
            y[i] += dy;
            x[i] += dx;
        }
	
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) 
    {
        double []copier = copy(x);
        double []copier2 = copy(y);
        double z = Math.toRadians(theta);
        for (int i = 0; i < x.length; i++)
        {
            x[i] = (copier[i] * Math.cos(z)) - (copier2[i] * Math.sin(z));
        }
        for (int i = 0; i < y.length; i++){
            y[i] = (copier2[i] * Math.cos(z)) + (copier[i] * Math.sin(z)); 
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}
