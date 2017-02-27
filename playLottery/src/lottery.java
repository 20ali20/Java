import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;


public class lottery {
	public static void main(String [] args) 
	{
		int r_num1, r_num2, r_num3, r_num4, total_l, total_r, multiplie_l, multiplie_r;
		Random number= new Random();
		r_num1 = 10 + (int)(Math.random() * ((99 - 10) + 1));
		r_num2 = 10 + (int)(Math.random() * ((99 - 10) + 1));
		r_num3 = 10 + (int)(Math.random() * ((99 - 10) + 1));
		r_num4 = 10 + (int)(Math.random() * ((99 - 10) + 1));
		
		JOptionPane.showMessageDialog(null,"1. all in order = 10,000    2. all but not in order = $3000    3. only got one digit = $1000"," :P ", JOptionPane.PLAIN_MESSAGE  );		
		String lottery1 = JOptionPane.showInputDialog("First set of digits:");
		String lottery2 = JOptionPane.showInputDialog("Second set of digits:");
		String lottery3 = JOptionPane.showInputDialog("Third set of digits:");
		String lottery4 = JOptionPane.showInputDialog("Last set of digits:");
		
		int l1 = Integer.parseInt(lottery1);
		int l2 = Integer.parseInt(lottery2);
		int l3 = Integer.parseInt(lottery3);
		int l4 = Integer.parseInt(lottery4);
		
		total_l = l1+l2+l3+l4;
		total_r = r_num1+r_num2+r_num3+r_num4; 
		multiplie_l = l1*l2*l3*l4;
		multiplie_r = r_num1*r_num2*r_num3*r_num4; 

		{
		if ( l1 == r_num1 && l2 == r_num2 && l3 == r_num3 && l4 == r_num4)
			JOptionPane.showMessageDialog(null,"You won $10,000"," :) ", JOptionPane.PLAIN_MESSAGE  );
		
		
		else if  ( total_l == total_r && multiplie_l == multiplie_r  )
			
			JOptionPane.showMessageDialog(null,"You won $3000"," :) ", JOptionPane.PLAIN_MESSAGE  );
		
		else if (l1 == r_num1 || l1== r_num2 || l1 == r_num3 || l1 == r_num4 || 
				l2 == r_num1 || l2== r_num2 || l2 == r_num3 || l2 == r_num4  ||
				l3 == r_num1 || l3== r_num2 || l3 == r_num3 || l3 == r_num4  ||
				l4 == r_num1 || l4== r_num2 || l4 == r_num3 || l4 == r_num4  )
			
			JOptionPane.showMessageDialog(null,"You won $1000"," :) ", JOptionPane.PLAIN_MESSAGE  );
		
		
		else
			JOptionPane.showMessageDialog(null,"You did not win anything today!"," :( ", JOptionPane.PLAIN_MESSAGE  );


		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
