import java.util.Random ; 

public class T_IOProcess implements Runnable 
{
	
	Random random__X	= new Random();
	Thread thread_xy ;
	String threadname ;
	
	T_IOProcess(String s1)
	{
		threadname	= s1 ;
		thread_xy	= new Thread	(this
									,threadname
									);
		thread_xy.start();
		System.out.printf("\t>>> thread %s created\n", threadname);
	}
	
	public void run()
	{
		int loop__T	= 10 + random__X.nextInt(50);
		
		System.out.printf("\t>>> %s initiated: iterate for %d\n"
				,threadname
				,loop__T
				);
		try
		{
			for (int ii=0; ii<loop__T; ii++)
			{
				Thread.sleep(random__X.nextInt(50));
				System.out.printf("\t>>> %s running %d of %d iterations\n"
						,threadname
						,ii
						,loop__T);
			}
			System.out.printf("\t\t>>> %s ended\n"
					,threadname
					);
		}
		catch	(InterruptedException e)
		{
			System.out.printf("\t\t>>> %s ended\t<<<"
					,threadname
					);
		}
	}
}
