
/* Program to demonstrate arithmetic operation using command line arguments


@ DAYA MATHEW
Roll no: 20
Date: 17/11/2025 */

import java.io.*;
class calcu {
public static void main(String args[]) { if (args.length == 3) {
int num1 = Integer.parseInt(args[0]); int num2 = Integer.parseInt(args[1]); int op = Integer.parseInt(args[2]);

switch (op) { case 1:
System.out.println("--Addition--");
System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;

case 2:
System.out.println("--Subtraction--");
System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;

case 3:
System.out.println("--Multiplication--");
System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;

case 4:
if (num2 != 0) {
System.out.println("--Division--");
System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
} else {
 
System.out.println("Division with 0 is not possible");
}
break;

case 5:
if (num2 != 0) {
System.out.println("--Modulus--");
System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
} else {
System.out.println("Modulus with 0 is not possible");
}
break;

default:
System.out.println("Invalid operator code! Use 1 to 5.");
}

} else {
System.out.println("Check number of arguments. Usage: num1 num2 operator");
}
}
}
