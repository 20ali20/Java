import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.lang.Math;

public class payment {

	public static void main(String [] args)
	{
		Double rate, month, year, principle, m_payment, t_payment, interest;
		Scanner input=new Scanner(System.in);
		
		System.out.println("My Name is Ali Mojarrad ( 1330132) and this is CS55 assignment.");

	
		System.out.println("Please Enter the rate:");
		rate = input.nextDouble();
		System.out.println("Please Enter the number of years:");
		year = input.nextDouble();
		System.out.println("Please Enter the Principle:");
		principle = input.nextDouble();
		
		month = year * 12;
		rate = rate /1200;
		
		m_payment = (        rate +   (     rate    /   (Math.pow( (1+rate),month ) -1)     )         ) * principle;
		
		t_payment = m_payment * month ; 
		interest = t_payment - principle;
		
		
		
		System.out.println("Monthly payment:" + m_payment);
		System.out.println("Total payment :" + t_payment);
		System.out.println("Interest: "+ interest);
		
		
	}
}
