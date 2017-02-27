import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;



public class dice {
	public static void main(String [] args) 
	{
		String bet = JOptionPane.showInputDialog("Enter your Bet!!!");
		
		int number1, number2, sum ;
		int b_number = Integer.parseInt(bet);
		Random dice = new Random();
		
		System.out.println("My Name is Ali Mojarrad ( 1330132) and this is CS55 assignment.");
		number1 = dice.nextInt(6)+1;
		number2 = dice.nextInt(6)+1;
		
		sum = number1 + number2;
		
		if ( sum == 7 || sum ==11 )
		{
			b_number = b_number * 3;
			JOptionPane.showMessageDialog(null,"You won $"+ b_number," :) ", JOptionPane.PLAIN_MESSAGE  );
			
		}
		else 
			JOptionPane.showMessageDialog(null,"You Lost this time :( ."," :( ", JOptionPane.PLAIN_MESSAGE  );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
