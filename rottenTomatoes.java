/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:Arjun Tomar, at1321@scarletmail.rutgers.edu, at1321
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes 
{
    public static void main(String[] args) 
	{
		int rows = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);
		int [][]scores = new int[rows][columns];
		int adder = 0;
		int highSum = 0;
		int sum = 0;
		int highIndex = 0;
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns ; j++)
			{
				scores[i][j] = Integer.parseInt(args[adder+j+2]);
			}
			adder += columns;
		}
		for (int i = 0; i < columns; i++)
		{
            for (int j = 0; j < rows; j++)
			{
                sum += scores[j][i];
            }
			if (highSum < sum)
			{
				highSum = sum;
				highIndex = i;
			}
			sum = 0;
		}
		System.out.println(highIndex);
	}
}
