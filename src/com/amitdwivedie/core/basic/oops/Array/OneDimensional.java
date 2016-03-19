package com.amitdwivedie.core.basic.oops.Array;


class OneDimensional
{
   public static void main(String g[])
	{
		int a[]=new int[10];

		for(int i=0;i<10;i++)
		{
			System.out.println("i"+" is:---> "+i);
			System.out.println("a["+i+"]"+" is:---> "+a[i]);
		}

		char b[];
		b=new char[10];


		for(char j=0;j<8;j++)
		for(int k=0;k<10;k++)
		{
            System.out.println("k"+" is:---> "+j +":::" +k);
			System.out.println("b["+k+"]"+" is:---> "+b[j]);
		}

		int c[]={10,20,30,40,50};
		for(int i=0;i<5;i++)
		{
			System.out.println("c["+i+"]"+" is:---> "+c[i]);
		}

	}
}