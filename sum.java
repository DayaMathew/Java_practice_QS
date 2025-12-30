public class sum
{
	public static void main(String[] args)
	{
	try
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println("sum of" +a+ "and" +b+ "is" +sum);
	}
	catch(Exception e)
	{
		System.out.println("error"+e);
	}
	}
}