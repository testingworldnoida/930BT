package testing;

//(20*30)+100+200

public class Math {
	
	
	public void checkEvenOdd(int a)
	{
		if(a<0)
		{
			System.out.println("Negative Number");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}
		else if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("ODD");
		}
	
	}

}
