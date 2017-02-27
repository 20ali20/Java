import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.Random;

public class Guess {
	public static void main(String [] args) 
	{
		int r_num, g_num;
		
		Random number= new Random();
		
		r_num = number.nextInt(1000);
		
		System.out.println("My Name is Ali Mojarrad ( 1330132) and this is CS55 assignment.");
		
		Scanner input= new Scanner(System.in);
		System.out.println("guess a number between 0 and 1000 :)");
		
		g_num = input.nextInt();
		
		
		
		while (g_num != r_num)
		{
		
			{ if (g_num > r_num)
			System.out.println("Guess lower");
		else 
			System.out.println("Guess higher");
			}
			
			g_num = input.nextInt();
		
		}
		System.out.println("Correct!!!");

	}
		
		
	}


