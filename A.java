class A{
	final int x;
	A()
	{
		x=10;
	}
	A(int a)
	{
		x=a;
	}
	void show()
	{
		System.out.println("class a");
	}
}
class demo{
	public static void main(String ar[])
	{
		A a=new A();
		a.show();
		A a1=new A(10);
		a.show();
	}
}