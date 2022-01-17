package calc;
import java.util.*;

public class SimpleCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numeric value");
		String str1 = sc.nextLine();
		double n1 = Double.parseDouble(str1);
		
		System.out.println("Enter a numeric value");
		String str2 = sc.nextLine();
		double n2 = Double.parseDouble(str2);
		
		double res =0.0;
		
		System.out.println("Choose an operation");
		String op = sc.nextLine();
		
		switch(op) {
		  case "+": 
			  res=n1+n2;
			  System.out.println("Output: " + res);
               break;
		
		  case "-":
			  res=n1-n2;
			  System.out.println("Output: " + res);
			  break;
			  
		  case "*":
			  res=n1*n2;
			  System.out.println("Output: " + res);
			  break;
		
		  case "/":
			  res =n1/n2;
			  System.out.println("Output: " + res);
			  break;
		  
		  default:
			  System.out.println("Invalid Input");
		
		}
		
	

	}

}
