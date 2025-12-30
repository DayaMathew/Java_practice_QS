public class interchange3{
	public static void main(String[]args)
	{
		int a=10,b=20;
		System.out.prinln("before swap a=" + a + "b=" = + b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swap a=" + a + "b=" = + b);
	}
}