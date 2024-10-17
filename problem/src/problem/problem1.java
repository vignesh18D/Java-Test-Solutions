package problem;

import java.util.Scanner;

public class problem1 {
	public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a,double b) {
    	return a-b;
    }
    public double mul(double a,double b) {
    	return a*b;
    }
    public Double div(double a,double b) {
    	if (b == 0) {
            System.out.println("Error: Division by zero");
            return null; 
        }
    	 return a / b;
    }

    public Double calculate(double a, double b, String process) {
    	switch(process.toLowerCase()) {
    	case "addition":
    		return add(a,b);
    	
    	case "subraction":
    		return sub(a,b);
    	
    	case "multiplication":
    		return mul(a,b);
    		
    	case "division":
    		return div(a,b);
    		
    	 default:
             System.out.println("Error: Unknown operation");
             return null;
    	}
    	
    		
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a=sc.nextDouble();
		System.out.print("Enter second number: ");
		double b=sc.nextDouble();
		System.out.print("Enter type of operation (addition, subtraction, multiplication, division): ");
		String process=sc.next();
		
		problem1 calculator = new problem1();
        Double result = calculator.calculate(a, b, process); 
        
        if (result != null) {
            System.out.println("Result: " + result);
        }
        
	    
	}

}
