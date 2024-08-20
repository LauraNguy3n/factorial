package factorial;

public class Factorial {

	public static void main(String[] args) { //void stands for no return
		
		//n=6!= 6*5*4*3*2*1 = current number*(factorial of it's previous number)
		//	6!	=6* 5! =6* 5*4*3*2*1
			
		//	!= factorial
		
		System.out.println(factorial(5)); //4!= 4*3*2*1= 24 //we pass "Factorial" to 4
	}
		
		public static int factorial (int n) { //new method or function. We have no void so we need to return.
				if (n==1) {
					return 1;
				}
		
				else {
					return n*factorial(n-1);	
		}	

	}

}
 