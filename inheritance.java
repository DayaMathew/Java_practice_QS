import java.io.*;
import java.util.*;
class person
	{
		int age;
		String name;
		public void readperson()
		{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter name and age");
				name = s.nextLine();
				age =  s.nextInt();
		}
		public void dispperson()
		{
			System.out.println("name "+name);
			System.out.println("Age "+age);
		}
	}
class teacher extends person{
				String subj;
				public void readteacher()
				{
					Scanner s = new Scanner(System.in);
					System.out.println("enter  the subject");
					subj = s.nextLine();
				}
				public void dispteacher()
				{
					System.out.println("subject"+subj);
				}
			}

class inheritance{
			public static void main(String args[])
			{
				person p = new person();
				teacher t = new teacher();
				p.readperson();
				t.readperson();
				t.readteacher();
				p.dispperson();
				t.dispperson();
				t.dispteacher();
			}
}
					
					