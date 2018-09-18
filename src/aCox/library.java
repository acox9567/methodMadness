package aCox;

public class library
{
	public static void println(String str)
	{
		System.out.println(str);
	}

	public static boolean isPalendrome(String str)
	{
		String rev = "";

		for(int i = str.length() - 1; i >= 0; i--)
			rev += str.substring(i, i + 1);

		return (rev.equals(str));
	}

	public static String cutOut(String mainStr, String subStr)
	{
		int idx = mainStr.indexOf(subStr);

		if (idx == -1)
			return mainStr;

		String sub1 = mainStr.substring(0, idx);
		String sub2 = mainStr.substring(idx + subStr.length());

		return (sub1 + sub2);
	}

	public static void multiplicationTable(int base, int range)
	{
		for (int i = 0; i <= range; i++)
			System.out.print(String.valueOf(base * i) + ",");
		System.out.print("\n");
	}

	public static int sumUpTo(int num)
	{
		int val = 0;

		for (int i = 1; i <= num; i ++)
			val += i;

		return val;
	}
}
