import java.util.*;
class  Char_stuffing
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr The charecters with a special symbol($): " );
		String original_Str=sc.nextLine();
		System.out.println("\nThe original charecters "+original_Str);
		String char_stuff=char_stuffing(original_Str);
		System.out.println("\nAfter charecter stuffing :"+char_stuff);
		String unchar_stuff=unchar_stuffing(char_stuff);
		System.out.println("\nAfter uncharecter stuffing :"+unchar_stuff);
	}
	public static String char_stuffing(String original_Str)
	{
		String char_stuff="";
		for (char i:original_Str.toCharArray() )
		{
			if ((('A'<=i)&&(i<='Z'))||(('a'<=i)&&(i<='z'))||(('0'<=i)&&(i<='9')))
			{
				char_stuff+=i;
			}
			else
			{
				char_stuff+=i;
				char_stuff+=i;
			}
		}
		return char_stuff;
	}
	public static String unchar_stuffing(String char_stuff)
	{
		String unchar_stuff="";
		int count=0;
		for (char i:char_stuff.toCharArray() )
		{
			if ((('A'<=i)&&(i<='Z'))||(('a'<=i)&&(i<='z'))||(('0'<=i)&&(i<='9')))
			{
				unchar_stuff+=i;
				count=0;
				
			}
			else
			{
				count++;
				if (count==2)
				{
					count=0;
				}
				else
				{
				unchar_stuff+=i;
				}
			}
			
		}
		return unchar_stuff;

	}
}
