package DAY3;

public class MULTITHREAD implements Runnable {
	  public void run() {
		for (int i=0;i<5;i++)
		{
			System.out.println("method"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    MULTITHREAD a= new MULTITHREAD();
	    
	    Thread b=new Thread(a);
		b.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
		}

	}

}
