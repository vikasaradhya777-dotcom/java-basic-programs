package day2;
interface Atm3 {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class MULTIPLEINTERFACE implements Atm3,Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MULTIPLEINTERFACE v = new MULTIPLEINTERFACE();
		v.min();
		v.depo();
	}

}
