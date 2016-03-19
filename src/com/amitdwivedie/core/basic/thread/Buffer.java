package com.amitdwivedie.core.basic.thread;

class Buffer
{
	int item;
	boolean written=false;

	public synchronized void produce(int i)
	{
		if(written==true)
		{
			try
			{
				this.wait();

			}
			catch(Exception e)
			{}
		}
		item=i;

		System.out.println(item+" : is going to produce ");
		written=true;
		System.out.println(item +" : is produced ");
		this.notify();
	}

	public synchronized void consume()
	{
		if(written==false)
		{
			try
			{
				this.wait();

			}
			catch(Exception e)
			{}
		}
		System.out.println(item+" : is going to consumed ");
		System.out.println(item+" : is consumed ");
		written=false;
		this.notify();
	}
}