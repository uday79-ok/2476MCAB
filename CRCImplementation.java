import java.util.*;
public class CRCImplementation
{
	public static String xor(String a,String b)
	{
		StringBuilder result=new StringBuilder();
		for(int i=0;i<b.length();i++)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				result.append("0");
			}
			else
			{
				result.append("1");
			}
		}
			return result.toString();
	}
	public static String crcDivide(String data,String polynomial)
	{
		int m=polynomial.length();
		int n=data.length();
		String paddedData=data+ "0".repeat(m-1);
		String remainder=paddedData.substring(0,m);
		for(int i=m;i<=n+m-2;i++)
		{
			if(remainder.charAt(0)=='1')
			{
				remainder=xor(remainder,polynomial)+paddedData.charAt(i);
			}
			else
			{
				remainder=xor(remainder,"0".repeat(m))+paddedData.charAt(i);
			}
			remainder=remainder.substring(1);
		}
		if(remainder.charAt(0)=='1')
		{
			remainder=xor(remainder,polynomial);
		}
		return remainder.substring(1,m);
}
public static String calculateCRC(String data,String polynomial)
	{
	  return crcDivide(data,polynomial);
	}
public static boolean checkCRC(String data,String polynomial)
	{
	String remainder=crcDivide(data,polynomial);
	return remainder.equals("0".repeat(polynomial.length()-1));
	}
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the binary data:");
	String data=sc.nextLine();
    System.out.println("enter the CRC polynomial (binary) :");
	String polynomial=sc.nextLine();
	String crc=calculateCRC(data,polynomial);
    System.out.println("CRC Code : " +crc);
	String datawithCRC=data+crc;
	System.out.println("Data with CRC :"+datawithCRC);
	if(checkCRC(datawithCRC,polynomial))
		{
		System.out.println("Data received correctly(no errors detected)");
		}
		else
		{
			System.out.println("Data received with errors");
		}
	}
}

