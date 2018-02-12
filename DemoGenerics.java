// @laksys
import static java.lang.System.out;

import java.util.*;

public class DemoGenerics {
	public static void main(String... args) {
		out.println( "new Integer(5)==new Integer(5): "+(new Integer(5)==new Integer(5))); //false
		out.println( "new Integer(500)==new Integer(500): "+(new Integer(500)==new Integer(500)));//false

		out.println( Integer.valueOf(127) == Integer.valueOf(127));//true
		out.println( Integer.valueOf(128) == Integer.valueOf(128));//false

		out.println( 5 == new Integer(5)); // true		
		out.println( 1288 == new Integer(1288)); //true

		out.println( new Integer(345).equals(345)); //true


		/* Values between -128 and 127 are cached for reuse. 
		This is an example of the flyweight pattern, 
		which minimizes memory usage by reusing immutable objects.
		Beyond being an optimization, this behaviour is part of the JLS, 
		so the following may be relied upon:
		*/

		out.println( new Integer(12) == 12); //true
		out.println( new Integer(128) == 128); //true

		String s1 = new String("string");
		String s2 = "string";
		String s3 = "string";

		out.println( s1.hashCode());
		out.println( s2.hashCode());
		out.println( s3.hashCode());

		out.println(s3==s2);
	}
}
/*
https://stackoverflow.com/questions/1700081/why-does-128-128-return-false-but-127-127-return-true-when-converting-to-integ

When you compile a number literal in Java and assign it to a Integer (capital I) the compiler emits:

Integer b2 =Integer.valueOf(127)
This line of code is also generated when you use autoboxing.

valueOf is implemented such that certain numbers are "pooled", and it returns the same instance for values smaller than 128.

From the java 1.6 source code, line 621:

public static Integer valueOf(int i) {
    if(i >= -128 && i <= IntegerCache.high)
        return IntegerCache.cache[i + 128];
    else
        return new Integer(i);
}
The value of high can be configured to another value, with the system property.

-Djava.lang.Integer.IntegerCache.high=999

If you run your program with that system property, it will output true!

The obvious conclusion: never rely on two references being identical, always compare them with .equals() method.

So b2.equals(b3) will print true for all logically equal values of b2,b3.

Note that Integer cache is not there for performance reasons, but rather to comform to the JLS, section 5.1.7; object identity must be given for values -128 to 127 inclusive.

Integer#valueOf(int) also documents this behavior:

this method is likely to yield significantly better space and time performance by caching frequently requested values. This method will always cache values in the range -128 to 127, inclusive, and may cache other values outside of this range.

------------------------

It is memory optimization in Java related.

To save on memory, Java 'reuses' all the wrapper objects whose values fall in the following ranges:

All Boolean values (true and false)

All Byte values

All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal)

All Short and Integer values from -128 to 127.

Note:

if you create Boolean with new Boolean(value); you will always get new object

if you create String with new String(value); you will always get new object

if you create Integer with new Integer(value); you will always get new object

etc.

*/