import java.util.Scanner;

/*
 * CreditCardPayOff.java
 * Author:Jesse Eldell
 * Submission Date: January 31st 2017
 * 
 * Purpose: I have to apply my knowledge
 * of variable assignments and basic algorithm. I have to
 * figure out how many months it would take me to pay a debt. I have to compute
 * the total amount paid to the credit card company, along with
 * the total amount of interest paid over payment. 
 */




import java.util.Scanner;

public class CreditCardPayOff {
  
	public static void main(String[] args) {
       /*                                   annualInteresRate
        ln(monthlyPayment)-ln(monthlyPayment----------------- x principal)
                                                1200.0
       ----------------------------------------------------------------------
                            ln(annualInterestRate    + 1.00)
                               ------------------    
                                      1200.0


*/
	System.out.println("Input the principal amount");
      
	   Scanner scan=new Scanner (System.in);
		
	   double principal=scan.nextDouble();
	
	   System.out.println("Input the Annual Interest Rate");
        
	      double air=scan.nextDouble();
    
	      System.out.println("Input the Monthly Payment");
       
	   double mpt=scan.nextDouble();
       
	   /* mpt=Monthly Payment
         * air=Annual Interest Rates
         * mntpf=Months Needed To Pay Off
         * mtf=Months Needed To Pay Off (Rounded)
         * tap=Total Amount Paid
         * tip=Total Interest Paid
         * op=OverPayment
         */
   
	   double A=Math.log(mpt);
		   
  double a= (air/1200.0);
		
     double ab= a*principal;
				
		double b=mpt-ab;
		   
				double B= A-Math.log(b);
 
		double c=Math.log(a+1.0);
		
      double mntpf=B/c;
 
    double mtf = Math.ceil(mntpf);
 		
      System.out.printf("Months Needed To Pay Off: %2.0f"+"\n", mtf);
 	
      double tap=Math.ceil(mtf)*mpt;
 	    
 	
 	     System.out.printf("Total Amount Paid: \t  $%5.2f"+"\n", tap);
 	
 	  double tip= tap-principal; 
 	    
 	     System.out.printf("Total Interest Paid: \t  $%5.2f"+"\n", tip);
 	   
 	     /* Floating point --> Actual version of mntpf
 	     * Integer point --> Rounded version of mntpf
 	     * The hint explains that the algorithm uses both floating and integer points
 	     * for the months needed to pay off. Those points are the results of the long
 	     * formula above to solve for the mntpf with and without the Math.ceil command
 	     * So the floating point has decimals while the integer point is more absolute
 	     */
 
 	      double d=mntpf*mpt;
 	     
 	   double op= tap-d;
 	    
 	   
 	   System.out.printf("Overpayment: \t\t  $%2.2f", op);
 	    
 		
 		
 
 		
	}
}
