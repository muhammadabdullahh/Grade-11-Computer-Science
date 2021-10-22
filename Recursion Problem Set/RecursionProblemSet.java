import java.io.*;
class RecursionProblemSet
{
	//MAIN METHOD
	public static void main(String[] args)
	{
		System.out.println("Sum Of Range:\t" + sumOfRange(5));
		System.out.println("Sum of Digits:\t" + sumDigits(123));
		System.out.println("Factorial:\t" + factorial(5));
		System.out.println("Is Palindrome:\t" + isPalin("racecar"));
	}
	//#1
	public static int sumOfRange(int endOfRange)
	{
		if(endOfRange > 0)
			return endOfRange + sumOfRange(endOfRange - 1);
		else
			return 0;
	}
	//#2
	public static int sumDigits(int digits)
	{
		if(digits > 0)
			return digits % 10 + sumDigits(digits / 10);
		else
			return 0;
	}
	//3
	public static int factorial(int endOfRange)
	{
		if(endOfRange > 0)
			return endOfRange * factorial(endOfRange - 1);
		else
			return 1;
	}
	//#4
	public static boolean isPalin(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalin(s.substring(1, s.length()-1));

        return false;
    }
			
}
