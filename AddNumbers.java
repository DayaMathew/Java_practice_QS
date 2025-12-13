import java.io.*;
class AddNumbers{
public static void main(String[]args){
if (args.length == 2) {
int num1 = Integer.parseInt(args[0]); int num2 = Integer.parseInt(args[1]);

int sum = num1 + num2;

System.out.println("Number 1: " + num1); System.out.println("Number 2: " + num2); System.out.println("Sum = " + sum);

} else {
System.out.println("Please provide two numbers as command line arguments."); System.out.println("Usage: java AddNumbers <number1> <number2>");
}
}
}
