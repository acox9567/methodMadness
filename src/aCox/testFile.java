package aCox;

import static aCox.library.println;
import static aCox.library.isPalindrome;
import static aCox.library.cutOut;
import static aCox.library.multiplicationTable;
import static aCox.library.sumUpTo;
import static aCox.library.dateStr;
import static aCox.library.leastCommonMultiple;

public class testFile
{
    public static void main(String[] args)
    {
        println("Console is printed in the format 'expected: actual'");

        println("");

        //Test of isPalindrome method
        boolean a = isPalindrome("racecar");
        boolean b = isPalindrome("java");
        boolean c = isPalindrome("dad");
        println("true: " + Boolean.toString(a) + "\nfalse: " + Boolean.toString(b) + "\ntrue: " + Boolean.toString(c));

        println("");

        //Test of dateStr method
        String d = dateStr("01/04/2001");
        String e = dateStr("04/29/2001");
        String f = dateStr("12/25/2018");
        println("01-04-2001: " + d + "\n04-29-2001: " + e + "\n12-25-2018: " + f);

        println("");

        //Test of cutOut method
        d  = cutOut("catatonic cat", "cat");
        e  = cutOut("notebook", "book");
        f  = cutOut("apple", "le");
        println("atonic cat: " + d  + "\nnote: " + e + "\napp: " + f);

        println("");

        //Test of multiplicationTable method
        println("0 5 10 15 20 25 30 35 40 ");
        multiplicationTable(5,8);
        println("0 2 4 6 8 ");
        multiplicationTable(2,4);
        println("0 9 18 27 36 45 54 ");
        multiplicationTable(9,6);

        println("");

        //Test of sumUpTo method
        int g = sumUpTo(4);
        int h = sumUpTo(5);
        int i = sumUpTo(100);
        println("10: " + String.valueOf(g) + "\n15: " + String.valueOf(h) + "\n5050: " + String.valueOf(i));

        println("");

        //Test of leastCommonMultiple method
        g = leastCommonMultiple(18, 12, 16);
        h = leastCommonMultiple(10, 11, 12);
        i = leastCommonMultiple(5, 3, 2);
        println("144: " + g + "\n660: " + h + "\n30: " + i);
    }
}
