package javabasicprograms;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m=0,Flag=0;
		int n=3;
		
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+ "not a prime number");
			}
			else {
				for(i=2;i<=m;i++) {
					if(n%i==0) {
						System.out.println(n+" is not prime number");      
					     Flag=1;      
					     break;      	
				}
			}
		
				 if(Flag==0)  
				 { System.out.println(n+" is prime number"); 
				 
				 }  
			  }	
			}
		
	
	
	
	}


