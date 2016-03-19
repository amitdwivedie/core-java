package com.amitdwivedie.core.basic.oops.Interface;

interface I0
{
 void show();
}

class A implements I0
{
 public void show()
  {
     System.out.println("show of interface of A");
  }
}

class B implements I0
{

 public void show()
 {
   System.out.println("show of interface of B");
 }
}

class InterfaceTest
{

public static void main(String g[])
{
 I0 ref=new A();
 ref.show();

 I0 ref1=new B();
 ref1.show();
}
}