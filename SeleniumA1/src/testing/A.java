package testing;

public class A {

	public A(int x)
	{
		System.out.println(x);
		System.out.println("This is Cons");
	}
	
	public A()
	{
		
		System.out.println("This is Cons");
	}
	
	
	public void hello()
	{
		System.out.println("HELLO");
	}
	
	public void sum(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	public int sub(int a, int b)
	{
		int c=a-b;
        return c;		
	}
	
}
