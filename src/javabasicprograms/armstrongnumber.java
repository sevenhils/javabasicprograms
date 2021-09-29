package javabasicprograms;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0,temp;
		int n=153;

		temp=n;

		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		if(temp==sum)	{
				System.out.println("armstrong");
			}
		else {
			System.out.println("not a armstrong");
		}

		}
	
	
	}


