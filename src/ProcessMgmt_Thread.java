
public class ProcessMgmt_Thread
{
	public static void main(String args[]) 	
	{		
		T_IOProcess iop1	= new T_IOProcess("thread01");
		T_IOProcess iop2	= new T_IOProcess("thread02");
		T_IOProcess iop3	= new T_IOProcess("thread03");
		
		System.out.printf("3 threads created\n");
		
		try
		{
			iop1.thread_xy.join();
			iop2.thread_xy.join();
			iop3.thread_xy.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("I/O completed\n");
		}
		
//		try
//		{
//			while(iop1.thread_xy.isAlive() || iop2.thread_xy.isAlive() || iop3.thread_xy.isAlive())
//			
//			{
//				System.out.printf	("waiting on the I/O\n");
//				Thread.sleep(250);
//			}
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("I/O completed\n");
//		}
		
		System.out.println("main done\n");
	}
}