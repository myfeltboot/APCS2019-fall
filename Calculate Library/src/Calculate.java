//Alice Peterson
//August 29, 2019
//Library of math functions
public class Calculate {
//Part 1
//a call to square, returns the square of the value passed
	public static int square(int a) {
		int answer;
		answer = a*a;
		return answer;
	}
//a call to cube, returns the cube value passed
	public static int cube(int a) {
		int answer;
		answer = a*a*a;
		return answer;
	}
//a call to average, returns the average of the values passed, overload method
	public static double average(double a,double b) {
		double answer;
		answer = (a*b)/2;
		return answer;
	}
//a call to average, returns the average of the three values passed, overload method
	public static double average(double a, double b, double c) {
		double answer;
		answer = (a*b*c)/3;
		return answer;
	}
//a call to toDegrees, converts an angle measure from radians into degrees
	public static double toDegrees(double number) {
		double answer;
		answer = number*(180/3.14159);
		return answer;
	}
//a call to toRadian, converts an angle measure from degrees into radians
	public static double toRaidian(double a) {
		double answer;
		answer = a*(3.14159/180);
		return answer;
	}
//a call to discriminant, provides coefficients of a quadratic equation in standard form and returns discriminant
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b*b)-(4*a*c);
		return answer;
	}
//a call to toImproperFrac, converts mixed number into an improper frac
	public static void toImproperFrac (int whole, int numer, int denom) { 
		int answer = (denom*whole)+numer;
		System.out.println(answer"/"denom);
	}
//a call toMixedNum, converts a improper frac into a mixed number
	public static void toMixedNum (int numer, int denom) {
		int answer = (numer/denom);
		System.out.println(answer%denom);
	}
//a call to foil, converts binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation
	public static void foil (int a, int b, int c, int d) {
		
	}

//Part 2 
//a call to isDivisibleBy, determine whether or not one integer is evenly divisible by another
	public static boolean toDivisibleBy (int a,int b) {
		boolean divis = false;
		if(a%b==0) {
			divis=true;
		}
		return divis;}
		
//a call to absValue, returns the abolute number of the values passed
		public static double absValue (double a) {
			if(a) {
			
		}
//a call to max, returns the larger of two values passed, overload
	public static double max (double a, double b) {
			if(a>b) {
				return a;
			}else { 
				return b;
				}
			}
//a call to max, returns the larger of 3 values passed, overload
	public static double max (double c, double d, double e) {
			
			}
//a call to min, returns smaller of two values passed
	public static int min (int a, int b) {
			if(a<b) {
				return a;
			}else {
				return b; 
			}
		}
//a call to round2, rounds variable correctly to two decimal places
	public static double round2 (double a) {
		(a*100);
	}
}
	

//Part 3
//a call to exponent, raises value of a positive integer power
		
	

