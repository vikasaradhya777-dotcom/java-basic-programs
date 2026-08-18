package day2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public void depo()
	{
		System.out.println("Depos");
	}
	}

public class INTERFACE extends Abc{
	public	void with()
	{
		System.out.println("With");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INTERFACE   v = new INTERFACE();
		v.depo();
		v.with();
	}
	
	}


