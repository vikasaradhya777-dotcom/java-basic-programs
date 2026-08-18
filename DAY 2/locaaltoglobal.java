package day2;

public class locaaltoglobal {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		locaaltoglobal  vv = new locaaltoglobal ();
		vv.m1(4,3);
		vv.m2();

	}

}
