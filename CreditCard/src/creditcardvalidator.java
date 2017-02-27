import java.util.Scanner;
 



public class creditcardvalidator 


{
 
public static void main(String[] args) 

{
 

Scanner input = new Scanner(System.in);
 

System.out.println("\n\nPlease Enter Your Credit Card number: ");

long card_number= input.nextLong();
 
int size= 16;
 


long[] array = new long[size];
 

for (int i = 0; i < array.length; i++)
{
System.out.println("\n"+i);
 
 
long card_array = card_number; 
 
while(card_array !=0)
{
int card_array1 = (int)card_array%10;
array[i] = card_array;
card_array=card_array/10; 
 
}
System.out.println(array[i]);
}

 
 
if (array[15] == 4)
{
System.out.println("\nCredit Card is : Visa Card.");
}
 
else if (array[15] == 5)
{
System.out.println("\nCredit Card is : Master Card.");
}
 
else if (array[15] == 3 && array[14] == 7)
{
System.out.println("\nCredit Card is : American Express Card.");
}
 
else if (array[15] == 6)
{
System.out.println("\nCredit Card is : Discover Card.");
}
 
else
{
System.out.println("\nInvalid Credit Card!");
}
 
 
// Step One






long sum_even = 0;
for (int i = 16; i >= 0; i=i-2)
	{
	
	long card_array_store = array[i];
	long double_v = card_array_store * 2;
 
if (double_v >= 10 )
	{
	double_v = 1+( (double_v)-10 );
	sum_even = sum_even + double_v;

	}
 
else
	{
	sum_even = sum_even + double_v;
	} 
	}
 
long sum_odd = 0;
for (int i = 15; i >=0; i=i-2)
	{
	long card_array_store2 = array[i];
	sum_odd = sum_odd + card_array_store2; 
	}
 

long sum_total = sum_odd + sum_even;
 
if (sum_total%10 == 0)
	{
	System.out.println("\nYour credit card is valid."); 
	}
 
else
	{
	System.out.println("\nYour credit card is invalid."); 
	}

	}
	}