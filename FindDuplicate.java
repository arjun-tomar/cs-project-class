/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Arjun Tomar, at1321@scarletmail.rutgers.edu, at1321
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate 
{
    public static void main(String[] args) 
    {
        boolean dupeCheck = false;

        for (int i = 0; i < args.length; i++)
        {
            int checker = Integer.parseInt(args[i]);

            for (int j = 0; j < args.length; j++)
            {
                int checker2 = Integer.parseInt(args[j]);
                if ((checker == checker2) & (i != j))
                {
                    dupeCheck = true;
                }
                
            }
        }
        if (dupeCheck == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}