package User;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch 
{
	Timer timer;
	public Stopwatch(long seconds)
	{
		timer = new Timer();
		timer.schedule(new Stopwatchtask(), seconds*5000);
	}
	class Stopwatchtask extends TimerTask
	{
	
		@Override
		public void run() 
		{
			while(true)
			{
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println("Time's Up: "+dtf.format(now));
				//timer.cancel();	
				break;
			}			
		}		
	}
	
	  public static void main(String[] args) throws Exception 
	  {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");  
		  LocalDateTime now = LocalDateTime.now();  
		  new Stopwatch(5);
		  System.out.println("Quiz Started: "+dtf.format(now));		  
	}
}
