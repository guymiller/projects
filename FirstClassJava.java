public class FirstClassJava {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("blah blah blah");
		System.out.println();    // syso + control + space
		
		//Datatypes - can't use decimal numbers 
		
		int i=100;               // int uses 32 bit
		System.out.println(i);
		i=1000;
		System.out.println(i);
		
		long z=1992;             // long uses 64 bit - used for when int can't contain the given value.
		
		
		double e=123214.123213;  // to use decimal number.
		
		char c='w';              // can use only one character at a time c='w421'; wont work.
		boolean b=true;          // can take only true or false values.

				
//				Conditional Operators
//				*********************
//				The result of every comparison is boolean (true or false).
//				operator 	meaning
//				<	less than
//				<=	less than or equal to
//				==	equal to
//				>=	greater than or equal to
//				>	greater than
//				!=	not equal
//				Common Errors
//				0 < x < 100
//				Comparison operators can be used with two numbers. Although you can write 0 < x < 100 in mathematics, it is illegal in Java. You must write this as the and of two comparisons: 
//				    0<x && x<100
//				= instead of ==
//				Using the assignment operator instead of equality will produce a compiler error, which is easy to fix.
//				== with floating-point
//				Because floating-point numbers are not exact, you should always use >= or <= instead of ==. For example, because the decimal number 0.1 can not be represented exactly in binary, (0.1 + 0.1 + 0.1) is not equal to 0.3!
		
				
		System.out.println(2>1);  //return result in boolean and its true
		System.out.println(2>11); //return result in boolean and its false
		
		if(true) {                   // instead of writting true I can write 9>2
		System.out.println("pass");
		}
		
		
		int x=100;
		int y=200;
		
		if(x>y) {
			System.out.println("X is the greatest" + x);
		}else{
			System.out.println("Y is the greatest" + y);
			
		}
		
		
		//practice - find the greatest number of all
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		if(a1>b1 & a1>c1){
			System.out.println("a1 is the winner" +a1);
		}else if(b1>c1){
			System.out.println("b1 is the winner" +b1);
		}else{
			System.out.println("c1 is the winner" +c1);
		}
		
		
		
		//String is not a datatype, its a in-build (pre-defined) class and that is why typing String does't change color. 
		String str ="blah blah blah";
		
		
		
		
	}

}
