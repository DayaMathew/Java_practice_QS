public class displaynum
{	
	public static void main(String[] args)
	{
		try
		{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
		
			System.out.println("First number"+num1);
			System.out.println("second number"+num2);
		}
		catch(Exception e)
		{
			System.out.println("please provide two numbers");
		}
	}
}
		