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

public class Main 
     {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a two-digit integer: ");
	        int input = scanner.nextInt();
	        scanner.close();

	        if (input >= 10 && input <= 99)
	        {
	            NumberPlay kevinSolver = new NumberPlay();
	            kevinSolver.setNumber(input);
	            int difference = kevinSolver.getDifference();
	            if (difference != -1) 
	            {
	                System.out.println("Difference between digits: " + difference);
	          
	            } 
	        else 
	          {
	            System.out.println("Invalid number");
	          }
	        }
	     }
     }

OUTPUT:
Enter a two-digit integer: 23
Difference between digits: 1

Enter a two-digit integer: 34
Difference between digits: 1


