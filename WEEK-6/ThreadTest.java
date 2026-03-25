class A extends Thread 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("\t From ThreadA:i="+i);
	    }
	System.out.println("Exit from A");
	}
}
class B extends Thread 
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
		System.out.println("\t From ThreadB:j="+j);
	    }
	System.out.println("Exit from B");
	}
}
class C extends Thread 
{
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
		System.out.println("\t From ThreadC:k="+k);
	    }
	System.out.println("Exit from C");
	}
}
class ThreadTest
{
	public static void main(String args[])
	{
		/*new A().start();
		new B().start();
		new C().start();
		*/
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		/*threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority);
		threadC.setPriority(Thread.MIN_PRIORITY);*/
		threadC.setPriority(10);
		threadB.setPriority(1);
		threadA.setPriority(2);
		threadA.start();
		threadB.start(); 
		threadC.start();
		}
}
