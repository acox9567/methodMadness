package aCox;

public class library
{
	public static void println(String str)
	{
		System.out.println(str);
	}

	/**
	 * isPalindrome returns checks if a given string is a palindrome
	 *
	 * @param str the string that's to be verified as a palindrome
	 * @return a boolean based on whether or not it is a palindrome
	 */

	public static boolean isPalindrome(String str)
	{
		String rev = "";

		for(int i = str.length() - 1; i >= 0; i--)
			rev += str.substring(i, i + 1);

		return (rev.equals(str));
	}

	/**
	 * dateStr takes a given date in the format mm/dd/yyyy and converts it to the format mm-dd-yy
	 *
	 * @param str takes a date in the format mm/dd/yyyy
	 * @return returns a date string in the format mm-dd-yy
	 */

	public static String dateStr(String str)
	{
		String mm = str.substring(0,2);
		String dd = str.substring(3,5);
		String yyyy = str.substring(6);
		return (mm + "-" + dd + "-" + yyyy);
	}

	/**
	 * cutOut takes a given string and removes a specified portion
	 *
	 * @param mainStr the main string that is to be cut up
	 * @param subStr the substring that is to be removed
	 * @return the final string with the substring removed
	 */

	public static String cutOut(String mainStr, String subStr)
	{
		int idx = mainStr.indexOf(subStr);

		if (idx == -1)
			return mainStr;

		String sub1 = mainStr.substring(0, idx);
		String sub2 = mainStr.substring(idx + subStr.length());

		return (sub1 + sub2);
	}

	/**
	 * multiplicationTable prints a list of multiples of a given base to the console
	 *
	 * @param base the base number for the list of multiples
	 * @param range the max number that the base will be multiplied by
	 */

	public static void multiplicationTable(int base, int range)
	{
		for (int i = 0; i <= range; i++)
			System.out.print(String.valueOf(base * i) + ",");
		System.out.print("\n");
	}

	/**
	 * sumUpTo adds together all the numbers between one and a given max value
	 *
	 * @param num the max number that will be added to the sum
	 * @return the sum of all the added numbers
	 */

	public static int sumUpTo(int num)
	{
		int val = 0;

		for (int i = 1; i <= num; i ++)
			val += i;

		return val;
	}

	/**
	 * leastCommonMultiple finds the least common multiple of 3 numbers
	 *
	 * @param num1 the first number
	 * @param num2 the second number
	 * @param num3 the third number
	 * @return the least common multiple of the three numbers
	 */

	public static int leastCommonMultiple(int num1, int num2, int num3)
	{
		for (int i = num1; i < (num1 * num2 * num3); i++)
		{
			if (i % num1 == 0 && i % num2 == 0 & i % num3 == 0)
				return i;
		}
		return (num1 * num2 * num3);
	}
}
