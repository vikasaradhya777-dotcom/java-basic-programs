package day2;

public class samevariable {
	int a = 20;
	int b = 10;

	void m1(int a,int b ) {
		System.out.println("asdfas"+(this.a+this.b));

		System.out.println("dfasdf "+(a+b));
//		System.out.println("dfasdf "+(c+d));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samevariable vv = new samevariable();
		vv.m1(4,3);
	}

	}

}
