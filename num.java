import java.util.Scanner;
class  CLA{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("---- MENU BASED CALCULATOR ----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
	
		if(choice == 5)
		{
			System.ont.println("exitig");
			return;
		}
		System.out.println("enter first num");
		double num1 = sc.nextInt();
		System.out.println("enter sec num");
		double num2 = sc.nextInt();
		switch(choice){
			case 1:
				result = num1 + num2;
				System.out.println("result=" + result);
				break;
			 case 2:
               			 result = num1 - num2;
                		System.out.println("Result = " + result);
               			 break;

            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
	case 4:
         
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                
                	break;
	
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}