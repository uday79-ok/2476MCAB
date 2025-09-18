import java.io.FileNotFoundException;                                                 
import java.util.Scanner;
import java.io.File;
class Handling
{
	public static void main(String[] args) 
	{
		menu();
	}
	static void menu() 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println(" Menu: Exceptions in Java : ");
			System.out.println("1. Unchecked Exceptions");
			System.out.println("2. checked Exceptions");
			System.out.println("3.Exit From the Menu");
			System.out.println("Enter a Choice");
			int choice = scn.nextInt();
				switch(choice)
				{
				case 1:
					unchecked();
					break;
				case 2:
					checked();
				    break;
				case 3:
					System.out.println("Exit From the Menu GoodBye....!!");
					System.exit(0);
					break;
				default:
					System.out.println("Option Invalid,Please Select Valid Option");
					break;
				 }
		}
	}

	static void unchecked() 
	{
		Scanner scn=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Choose the Checked Exceptions from the following");
		System.out.println("1.FileNotFoundException");
		System.out.println("2.IO InterrupedException");
		System.out.println("3.Back to main Menu");
		int ch = scn.nextInt();
			switch(ch)
			{
			case 1:
				try{
				    File f=new File("M:\\Java.txt\\");
					Scanner s=new Scanner(f);
					 String x=s.nextLine();
					System.out.println("File is Created Sucessfully"+x);
					}
				catch(FileNotFoundException e)
				{
					System.out.println("File is already created");
					System.out.println("FileNotFoundException handled");
				}
			break;

			case 2:
				try
				{
				for (int i=0; i<=5;i++ )
					{
						System.out.println("Thread "+i);
						Thread.sleep(4500);
					}
					System.out.println("InterruptedException handled");
					
				}
				catch (InterruptedException e)
				{
					System.out.println(e);
				}

			break;

			case 3:
	    			menu();
	    			break;
	    	    default:
	    	    	System.out.println("Select Valid Option");
	    	    	break; 
	    		}
		
		}
	}

		static void checked()
		{
			Scanner scn=new Scanner(System.in);

			while(true)
			{
		System.out.println("Choose the unchecked Exceptions from the following");
		System.out.println("1.Arithmetic Exception");
		System.out.println("2.ArrayIndexOutOfBounds Exception");
		System.out.println("3.NullPointer Exception");
                System.out.println("4.StringIndexOutOfBounds Exception");
		System.out.println("5.Back to main Menu");
		int ch = scn.nextInt();
			switch(ch)
			{
			case 1:
				try{
					int a=10;
					System.out.println(a/0);
					}
				catch(ArithmeticException e)
				{
					System.out.println("cannot be divide by zero");
					System.out.println("ArithmeticException handled");
				}
			break;

			case 2:
				try
				{
					int[]a={10,20,30};

					System.out.println(a[10]);
					
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println(" ArrayIndexOutOfBoundsException handled");
				}

			break;

			case 3:
					try
				{
					int[] s=null;
					System.out.println(s[0]);
					
				}
				catch (NullPointerException e)
				{
					System.out.println("NullPointerException handled");
				}
                         

			break;
                        case 4:
                     try
                     {
                         String str="uday kiran";
                         System.out.println(str.charAt(10));
                         }
                        catch(StringIndexOutOfBounds Exception  abcdf)
                        {
                       System.out.println(abcdf);
                       System.out.println("StringIndexOutOfBounds Exception completed");  
                        }
                        
			case 5:
	    			menu();
	    			break;
	    	    default:
	    	    	System.out.println("Select Valid Option");
	    	    	break; 
	    		}
			
			
		}
			
	}
}

