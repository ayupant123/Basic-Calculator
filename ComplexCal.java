package calc;
import java.util.*;

public class ComplexCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter input2: ");
		String str2 = sc.nextLine();
		
		System.out.println("Choose an operation (+ - * /):");
		String str3 = sc.nextLine();
		
		double res =0 ;
		
		try {
			switch(str3) {
			case "+":
				res = addition(str1,str2);
				break;
			
			case "-":
				res = subtraction(str1,str2);
				break;
			case "*":
				res = multiplication(str1,str2);
				break;
			case "/":
				res = division(str1,str2);
				break;
			default:
				System.out.println("Unrecognized operation!");
			    return;
			}
			System.out.println("The answer is: " + res);
		}
		
		catch(Exception e){
			System.out.println("Number formatting exception" + e.getMessage());
		}
		
		
	}
	
	public static double addition(String s1 , String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1+d2;
	}
	public static double subtraction(String s1 , String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1-d2;
	}
	
	public static double multiplication(String s1 , String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1*d2;
	}
	public static double division(String s1 , String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1/d2;
	}

}








