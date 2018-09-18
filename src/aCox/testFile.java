package aCox;

import static aCox.library.println;
import static aCox.library.isPalendrome;
import static aCox.library.cutOut;
import static aCox.library.multiplicationTable;
import static aCox.library.sumUpTo;

public class testFile
{
    public static void main(String[] args)
    {
        println("I love a cup of java in the morning");
        println(Boolean.toString(isPalendrome("racecar")));
        println(cutOut("catatonic cat", "cat"));
        multiplicationTable(5,8);
        println(String.valueOf(sumUpTo(4)));
    }
}
