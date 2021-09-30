package com.demoAbstract;

interface sum
{
int sm=90;
void suma();
}
interface add
{
int ad=89;
void adda();
}
class A1 implements add ,sum
{
public void suma()
{
System.out.println(+sm);
}
public void adda()
{
System.out.println(+ad);
}
public static void main(String arr[])
{
A1 n= new A1();
n.suma();
n.adda();
}	
}
