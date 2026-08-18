package day2;

public class getandset {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

 public class gut extends getandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gut test = new gut();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);

	}

}
