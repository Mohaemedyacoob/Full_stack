package NumberPlay;
import java.util.Scanner;
public class NumberPlay 
{
	   private int number;

	public void setNumber(int number) 
	    {
	        this.number = number;
	    }

	    public int getDifference()
	    {
	        if (number > 50) {
	            int digit1 = number / 10;
	            int digit2 = number % 10;
	            return Math.abs(digit1 - digit2);
	        } 
	         else if (number <= 50 && number >= 10)
	         {
	            int reversedNumber = (number % 10) * 10 + (number / 10);
	            int digit1 = reversedNumber / 10;
	            int digit2 = reversedNumber % 10;
	            return Math.abs(digit1 - digit2);
	        }
	         else
	         {
	            System.out.println("Invalid number");
	            return -1;
	        }
	    }
	}
