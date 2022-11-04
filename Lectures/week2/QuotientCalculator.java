public class QuotientCalculator{
		/*
		1. Get two arguments from command line
		2. convert them into an integer
		3. store in two variables
		4. sum those two variables
		5. Store the sum in the third variables
		6. Print the quotient
		*/
  public static void main(String[] args) {
		int firstValue =0 ; //declaration & variable initialization
		int secondValue =0; 
		double quotient = 0;
		firstValue =  Integer.parseInt(args[0]);
		secondValue = Integer.parseInt(args[1]);
		quotient = (double) firstValue / secondValue; //explicit casting int/int = int
		System.out.println("The quotient of the two numbers is");
		System.out.println(quotient);
		
  }
}
