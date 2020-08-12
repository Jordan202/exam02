package Ex2;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Allocated Memory");
		int num = s.nextInt();
		try {
			

			if (num<=10000)
				throw new NumberTooSmallException ();
			
			if (num<0)
				throw new ZeroNumberException ();
			if (num>10000)
				throw new NumberTooLargeException  ();
		//System.out.println("not even");
		
	}catch(Exception ex) {
		System.err.println(ex.getMessage());
	}
	}

}
