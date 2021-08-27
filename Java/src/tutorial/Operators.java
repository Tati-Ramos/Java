package tutorial;

public class Operators {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("Addition --> " + (x+y));
        System.out.println("Subtraction --> " + (x-y));
        System.out.println("Multiplication --> " + (x*y));
        System.out.println("Division --> " + (y/x));
        System.out.println("Modulus --> " + (y%x));
        System.out.println("Increment--> " + (++x));
        System.out.println("Decrement--> " + (--y));

        int a = 150;
        --a; //decrease
        System.out.println(a);

        int b = 1000;
        ++b; //increase
        System.out.println(b);


        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        // Assignment Operators

        int c = 5;
        System.out.println(c);

        int d = 5;
        d += 3;
        System.out.println(d);

        int e = 5;
        e -= 3;
        System.out.println(e);

        int f = 5;
        f *= 3;
        System.out.println(f);

        int g = 5;
        g /= 3;
        System.out.println(g);

        int h = 5;
        h %= 3;
        System.out.println(h);

        int i = 5;
        i &= 3; //Bitwise AND assignment
        System.out.println(i);

        int j = 5;
        j |= 3; //Bitwise OR assignment
        System.out.println(j);

        int k = 5;
        k ^= 3; //Bitwise XOR assignment
        System.out.println(k);

        int l = 5;
        l >>= 3; //Right shift assignment
        System.out.println(l);

        int m= 5;
        m <<= 3; //Left shift assignment
        System.out.println(m);


        //Java Comparison Operators

        int aB = 5;
        int aC = 3;
        System.out.println(aB == aC); // returns false because 5 is not equal to

        int bA = 5;
        int bB = 3;
        System.out.println(bA != bB); // returns true because 5 is not equal to 3

        int cA = 5;
        int cB = 3;
        System.out.println(cA > cB); // returns true because 5 is greater than 3

        int dA = 5;
        int dB= 3;
        System.out.println(dA < dB); // returns false because 5 is not less than 3

        int mA = 5;
        int mB = 3;
        System.out.println(mA >= mB); // returns true because 5 is greater, or equal, to 3

        int eA = 5;
        int eB = 3;
        System.out.println(eA <= eB); // returns false because 5 is neither less than or equal to 3

        //Java Logical Operators

        int t = 5;
        System.out.println(t > 3 && t < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
    }










/*
Operators are used to perform operations on variables and values.

Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

Operator	  Name	       Description	                            Example
+	      Addition	        Adds together two values	             x + y
-	      Subtraction	    Subtracts one value from another	     x - y
*	      Multiplication	Multiplies two values	                 x * y
/	      Division	        Divides one value by another	         x / y
%	      Modulus	        Returns the division remainder	         x % y
++	      Increment      	Increases the value of a variable by 1	  ++x
--	      Decrement	        Decreases the value of a variable by 1	  --x

Java Assignment Operators

Operator	    Example	             Same As
=	            x = 5	            x = 5
+=	            x += 3	            x = x + 3
-=	            x -= 3	            x = x - 3
*=	            x *= 3	            x = x * 3
/=	            x /= 3	            x = x / 3
%=	            x %= 3	            x = x % 3
&=	            x &= 3	            x = x & 3
|=	            x |= 3	            x = x | 3
^=	            x ^= 3	            x = x ^ 3
>>=	            x >>= 3	            x = x >> 3
<<=	            x <<= 3	            x = x << 3
 */
