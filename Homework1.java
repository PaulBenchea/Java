/// Write a Java program that prints the maximum value 
///from all the double numbers given as command-line parameters
public class Homework1 {


public static void main( String args[] ) {
	double maximum = -Double.MAX_VALUE;
	for(int i=0; i<args.length; i++){
		double x = Double.parseDouble(args[i]);
		if(x>maximum)
			maximum = x;
	}
    System.out.println(maximum);
   }
}