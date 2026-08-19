package DAY3;

public class DEADLOCK {
	synchronized void m1(DEADLOCK D) {
		System.out.println(Thread.currentThread().getName()+"enteredm1");
		try {Thread.sleep(1000);	
		}
		catch( InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"waiting for m2");
		D.m2();
	}
	synchronized void m2() {
		System.out.println(Thread.currentThread().getName()+"enteredm2");
	 try {Thread.sleep(1000);	
	}
	catch( InterruptedException e){
		e.printStackTrace();
	}
	}
public class vikas{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEADLOCK D1 =new DEADLOCK();
		DEADLOCK D2 =new DEADLOCK();
		Thread t1 =new Thread(() ->{D1.m1(D2);},"Thread1");
		Thread t2 =new Thread(() ->{D2.m1(D1);},"Thread2");
		t1.start();
		t2.start();
	}

}

