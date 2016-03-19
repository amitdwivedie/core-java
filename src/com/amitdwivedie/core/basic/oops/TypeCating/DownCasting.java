package com.amitdwivedie.core.basic.oops.TypeCating;

class A1
{
	static void show()
	{
		System.out.println("SHOW OF A1");
	}
	void disp()
	{
		System.out.println("DISP of A1");
	}
}

class B1 extends A1
{
	static void show()
	{
	  System.out.println("SHOW OF B1");
	}
	void disp()
	{
		System.out.println("DISP OF B1");
	}
}

class DownCasting
{
	public static void main(String g[])
	{
		B1 bb=new B1();
		((A1)bb).show();
		bb.disp();

		/*B1 a=(B1)new A1();
		//B1 b=(B1)a;
		a.show();*/


	}
}
