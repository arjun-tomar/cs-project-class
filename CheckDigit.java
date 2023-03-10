/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:Arjun Tomar, at1321
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit 
{
    public static void main (String[] args)
    {
        int sum = 0;
        int sum2 = 0;
        long number = Long.parseLong(args[0]);
        
        for(long int1 = number; int1 != 0; int1 = int1 / 100)
        {
            sum += int1 % 10;
        }
        sum = sum % 10;
        for (long int2 = number / 10; int2 != 0; int2 = int2 / 100)
        {
            sum2 += int2 % 10;
        }
        sum2 = sum2 % 10;
        sum2 *= 3;
        sum2 = sum2 % 10;
        int sum3 = sum + sum2;
        sum3 = sum3 % 10;
        System.out.println(sum3);

    }
}