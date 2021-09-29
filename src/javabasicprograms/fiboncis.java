package javabasicprograms;

public class fiboncis {
	
public static void main(String[] args) {
	
	int sum=10; int a=0 ;int b=1 ;int n;
	System.out.print(a+""+b);
	
	for(int i=2;i<sum;i++) {
		
		n=a+b;
		System.out.print(""  +n);

		a=b;
		b=n;
		
	}
	
}

}
