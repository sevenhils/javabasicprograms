package javabasicprograms;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=656468,r=0;
		while(number!=0) {
			int remainder=number %  10;
			r=r* 10+remainder;
			number=number/10;
		}
			System.out.println("reverese number:"  +r);
		}
		
		
		
		
	}


